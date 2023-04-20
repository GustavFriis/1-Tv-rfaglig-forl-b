package com.example.a1_tvrfaglig_forlb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ClothingManager extends AppCompatActivity {

    public static ArrayList<Clothing> clothingList = new ArrayList<Clothing>();

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clothing_manager);
        setUpData();
        setUpList();
        setUpOnClickListener();
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
