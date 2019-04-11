package com.example.aftbhadk.foodnetwork.DInjection.Component;

import com.example.aftbhadk.foodnetwork.DInjection.Module.ApiModule;
import com.example.aftbhadk.foodnetwork.DInjection.Module.AppModule;
import com.example.aftbhadk.foodnetwork.MainActivity;

import javax.inject.Singleton;

import dagger.Component;
import retrofit2.Retrofit;

// Created by aftbhadk on 04/04/19.

@Singleton
@Component(modules = {AppModule.class, ApiModule.class})
public interface ApiComponent {
    @Singleton
    void inject(MainActivity mainActivity);
}
