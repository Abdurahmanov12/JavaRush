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
import java.util.Calendar;

public class FirstFragment extends Fragment {

    RecyclerView rv;
    Adapter adapter;
    ArrayList<Model> list = new ArrayList<>();

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Calendar date = null;
        list.add(new Model(R.drawable.asdq,"Знакомства","Уровень 0","17.01.21"));
        list.add(new Model(R.drawable.zapp, "Лекция 1","Уровень 1","17.01.21"));
        list.add(new Model(R.drawable.risha, "лекция 2","Уровень 2","17.01.21"));
        list.add(new Model(R.drawable.elly, "Лекция 3","Уровень 3","17.01.21"));
        list.add(new Model(R.drawable.julio, "Лекция 4","Уровень 4","17.01.21"));
        list.add(new Model(R.drawable.diego, "Лекция 5","Уровень 5","17.01.21"));
        list.add(new Model(R.drawable.raunt, "Лекция 6","Уровень 6","17.01.21"));
        list.add(new Model(R.drawable.cat, "Лекция 7","Уровень 7","17.01.21"));
        list.add(new Model(R.drawable.quest, "Лекция 8","Уровень 8","17.01.21"));
        list.add(new Model(R.drawable.professor, "Лекция 9","Уровень 9","17.01.21"));
        list.add(new Model(R.drawable.kim, "Лекция 10","Уровень 10","17.01.21"));
        list.add(new Model(R.drawable.asdq, "Загаловок","Описание","17.01.21"));
        list.add(new Model(R.drawable.asdq, "Загаловок","Описание","17.01.21"));
        list.add(new Model(R.drawable.asdq, "Загаловок","Описание","17.01.21"));
        list.add(new Model(R.drawable.asdq, "Загаловок","Описание","17.01.21"));
        list.add(new Model(R.drawable.asdq, "Загаловок","Описание","17.01.21"));

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
        return inflater.inflate(R.layout.fragment_first, container, false);
    }
}