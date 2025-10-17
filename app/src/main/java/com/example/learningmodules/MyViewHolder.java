package com.example.learningmodules;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {
    ImageView pic;
    TextView tv1,tv2;
    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        pic = itemView.findViewById(R.id.pic);
        tv1 = itemView.findViewById(R.id.tv1);
        tv2 = itemView.findViewById(R.id.tv2);
    }
}
