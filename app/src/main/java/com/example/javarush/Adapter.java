package com.example.javarush;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.MainViewHolder> {
    private ArrayList<Model> data = new ArrayList<>();
    private OnItemClick onItemClick;
    private Layout mm;

    void setData(ArrayList<Model> data) {
        this.data.addAll(data);
        notifyDataSetChanged();
    }

    public void setOnItemClick(OnItemClick onItemClick) {
        this.onItemClick = onItemClick;
    }

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.my_view_holder, parent, false);
        return new MainViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
        holder.onBind(data.get(position));
        holder.itemView.setOnClickListener(v -> onItemClick.itemClick(data.get(position).getUrl()));
        holder.itemView.setOnClickListener(v -> {

        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public interface OnItemClick {
        void itemClick(String url);
    }

    public class MainViewHolder extends RecyclerView.ViewHolder {
        private ImageView imagevh;
        TextView label, description, date;
        ImageView id;
        private ConstraintLayout constraintLayout;

        public MainViewHolder(@NonNull View itemView) {
            super(itemView.getRootView());

            id = itemView.findViewById(R.id.vh_image);
            label = itemView.findViewById(R.id.tv_label);
            description = itemView.findViewById(R.id.tv_description);
            date = itemView.findViewById(R.id.tv_date);
            constraintLayout = itemView.findViewById(R.id.text_v);

        }

        public void onBind(Model s) {
            id.setImageResource(s.getId());
            label.setText(s.getTitle());
            description.setText(s.getDescription());
            date.setText(s.getDate());
        }

    }

}

