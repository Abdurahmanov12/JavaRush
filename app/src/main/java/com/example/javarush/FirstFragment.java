package com.example.javarush;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class FirstFragment extends Fragment {

    RecyclerView rv;
    Adapter adapter;
    TabLayout tabLayout;
    FragmentAdapter adapter2;
    ViewPager2 viewPager2;
    ArrayList<Model> list = new ArrayList<>();

    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        list.add(new Model(R.drawable.zapp,"Знакомства","Что такое java","17.01.21"));
        list.add(new Model(R.drawable.risha, "Лекция 1","Переменные","17.01.21"));
        list.add(new Model(R.drawable.elly, "Лекция 2","Данные от пользователя","17.01.21"));
        list.add(new Model(R.drawable.julio, "Лекция 3","Математические операции","17.01.21"));
        list.add(new Model(R.drawable.diego, "Лекция 4","Условные операторы","17.01.21"));
        list.add(new Model(R.drawable.kim, "Лекция 5","Циклы (For,While,Do while","17.01.21"));
        list.add(new Model(R.drawable.professor, "Лекция 6","Массивы","17.01.21"));
        list.add(new Model(R.drawable.zoidberg, "Лекция 7","Многомерные массивы","17.01.21"));
        list.add(new Model(R.drawable.julio, "Лекция 8","Функции","17.01.21"));
        list.add(new Model(R.drawable.elly, "Лекция 9","Основы ООП","17.01.21"));
        list.add(new Model(R.drawable.diego, "Лекция 10","Создание класса и объекта","17.01.21"));
        list.add(new Model(R.drawable.kim, "Лекция 11","Конструкторы","17.01.21"));
        list.add(new Model(R.drawable.risha, "Лекция 12","Наследование","17.01.21"));
        list.add(new Model(R.drawable.professor, "Лекция 13","Полиморфизм","17.01.21"));
        list.add(new Model(R.drawable.julio, "Лекция 14","Анонимные классы","17.01.21"));
        list.add(new Model(R.drawable.zapp, "Лекция 15","Абстрактные классы","17.01.21"));

        initRecycler(view);

    }

    private FragmentManager getSupportManager() {
        return null;
    }
    private void initRecycler(View view) {
//        tabLayout = view.findViewById(R.id.tab_layout);
//        viewPager2 = view.findViewById(R.id.view_pager2);
        rv = view.findViewById(R.id.recycler);
        adapter = new Adapter();
        adapter.setData(list);
        rv.setAdapter(adapter);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_first, container, false);
    }
}