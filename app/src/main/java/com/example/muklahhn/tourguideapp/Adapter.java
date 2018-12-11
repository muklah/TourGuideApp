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
 * Created by Muklah H N on 19/07/2018.
 */

public class Adapter extends ArrayAdapter<Model> {

    private static class ViewHolder {
        TextView name;
        ImageView image;
        TextView location;
        TextView description;
        TextView phone;
    }

    public Adapter(ArrayList<Model> data, Context context) {
        super(context, R.layout.item, data);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Model dataModel = getItem(position);
        ViewHolder viewHolder;

        if (convertView == null) {

            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.item, parent, false);
            viewHolder.name = (TextView) convertView.findViewById(R.id.name);
            viewHolder.image = (ImageView) convertView.findViewById(R.id.image);
            viewHolder.location = (TextView) convertView.findViewById(R.id.location);
            viewHolder.description = (TextView) convertView.findViewById(R.id.description);
            viewHolder.phone = (TextView) convertView.findViewById(R.id.phone);


            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.name.setText(dataModel.getName());
        viewHolder.image.setImageResource(dataModel.getImage());
        viewHolder.image.setTag(position);
        viewHolder.location.setText(dataModel.getLocation());
        viewHolder.description.setText(dataModel.getDescription());
        viewHolder.phone.setText(dataModel.getPhone());
        return convertView;
    }
}