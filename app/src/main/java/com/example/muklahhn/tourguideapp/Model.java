package com.example.muklahhn.tourguideapp;

/**
 * Created by Muklah H N on 19/07/2018.
 */

public class Model {

    String mName;
    int mImage;
    String mLocation;
    String mDescription;
    String mPhone;

    public Model(String name, int image, String location, String description, String phone) {
        this.mName=name;
        this.mImage=image;
        this.mLocation=location;
        this.mDescription=description;
        this.mPhone=phone;

    }

    public String getName() {
        return mName;
    }

    public int getImage() {
        return mImage;
    }

    public String getLocation() {
        return mLocation;
    }

    public String getDescription() {
        return mDescription;
    }

    public String getPhone() {
        return mPhone;
    }

}
