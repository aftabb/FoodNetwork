package com.example.aftbhadk.foodnetwork.Adapters;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.aftbhadk.foodnetwork.R;
import com.example.aftbhadk.foodnetwork.databinding.Section2RowBinding;
import com.example.foodsdk.Models.Restaurant;

import java.util.ArrayList;
import java.util.List;

// Created by aftbhadk on 01/04/19.
public class SectionTwoAdapter extends RecyclerView.Adapter<SectionTwoAdapter.MyViewHolder> {

    Context context;
    List<Restaurant> restaurantList = new ArrayList<>();

    public SectionTwoAdapter(Context context, List<Restaurant> restaurantList) {
        this.context = context;
        this.restaurantList = restaurantList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Section2RowBinding binding = DataBindingUtil
                .inflate(LayoutInflater.
                        from(viewGroup.getContext()), R.layout.section2_row, viewGroup, false);

        return new MyViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder viewHolder, int i) {

        viewHolder.binding.setRestaurant(restaurantList.get(i));
    }

    @Override
    public int getItemCount() {
        return restaurantList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private Section2RowBinding binding;

        public MyViewHolder(@NonNull Section2RowBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }
    }
}
