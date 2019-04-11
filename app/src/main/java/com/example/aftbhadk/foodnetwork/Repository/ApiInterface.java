package com.example.aftbhadk.foodnetwork.Repository;


import com.example.foodsdk.Models.SectionOneModel;

import retrofit2.Call;
import retrofit2.http.GET;

// Created by aftbhadk on 02/04/19.
public interface ApiInterface {

    @GET("/home/section")
    Call<SectionOneModel> getData();
}
