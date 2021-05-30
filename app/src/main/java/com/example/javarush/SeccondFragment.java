package com.example.javarush;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SeccondFragment extends Fragment {

    RecyclerView rv;
    Adapter adapter;
    ArrayList<Model> list = new ArrayList<>();

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        list.add(new Model(R.drawable.asdq,"Задача 1","Описание","17.01.21"));
        list.add(new Model(R.drawable.asdq, "Задача 2","Описание","17.01.21"));
        list.add(new Model(R.drawable.asdq, "Задача 3","Описание","17.01.21"));
        list.add(new Model(R.drawable.asdq, "Задача 4","Описание","17.01.21"));
        list.add(new Model(R.drawable.asdq, "Задача 5","Описание","17.01.21"));
        list.add(new Model(R.drawable.asdq, "Задача6","Описание","17.01.21"));
        list.add(new Model(R.drawable.asdq, "Задача 7","Описание","17.01.21"));
        list.add(new Model(R.drawable.asdq, "Задача 8","Описание","17.01.21"));
        list.add(new Model(R.drawable.asdq, "Задача 9","Описание","17.01.21"));
        list.add(new Model(R.drawable.asdq, "Задача 10","Описание","17.01.21"));
        list.add(new Model(R.drawable.asdq, "Задача 11","Описание","17.01.21"));
        list.add(new Model(R.drawable.asdq, "Задача 12","Описание","17.01.21"));
        list.add(new Model(R.drawable.asdq, "Задача 13","Описание","17.01.21"));
        list.add(new Model(R.drawable.asdq, "Задача 14","Описание","17.01.21"));

        initRecycler(view);
    }

    private void initRecycler(View view) {
        rv = view.findViewById(R.id.recycler);
        adapter = new Adapter();
        adapter.setData(list);
        rv.setAdapter(adapter);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_seccond, container, false);
    }
}