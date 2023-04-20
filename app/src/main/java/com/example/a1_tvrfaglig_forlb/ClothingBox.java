package com.example.a1_tvrfaglig_forlb;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class ClothingBox extends ArrayAdapter<Clothing> {
    public ClothingBox(Context context, int resource, List<Clothing> clothingList){
        super(context,resource,clothingList);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Clothing clothing = getItem(position);
        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.clothing_box, parent, false);
        }
        TextView textView = (TextView) convertView.findViewById(R.id.WebsiteName);
        ImageView imageView = (ImageView) convertView.findViewById(R.id.WebsiteImage);

        textView.setText(clothing.getWebsite());
        imageView.setImageResource(clothing.getImageWebsite());

        return convertView;
    }
}
