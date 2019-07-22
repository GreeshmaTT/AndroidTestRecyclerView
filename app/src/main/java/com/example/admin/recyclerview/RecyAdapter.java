package com.example.admin.recyclerview;

import android.app.LauncherActivity;
import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class RecyAdapter extends RecyclerView.Adapter<RecyAdapter.MyViewHolder> {


   // private int[] images;
    private List<ModelClass> model;
    private Context context;


    public RecyAdapter(List<ModelClass> model, Context context) {
        this.model = model;
        this.context = context;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView Hname,FoodName;
        ImageView FoodImage;
        public MyViewHolder(@NonNull View itemView)
        {
            super(itemView);
            Hname = itemView.findViewById(R.id.name);
            FoodName = itemView.findViewById(R.id.foodItem);
            FoodImage = itemView.findViewById(R.id.itemImage);
        }
    }




    @NonNull
    @Override
    public RecyAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        //attach layout
       View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_layout,viewGroup,false);
       return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyAdapter.MyViewHolder myViewHolder, int i) {
       // int FoodImageId = images[i];

        ModelClass modelClass=model.get(i);

        myViewHolder.Hname.setText(modelClass.getName());
        myViewHolder.FoodName.setText(modelClass.getFoodItem());
        String url =modelClass.getFoodImage();
        Glide.with(context)
                .load(url)
                .placeholder(R.drawable.food1)
                .into(myViewHolder.FoodImage);
      //  myViewHolder.FoodImage.setImageResource(FoodImageId);

        Log.e("photobind",":"+modelClass.getFoodImage());
        }

    @Override
    public int getItemCount() {
        return model.size();
    }


}
