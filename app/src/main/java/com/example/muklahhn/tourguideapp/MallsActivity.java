package com.example.muklahhn.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MallsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_malls);

        ListView listView=(ListView)findViewById(R.id.list);

        ArrayList<Model> dataModels= new ArrayList<>();

        dataModels.add(new Model(getString(R.string.nakeel_mall), R.drawable.m1, getString(R.string.nakeel_mall_location), getString(R.string.nakeel_mall_description), getString(R.string.nakeel_mall_phone)));
        dataModels.add(new Model(getString(R.string.mansour_mall), R.drawable.m2, getString(R.string.mansour_mall_location), getString(R.string.mansour_mall_description), getString(R.string.mansour_mall_phone)));
        dataModels.add(new Model(getString(R.string.babylon_mall), R.drawable.m3, getString(R.string.babylon_mall_location), getString(R.string.babylon_mall_description), getString(R.string.babylon_mall_phone)));

        Adapter adapter= new Adapter(dataModels,getApplicationContext());

        listView.setAdapter(adapter);
    }

}