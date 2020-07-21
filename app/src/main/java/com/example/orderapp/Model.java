package com.example.orderapp;

public class Model {


    String mDrinkName;
    String mDrinkDetail;
    int mDrinkPhoto;

    public Model(String mDrinkName, String mDrinkDetail, int mDrinkPhoto) {
        this.mDrinkName = mDrinkName;
        this.mDrinkDetail = mDrinkDetail;
        this.mDrinkPhoto = mDrinkPhoto;
    }




    public String getmDrinkName() {
        return mDrinkName;
    }

    public String getmDrinkDetail() {
        return mDrinkDetail;
    }

    public int getmDrinkPhoto() {
        return mDrinkPhoto;
    }
}
