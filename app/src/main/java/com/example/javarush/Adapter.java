package com.example.javarush;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<MainViewHolder> {
    private ArrayList<Model> data = new ArrayList<>();
    private OnItemClick onItemClick;

    void setData(ArrayList<Model> data){
        this.data.addAll(data);
        notifyDataSetChanged();
    }

    public void setOnItemClick(OnItemClick onItemClick) {
        this.onItemClick = onItemClick;
    }

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.my_view_holder,parent,false);
        return new MainViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
        holder.onBind(data.get(position));
        holder.itemView.setOnClickListener(v -> onItemClick.itemClick(data.get(position).getUrl()));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
    public interface OnItemClick{
        void itemClick(String url);
    }
}
