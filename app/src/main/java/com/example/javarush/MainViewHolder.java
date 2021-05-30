package com.example.javarush;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class MainViewHolder extends RecyclerView.ViewHolder {
    TextView label, description, date;
    ImageView id;
    private ConstraintLayout constraintLayout;
    public MainViewHolder(@NonNull View itemView) {
        super(itemView);
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
