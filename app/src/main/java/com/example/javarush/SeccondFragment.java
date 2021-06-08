package com.example.javarush;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SeccondFragment extends Fragment implements Adapter.OnItemClick{

    RecyclerView rv;
    Adapter adapter;
    ArrayList<Model> list = new ArrayList<>();

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        list.add(new Model(R.drawable.asdq,"Задача 1","Ввод и Ввывод","17.01.21",
                "https://javarush.ru/tasks/com.javarush.task.task01.task0101"));
        list.add(new Model(R.drawable.cat, "Задача 2","Выведите","17.01.21",
                "https://javarush.ru/tasks/com.javarush.task.task01.task0101"));
        list.add(new Model(R.drawable.original, "Задача 3","Объявляем переменные","17.01.21",
                "https://javarush.ru/tasks/com.javarush.task.task01.task0105"));
        list.add(new Model(R.drawable.quest, "Задача 4","Выводим квадрат числа","17.01.21",
                "https://javarush.ru/tasks/com.javarush.task.task01.task0140"));
        list.add(new Model(R.drawable.raunt, "Задача 5","2 + 3 = 5","17.01.21",
                "https://javarush.ru/tasks/com.javarush.task.task01.task0108"));
        list.add(new Model(R.drawable.cat, "Задача6","Переменные","17.01.21",
                "https://itproger.com/course/java/4"));
        list.add(new Model(R.drawable.original, "Задача 7","Данные от пользователя","17.01.21",
                "https://itproger.com/course/java/5"));
        list.add(new Model(R.drawable.quest, "Задача 8","Математические операции","17.01.21",
                "https://itproger.com/course/java/6"));
        list.add(new Model(R.drawable.raunt, "Задача 9","Условные операторы","17.01.21",
                "https://itproger.com/course/java/7"));
        list.add(new Model(R.drawable.quest, "Задача 10","Циклы","17.01.21",
                "https://itproger.com/course/java/8"));
        list.add(new Model(R.drawable.cat, "Задача 11","одномерными массивами","17.01.21",
                "https://itproger.com/course/java/9"));
        list.add(new Model(R.drawable.original, "Задача 12","Многомерные массивы","17.01.21",
                "https://itproger.com/course/java/10"));
        list.add(new Model(R.drawable.quest, "Задача 13","Функции","17.01.21",
                "https://itproger.com/course/java/11"));
        list.add(new Model(R.drawable.asdq, "Задача 14","Наследование","17.01.21",
                "https://itproger.com/course/java/15"));
        initRecycler(view);

        adapter.setOnItemClick(this);
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

    @Override
    public void itemClick(String url) {
        Uri uri = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
}