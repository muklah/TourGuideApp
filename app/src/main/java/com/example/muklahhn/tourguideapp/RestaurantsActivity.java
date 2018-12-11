package com.example.muklahhn.tourguideapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);

        ListView listView=(ListView)findViewById(R.id.list);

        ArrayList<Model> dataModels= new ArrayList<>();

        dataModels.add(new Model(getString(R.string.food_land), R.drawable.r1, getString(R.string.food_land_location), getString(R.string.food_land_description), getString(R.string.food_land_phone)));
        dataModels.add(new Model(getString(R.string.ice_pack), R.drawable.r2, getString(R.string.ice_pack_location), getString(R.string.ice_pack_description), getString(R.string.ice_pack_phone)));

        Adapter adapter= new Adapter(dataModels,getApplicationContext());

        listView.setAdapter(adapter);

    }
}
