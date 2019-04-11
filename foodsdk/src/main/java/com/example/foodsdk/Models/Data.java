
package com.example.foodsdk.Models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

@SuppressWarnings("unused")
public class Data {

    @SerializedName("Item0")
    private List<Item0> mItem0;
    @SerializedName("Restaurants")
    private List<Restaurant> mRestaurants;

    public List<Item0> getItem0() {
        return mItem0;
    }

    public void setItem0(List<Item0> item0) {
        mItem0 = item0;
    }

    public List<Restaurant> getRestaurants() {
        return mRestaurants;
    }

    public void setRestaurants(List<Restaurant> restaurants) {
        mRestaurants = restaurants;
    }

}
