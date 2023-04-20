package com.example.a1_tvrfaglig_forlb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ClothingDetails extends AppCompatActivity {

    Clothing selectedClothing;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clothing_details);
        getSelectedClothing();
        setValues();
    }

    private void getSelectedClothing() {
        Intent previousIntent = getIntent();
        String website = previousIntent.getStringExtra("website");

        for (Clothing clothing : SearchActivity.clothingList) {
            if (clothing.getWebsite().equals(website)) {
                selectedClothing = clothing;
            }
        }

        System.out.println("Clothing not found");
    }

    private void setValues (){
        TextView textView = (TextView) findViewById(R.id.WebsiteName);
        ImageView imageView = (ImageView) findViewById(R.id.WebsiteImage);

        textView.setText(selectedClothing.getWebsite());
        imageView.setImageResource(selectedClothing.getImageWebsite());
    }
}