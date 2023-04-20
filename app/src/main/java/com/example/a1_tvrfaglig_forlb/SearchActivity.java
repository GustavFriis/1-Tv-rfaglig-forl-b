package com.example.a1_tvrfaglig_forlb;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;


import android.content.ClipData;
import android.os.Bundle;
import android.widget.SearchView;

import java.util.ArrayList;
import java.util.List;


public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
    }

    clothingRepo hoodie1 = new clothingRepo("Carhartt grey",500,"Seller.com",true,true);
    clothingRepo hoodie2 = new clothingRepo("Carhartt grey",600,"ReSeller.com",true,true);
    clothingRepo hoodie3 = new clothingRepo("Carhartt grey",499,"gethoodies.com",true,false);
    clothingRepo hoodie4 = new clothingRepo("Carhartt grey",535,"oBay.com",false,true);
    clothingRepo shoes1 = new clothingRepo("Jordans Panda",2000,"Nike.com",true,true);
    clothingRepo shoes2 = new clothingRepo("Jordans Panda",1899,"oBay.com",false,true);
    clothingRepo shoes3 = new clothingRepo("Jordans Panda",1400,"reSeller.com",true,false);
    clothingRepo shoes4 = new clothingRepo("Jordans Panda",2200,"shoes.com",true,true);

    ArrayList<clothingRepo> clothingArrayList = new ArrayList<>();

    public void addClothingArray() {
        clothingArrayList.add(hoodie1);
        clothingArrayList.add(hoodie2);
        clothingArrayList.add(hoodie3);
        clothingArrayList.add(hoodie4);
        clothingArrayList.add(shoes1);
        clothingArrayList.add(shoes2);
        clothingArrayList.add(shoes3);
        clothingArrayList.add(shoes4);
    }


}