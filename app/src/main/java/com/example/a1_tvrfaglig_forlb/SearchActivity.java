package com.example.a1_tvrfaglig_forlb;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class SearchActivity extends AppCompatActivity {

    public static ArrayList<Clothing> clothingList = new ArrayList<Clothing>();

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        setUpData();
        setUpList();
        setUpOnClickListener();
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

                ClothingBox clothingBox = new ClothingBox(getApplicationContext(), 0, filteredClothing);
                listView.setAdapter(clothingBox);

                return false;

            }
        }
     );
    }

    private void setUpData() {

        Clothing website1 = new Clothing("Carhartt grey",500,"Seller.com",R.drawable.ic_launcher_background,true, true);
        clothingList.add(website1);
        Clothing website2 = new Clothing("Carhartt grey",600,"ReSeller.com",R.drawable.ic_launcher_background,true, false);
        clothingList.add(website2);

        Clothing website3 = new Clothing("Carhartt grey",499,"gethoodies.com",R.drawable.ic_launcher_background,false, true);
        clothingList.add(website3);

        Clothing website4 = new Clothing("Carhartt grey",450,"getthisstreet.com",R.drawable.ic_launcher_background,false, true);
        clothingList.add(website4);

    }

    private void setUpList(){
        listView = (ListView) findViewById(R.id.clothingListView);

        ClothingBox box = new ClothingBox(getApplicationContext(), 0, clothingList);
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



