package com.example.aftbhadk.foodnetwork.ViewModels;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.support.annotation.NonNull;
import android.util.Log;


import com.example.foodsdk.Models.SectionOneModel;
import com.example.foodsdk.Repository.ApiClient;
import com.example.foodsdk.Repository.ApiInterface;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

// Created by aftbhadk on 31/03/19.
public class SectionOneViewModel extends AndroidViewModel {

    public MutableLiveData<SectionOneModel> data;
    public MutableLiveData<Boolean> isLoading = new MutableLiveData<>();

    public SectionOneViewModel(@NonNull Application application) {
        super(application);
    }

    public LiveData<SectionOneModel> getAllData() {
        if (data == null) {
            data = new MutableLiveData<>();
            loaddata();
        }

        return data;
    }

    private void loaddata() {
        isLoading.setValue(true);
        ApiInterface apiInterface = ApiClient.getClient().create(ApiInterface.class);
        Call<SectionOneModel> apicall = apiInterface.getData();
        apicall.enqueue(new Callback<SectionOneModel>() {
            @Override
            public void onResponse(Call<SectionOneModel> call, Response<SectionOneModel> response) {
                data.setValue(response.body());
                isLoading.setValue(false);
            }

            @Override
            public void onFailure(Call<SectionOneModel> call, Throwable t) {
                Log.e("ERROR", t.getMessage());
                data.setValue(null);
                isLoading.setValue(false);
            }
        });
    }
}
