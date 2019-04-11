package com.example.aftbhadk.foodnetwork.Adapters;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;

import com.example.aftbhadk.foodnetwork.R;
import com.example.aftbhadk.foodnetwork.databinding.Section1RowBinding;
import com.example.foodsdk.Models.Item0;

import java.util.List;

// Created by aftbhadk on 29/03/19.
public class SectionFirstAdapter extends RecyclerView.Adapter<SectionFirstAdapter.SectionViewHolder> {

    List<Item0> list;
    Context context;

    public SectionFirstAdapter(List<Item0> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public SectionViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Section1RowBinding binding = DataBindingUtil.inflate(
                LayoutInflater.from(viewGroup.getContext()),
                R.layout.section1_row, viewGroup, false);
        //View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.section1_row, viewGroup, false);
        return new SectionViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull SectionViewHolder sectionViewHolder, int position) {

        sectionViewHolder.binding.setModel(list.get(position));
        sectionViewHolder.ratingBar.setRating(list.get(position).getRatings().floatValue());
        //Item0 firstSectionModel = list.get(position);
        //sectionViewHolder.bind(firstSectionModel);
//        sectionViewHolder.restname.setText(firstSectionModel.getName());
//        sectionViewHolder.details.setText(firstSectionModel.getCategory());
//        sectionViewHolder.amount.setText(firstSectionModel.getAmount());
//        sectionViewHolder.ratingBar.setRating(firstSectionModel.getRatings().floatValue());
//        if (firstSectionModel.getFavourited()) {
//            sectionViewHolder.favourite.setImageResource(R.drawable.favourite_selected);
//        } else {
//            sectionViewHolder.favourite.setImageResource(R.drawable.favourite_unselected);
//        }


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class SectionViewHolder extends RecyclerView.ViewHolder {

        private final Section1RowBinding binding;
        RatingBar ratingBar;

        public SectionViewHolder(final Section1RowBinding itemBinding) {
            super(itemBinding.getRoot());
            this.binding = itemBinding;
            ratingBar = itemBinding.ratings;
            binding.favorited.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    getAdapterPosition();
                }
            });
        }
    }
}
