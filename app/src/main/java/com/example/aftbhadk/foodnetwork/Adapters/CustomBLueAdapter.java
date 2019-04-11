package com.example.aftbhadk.foodnetwork.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.aftbhadk.foodnetwork.Models.DevicesModel;
import com.example.aftbhadk.foodnetwork.R;

import java.util.ArrayList;
import java.util.List;

// Created by aftbhadk on 30/03/19.
public class CustomBLueAdapter extends RecyclerView.Adapter<CustomBLueAdapter.MyHolder> {

    Context context;
    List<DevicesModel> devicesList = new ArrayList<>();

    public CustomBLueAdapter(Context context, List<DevicesModel> devicesList) {
        this.context = context;
        this.devicesList = devicesList;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.devicelist_row, viewGroup, false);
        return new MyHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder myHolder, int i) {

        DevicesModel devicesModel = devicesList.get(i);
        myHolder.name.setText(devicesModel.getName());

    }
    public void addItem(DevicesModel viewModel) {
        devicesList.add(viewModel);
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return devicesList.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {

        TextView name;

        public MyHolder(@NonNull View itemView) {
            super(itemView);

            name = (TextView) itemView.findViewById(R.id.name);
            name.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    getAdapterPosition();
                }
            });
        }
    }
}
