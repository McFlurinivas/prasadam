package com.example.prasadam;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    Context context;
    ArrayList<templesList> templesArrayList;

    public MyAdapter(Context context, ArrayList<templesList> templesArrayList) {
        this.context = context;
        this.templesArrayList = templesArrayList;
    }

    @NonNull
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);

        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.MyViewHolder holder, int position) {
        templesList temples = templesArrayList.get(position);
        holder.templeName.setText(temples.templeName);
        holder.templeTime.setText(temples.templeTime);
        holder.templeLocation.setText(temples.templeLocation);
        holder.templeDistance.setText(temples.templeDistance);
        holder.templeImage.setImageResource(temples.templeImage);
    }

    @Override
    public int getItemCount() {
        return templesArrayList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView templeName;
        TextView templeTime;
        TextView templeLocation;
        TextView templeDistance;
        ImageView templeImage;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            templeName = itemView.findViewById(R.id.templeName);
            templeTime = itemView.findViewById(R.id.templeTiming);
            templeLocation = itemView.findViewById(R.id.templeLocation);
            templeDistance = itemView.findViewById(R.id.templeDistance);
            templeImage = itemView.findViewById(R.id.templeImage);

        }
    }
}
