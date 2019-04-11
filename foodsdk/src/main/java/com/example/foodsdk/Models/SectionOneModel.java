
package com.example.foodsdk.Models;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class SectionOneModel {

    @SerializedName("data")
    private Data mData;

    public Data getData() {
        return mData;
    }

    public void setData(Data data) {
        mData = data;
    }

}
