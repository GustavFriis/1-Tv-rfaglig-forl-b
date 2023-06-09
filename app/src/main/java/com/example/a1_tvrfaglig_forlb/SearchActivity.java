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

    //David, Abdul, Gustav
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        setUpData();
        setUpList();
        listView.setVisibility(View.GONE);
        setUpOnClickListener();
        initSearchWidgets();
    }

    //David, Abdul, Gustav
    private void initSearchWidgets()
    {
        SearchView searchView = (SearchView) findViewById(R.id.search_view);

        //David, Abdul, Gustav
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener(){
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            //David, Abdul, Gustav
            @Override
            public boolean onQueryTextChange(String s) {

                ArrayList<Clothing> filteredClothing = new ArrayList<Clothing>();
                for (Clothing clothing: clothingList)
                {
                    if(clothing.getName().toLowerCase().contains(s.toLowerCase())){
                        filteredClothing.add(clothing);
                    }
                }
                if (s.isEmpty()){
                    listView.setVisibility(View.GONE);
                } else {

                    ClothingAdapter clothingAdapter = new ClothingAdapter(getApplicationContext(), 0, filteredClothing);
                    listView.setAdapter(clothingAdapter);
                    listView.setVisibility(View.VISIBLE);
                }
                return false;

            }
        }
     );
        listView.setVisibility(View.GONE);
    }


    //David, Abdul, Gustav
    private void setUpData() {

        Clothing website1 = new Clothing("Carhartt Grey T-Shirt","500 Kr","Seller.com",R.drawable.ic_launcher_background,true, true);
        clothingList.add(website1);

        Clothing website2 = new Clothing("Nike Air Force 1","600 Kr","ReSeller.com",R.drawable.ic_launcher_background,true, false);
        clothingList.add(website2);

        Clothing website3 = new Clothing("Adidas Sweatpants Black","499 Kr","getz.com",R.drawable.ic_launcher_background,false, true);
        clothingList.add(website3);

        Clothing website4 = new Clothing("Jordan Panda","2000 Kr","shoes.com",R.drawable.ic_launcher_background,true, true);
        clothingList.add(website4);

        Clothing website5 = new Clothing("Bershka White T-Shirt","450 Kr","getthisstreet.com",R.drawable.ic_launcher_background,false, true);
        clothingList.add(website5);

        Clothing website6 = new Clothing("Carhartt Grey T-Shirt","450 Kr","getthisstreet.com",R.drawable.ic_launcher_background,true, false);
        clothingList.add(website6);

        Clothing website7 = new Clothing("Le Baiser Hoodie","750 Kr","getthisstreet.com",R.drawable.ic_launcher_background,false, true);
        clothingList.add(website7);

        Clothing website8 = new Clothing("Nike Air Force 1","900 Kr","nike.com",R.drawable.ic_launcher_background,true, true);
        clothingList.add(website8);

        Clothing website9 = new Clothing("Supreme hoodie White","3100 Kr","getthisstreet.com",R.drawable.ic_launcher_background,true, true);
        clothingList.add(website9);

        Clothing website10 = new Clothing("Carhartt Green Pants","650 Kr","getthispants.com",R.drawable.ic_launcher_background,true, true);
        clothingList.add(website10);

        Clothing website11 = new Clothing("Carhartt Green T-Shirt","350 Kr","getthisstreet.com",R.drawable.ic_launcher_background,true, true);
        clothingList.add(website11);

        Clothing website12 = new Clothing("Gucci Belt Classic","900 Kr","getthisbelt.com",R.drawable.ic_launcher_background,true, true);
        clothingList.add(website12);

        Clothing website13 = new Clothing("Gucci belt Classic","899 Kr","damn.com",R.drawable.ic_launcher_background,true, true);
        clothingList.add(website13);

        Clothing website14 = new Clothing("Jordan Panda ","1999 Kr","shoesReseller.com",R.drawable.ic_launcher_background,true, true);
        clothingList.add(website14);



    }

    //David
    private void setUpList(){
        listView = (ListView) findViewById(R.id.clothingListView);

        ClothingAdapter box = new ClothingAdapter(getApplicationContext(), 0, clothingList);
        listView.setAdapter(box);
    }


//David
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



