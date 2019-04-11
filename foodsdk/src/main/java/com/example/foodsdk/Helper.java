package com.example.foodsdk;


// Created by aftbhadk on 02/04/19.
public class Helper {
    public static Interactor sdkInteractor;

    public static void setSdkInteractor(Interactor sdkInteractor) {
        Helper.sdkInteractor = sdkInteractor;
    }

    public static Interactor getSdkInteractor() {
        return sdkInteractor;
    }
}
