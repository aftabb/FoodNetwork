package com.example.aftbhadk.foodnetwork;

import android.app.Application;

import com.example.aftbhadk.foodnetwork.DInjection.Component.ApiComponent;
import com.example.aftbhadk.foodnetwork.DInjection.Component.DaggerApiComponent;
import com.example.aftbhadk.foodnetwork.DInjection.Module.ApiModule;
import com.example.aftbhadk.foodnetwork.DInjection.Module.AppModule;

// Created by aftbhadk on 04/04/19.
public class MyApplication extends Application {
    private ApiComponent apiComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        apiComponent = DaggerApiComponent.builder()
                .apiModule(new ApiModule("http://192.168.31.122:3000")).
                        appModule(new AppModule(this)).
                        build();
    }

    public ApiComponent getApiComponent() {
        return apiComponent;
    }
}
