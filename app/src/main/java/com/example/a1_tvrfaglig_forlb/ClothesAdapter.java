package com.example.a1_tvrfaglig_forlb;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class ClothesAdapter extends ArrayAdapter<repoClothingData> {
    public ClothesAdapter(Context context, int resource, ArrayList<repoClothingData> clothingList) {
        super(context, resource, clothingList);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        repoClothingData clothingData = getItem(position);
        if(convertView== null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.cloth_cell, parent, false);
        }
        TextView textView = (TextView) convertView.findViewById(R.id.clothingName);

textView.setText(clothingData.getName());
        return convertView;
    }

}
