package com.example.muklahhn.tourguideapp;

/**
 * Created by Muklah H N on 19/07/2018.
 */

public class MainModel {

    int image;
    String mName;

    public MainModel(int image, String name) {
        this.image=image;
        this.mName=name;
    }

    public int getImage() {
        return image;
    }

    public String getMainName() {
        return mName;
    }

}
