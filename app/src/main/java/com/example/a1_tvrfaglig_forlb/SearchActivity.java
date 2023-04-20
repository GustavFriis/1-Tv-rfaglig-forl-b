package com.example.a1_tvrfaglig_forlb;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


public class SearchActivity extends AppCompatActivity {

    public static ArrayList<Clothing> clothingList = new ArrayList<Clothing>();

    public ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        setUpData();
        setUpList();
        setUpOnClickListener();
        initSearchWidgets();
    }

    private void initSearchWidgets()
    {
        SearchView searchView = (SearchView) findViewById(R.id.search_view);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener(){
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {

                ArrayList<Clothing> filteredClothing = new ArrayList<Clothing>();
                for (Clothing clothing: clothingList)
                {
                    if(clothing.getName().toLowerCase().contains(s.toLowerCase())){
                        filteredClothing.add(clothing);
                    }
                }

                ClothingAdapter clothingAdapter = new ClothingAdapter(getApplicationContext(), 0, filteredClothing);
                listView.setAdapter(clothingAdapter);

                return false;

            }
        }
     );
    }

    private void setUpData() {

        Clothing website1 = new Clothing("Carhartt Grey",500,"Seller.com",R.drawable.ic_launcher_background,true, true);
        clothingList.add(website1);
        Clothing website2 = new Clothing("Nike Air Force 1",600,"ReSeller.com",R.drawable.ic_launcher_background,true, false);
        clothingList.add(website2);

        Clothing website3 = new Clothing("Adidas Sweatpants Black",499,"getz.com",R.drawable.ic_launcher_background,false, true);
        clothingList.add(website3);

        Clothing website4 = new Clothing("Carhartt Grey",450,"getthisstreet.com",R.drawable.ic_launcher_background,true, true);
        clothingList.add(website4);


    }

    private void setUpList(){
        listView = (ListView) findViewById(R.id.clothingListView);

        ClothingAdapter box = new ClothingAdapter(getApplicationContext(), 0, clothingList);
        listView.setAdapter(box);
    }



    private void setUpOnClickListener(){
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Clothing selectClothing = (Clothing) (listView.getItemAtPosition(position));
                Intent showDetail = new Intent(getApplicationContext(), ClothingDetails.class);
                showDetail.putExtra("website", selectClothing.getWebsite());
                startActivity(showDetail);
            }
        });
    }
}



