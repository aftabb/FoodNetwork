package com.example.aftbhadk.foodnetwork.Repository;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

// Created by aftbhadk on 29/03/19.
public class ApiClient {
    private static String BASE_URL = "http://192.168.31.122:3000";
    private static Retrofit retrofit = null;

    public static Retrofit getClient() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return retrofit;
    }
}
