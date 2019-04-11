
package com.example.foodsdk.Models;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Restaurant {

    @SerializedName("address")
    private String mAddress;
    @SerializedName("closetime")
    private String mClosetime;
    @SerializedName("name")
    private String mName;
    @SerializedName("opentime")
    private String mOpentime;
    @SerializedName("rating")
    private Double mRating;

    public String getAddress() {
        return mAddress;
    }

    public void setAddress(String address) {
        mAddress = address;
    }

    public String getClosetime() {
        return mClosetime;
    }

    public void setClosetime(String closetime) {
        mClosetime = closetime;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getOpentime() {
        return mOpentime;
    }

    public void setOpentime(String opentime) {
        mOpentime = opentime;
    }

    public Double getRating() {
        return mRating;
    }

    public void setRating(Double rating) {
        mRating = rating;
    }

}
