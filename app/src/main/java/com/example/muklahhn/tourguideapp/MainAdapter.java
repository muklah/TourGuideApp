package com.example.muklahhn.tourguideapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Muklah H N on 01/08/2018.
 */

public class MainAdapter extends ArrayAdapter<MainModel> {

    ArrayList<MainModel> mainList = new ArrayList<>();

    public MainAdapter(Context context, int textViewResourceId, ArrayList<MainModel> mainListObjects) {
        super(context, textViewResourceId, mainListObjects);
        mainList = mainListObjects;
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.main_item, null);
        ImageView image = (ImageView) convertView.findViewById(R.id.image);
        TextView text = (TextView) convertView.findViewById(R.id.text);

        image.setImageResource(mainList.get(position).getImage());
        text.setText(mainList.get(position).getMainName());
        return convertView;

    }
}

