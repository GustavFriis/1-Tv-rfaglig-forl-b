package com.example.a1_tvrfaglig_forlb;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ClothingAdapter extends ArrayAdapter<Clothing> {
    public ClothingAdapter(Context context, int resource, List<Clothing> clothingList){
        super(context,resource,clothingList);

    }

    public View getView(int position, View convertView, ViewGroup parent) {
        Clothing clothing = getItem(position);
        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.clothing_box, parent, false);
        }

        TextView websiteTextView = (TextView) convertView.findViewById(R.id.Name);
        TextView nameTextView = (TextView) convertView.findViewById(R.id.WebsiteName);
        ImageView imageView = (ImageView) convertView.findViewById(R.id.WebsiteImage);

        websiteTextView.setText(clothing.getPrice());
        nameTextView.setText(clothing.getName());
        imageView.setImageResource(clothing.getImageWebsite());

        return convertView;
    }
} //commit
