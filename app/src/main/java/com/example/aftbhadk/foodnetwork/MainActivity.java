package com.example.aftbhadk.foodnetwork;

import android.annotation.TargetApi;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;


import com.example.aftbhadk.foodnetwork.Adapters.SectionFirstAdapter;
import com.example.aftbhadk.foodnetwork.Adapters.SectionTwoAdapter;
import com.example.aftbhadk.foodnetwork.Interfaces.Implementation;
import com.example.aftbhadk.foodnetwork.Repository.ApiInterface;
import com.example.aftbhadk.foodnetwork.ViewModels.SectionOneViewModel;
import com.example.aftbhadk.foodnetwork.databinding.ActivityMainBinding;
import com.example.foodsdk.Helper;
import com.example.foodsdk.Models.Item0;
import com.example.foodsdk.Models.Restaurant;
import com.example.foodsdk.Models.SectionOneModel;
import com.google.gson.Gson;

import java.util.List;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView, restlist;
    Button button;
    ActivityMainBinding binding;

//    @Inject
//    Retrofit retrofit;


    @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR2)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        recyclerView = binding.sectionLayout.firstList;
        restlist = binding.sectionLayout1.secondList;

        Helper.setSdkInteractor(new Implementation());
        Helper.getSdkInteractor().checkList();

       ((MyApplication)getApplication()).getApiComponent().inject(this);


        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, BluetoothListActivity.class);
                startActivity(intent);
            }
        });



        SectionOneViewModel sectionOneViewModel = ViewModelProviders.of(this).get(SectionOneViewModel.class);
        sectionOneViewModel.getAllData().observe(this, new Observer<SectionOneModel>() {
            @Override
            public void onChanged(@Nullable SectionOneModel sectionOneModel) {
                List<Item0> item0List = sectionOneModel.getData().getItem0();
                recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL, false));
                recyclerView.setAdapter(new SectionFirstAdapter(item0List, MainActivity.this));
                List<Restaurant> restaurantList = sectionOneModel.getData().getRestaurants();
                restlist.setLayoutManager(new LinearLayoutManager(MainActivity.this));
                restlist.setAdapter(new SectionTwoAdapter(MainActivity.this, restaurantList));
            }
        });
//        ApiInterface apiInterface = retrofit.create(ApiInterface.class);
//        apiInterface.getData().enqueue(new Callback<SectionOneModel>() {
//            @Override
//            public void onResponse(Call<SectionOneModel> call, Response<SectionOneModel> response) {
//                Log.d("Response",response.body().getData()+"");
//            }
//
//            @Override
//            public void onFailure(Call<SectionOneModel> call, Throwable t) {
//
//            }
//        });

//        sectionOneViewModel.isLoading.observe(this, new Observer<Boolean>() {
//            @Override
//            public void onChanged(@Nullable Boolean aBoolean) {
//                if (aBoolean) {
//                    //binding.sectionLayout.progressBar.setVisibility(View.VISIBLE);
//                    binding.sectionLayout.loaderView.loaderView.setVisibility(View.VISIBLE);
//                    binding.sectionLayout.topLayout.setVisibility(View.INVISIBLE);
//                } else {
//                    binding.sectionLayout.topLayout.setVisibility(View.VISIBLE);
//                    // binding.sectionLayout.progressBar.setVisibility(View.GONE);
//                    binding.sectionLayout.loaderView.loaderView.setVisibility(View.GONE);
//                }
//            }
//        });

        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
            }

            @Override
            public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
            }
        });


    }


}
