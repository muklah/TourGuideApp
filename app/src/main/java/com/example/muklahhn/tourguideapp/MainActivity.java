package com.example.muklahhn.tourguideapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private MainAdapter mAdapter;
    ArrayList<MainModel> dataModels = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.list);

        dataModels = new ArrayList<>();

        dataModels.add(new MainModel(R.drawable.malls, getString(R.string.malls)));
        dataModels.add(new MainModel(R.drawable.resorts, getString(R.string.resorts)));
        dataModels.add(new MainModel(R.drawable.restaurants, getString(R.string.restaurants)));

        mAdapter = new MainAdapter(this,R.layout.main_item,dataModels);
        listView.setAdapter(mAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                if (position == 0) {
                    Intent malls = new Intent(MainActivity.this, MallsActivity.class);
                    startActivity(malls);
                }

                if (position == 1) {
                    Intent resorts = new Intent(MainActivity.this, SummerResortsActivity.class);
                    startActivity(resorts);
            }

                if (position == 2) {
                    Intent restaurants = new Intent(MainActivity.this, RestaurantsActivity.class);
                    startActivity(restaurants);
                }

            }
        });

    }
}
