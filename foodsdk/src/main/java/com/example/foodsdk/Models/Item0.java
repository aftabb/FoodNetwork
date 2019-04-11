
package com.example.foodsdk.Models;


import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Item0 {

    @SerializedName("amount")
    private String mAmount;
    @SerializedName("category")
    private String mCategory;
    @SerializedName("favourited")
    private Boolean mFavourited;
    @SerializedName("imageUrl")
    private String mImageUrl;
    @SerializedName("name")
    private String mName;
    @SerializedName("ratings")
    private Double mRatings;

    public String getAmount() {
        return mAmount;
    }

    public void setAmount(String amount) {
        mAmount = amount;
    }

    public String getCategory() {
        return mCategory;
    }

    public void setCategory(String category) {
        mCategory = category;
    }

    public Boolean getFavourited() {
        return mFavourited;
    }

    public void setFavourited(Boolean favourited) {
        mFavourited = favourited;
    }

    public String getImageUrl() {
        return mImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        mImageUrl = imageUrl;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public Double getRatings() {
        return mRatings;
    }

    public void setRatings(Double ratings) {
        mRatings = ratings;
    }

}
