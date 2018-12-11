package com.example.muklahhn.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class SummerResortsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summer_resort);

        ListView listView=(ListView)findViewById(R.id.list);

        ArrayList<Model> dataModels= new ArrayList<>();

        dataModels.add(new Model(getString(R.string.ahmed_aoa), R.drawable.rs1, getString(R.string.ahmed_aoa_location), getString(R.string.ahmed_aoa_description), getString(R.string.ahmed_aoa_phone)));
        dataModels.add(new Model(getString(R.string.chavi_land), R.drawable.rs2, getString(R.string.chavi_land_location), getString(R.string.chavi_land_description), getString(R.string.chavi_land_phone)));
        dataModels.add(new Model(getString(R.string.kali_ali_bek), R.drawable.rs3, getString(R.string.kali_ali_bek_location), getString(R.string.kali_ali_bek_description), getString(R.string.kali_ali_bek_phone)));

        Adapter adapter= new Adapter(dataModels,getApplicationContext());

        listView.setAdapter(adapter);
    }
}
