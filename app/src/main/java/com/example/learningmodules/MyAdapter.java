package com.example.learningmodules;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder>{
    Context context;
    List<Item> items;

    public MyAdapter(Context context, List<Item> items) {
        this.context = context;
        this.items = items;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.item_list,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.pic.setImageResource(items.get(position).getImage());
        holder.tv1.setText(items.get(position).getName());
        holder.tv2.setText(items.get(position).getEmail());

    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}