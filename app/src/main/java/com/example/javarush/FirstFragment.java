package com.example.javarush;

import android.content.Intent;
import android.net.Uri;
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

public class FirstFragment extends Fragment implements Adapter.OnItemClick {

    RecyclerView rv;
    Adapter adapter;
    TabLayout tabLayout;
    FragmentAdapter adapter2;
    ViewPager2 viewPager2;
    ArrayList<Model> list = new ArrayList<>();

    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        list.add(new Model(R.drawable.zapp,"Знакомства","Что такое java","17.01.21",R.layout.fragment_chat));
//        list.add(new Model(R.drawable.risha, "Лекция 1","Переменные","17.01.21",
//                "https://www.youtube.com/watch?v=Y__Ns7FS5lA&list=PL0lO_mIqDDFW2xXiWSfjT7hEdOUZHVNbK&index=4"));
//        list.add(new Model(R.drawable.elly, "Лекция 2","Данные от пользователя","17.01.21",
//                "https://www.youtube.com/watch?v=kD5ZDwdtJ10&list=PL0lO_mIqDDFW2xXiWSfjT7hEdOUZHVNbK&index=5"));
//        list.add(new Model(R.drawable.julio, "Лекция 3","Математические операции","17.01.21",
//                "https://www.youtube.com/watch?v=W6A4DEr7XW4&list=PL0lO_mIqDDFW2xXiWSfjT7hEdOUZHVNbK&index=6"));
//        list.add(new Model(R.drawable.diego, "Лекция 4","Условные операторы","17.01.21",
//                "https://www.youtube.com/watch?v=Eao7VNpv1f0&list=PL0lO_mIqDDFW2xXiWSfjT7hEdOUZHVNbK&index=7"));
//        list.add(new Model(R.drawable.kim, "Лекция 5","Циклы (For,While,Do while","17.01.21",
//                "https://www.youtube.com/watch?v=y3Xu5o6Pxfg&list=PL0lO_mIqDDFW2xXiWSfjT7hEdOUZHVNbK&index=8"));
//        list.add(new Model(R.drawable.professor, "Лекция 6","Массивы","17.01.21",
//                "https://www.youtube.com/watch?v=qiUfLIbbedw&list=PL0lO_mIqDDFW2xXiWSfjT7hEdOUZHVNbK&index=9"));
//        list.add(new Model(R.drawable.zoidberg, "Лекция 7","Многомерные массивы","17.01.21",
//                "https://www.youtube.com/watch?v=jzhetb1wJeM&list=PL0lO_mIqDDFW2xXiWSfjT7hEdOUZHVNbK&index=10"));
//        list.add(new Model(R.drawable.julio, "Лекция 8","Функции","17.01.21",
//                "https://www.youtube.com/watch?v=ROomaUIke2c&list=PL0lO_mIqDDFW2xXiWSfjT7hEdOUZHVNbK&index=11"));
//        list.add(new Model(R.drawable.elly, "Лекция 9","Основы ООП","17.01.21",
//                "https://www.youtube.com/watch?v=ArERhPCnpIM&list=PL0lO_mIqDDFW2xXiWSfjT7hEdOUZHVNbK&index=12"));
//        list.add(new Model(R.drawable.diego, "Лекция 10","Создание класса и объекта","17.01.21",
//                "https://www.youtube.com/watch?v=_GLnOwDEE_A&list=PL0lO_mIqDDFW2xXiWSfjT7hEdOUZHVNbK&index=13"));
//        list.add(new Model(R.drawable.kim, "Лекция 11","Конструкторы","17.01.21",
//                "https://www.youtube.com/watch?v=6jc-E52hIks&list=PL0lO_mIqDDFW2xXiWSfjT7hEdOUZHVNbK&index=14"));
//        list.add(new Model(R.drawable.risha, "Лекция 12","Наследование","17.01.21",
//                "https://www.youtube.com/watch?v=c8oUHKKwZtU&list=PL0lO_mIqDDFW2xXiWSfjT7hEdOUZHVNbK&index=15"));
//        list.add(new Model(R.drawable.professor, "Лекция 13","Полиморфизм","17.01.21",
//                "https://www.youtube.com/watch?v=N-JddKgEfa8&list=PL0lO_mIqDDFW2xXiWSfjT7hEdOUZHVNbK&index=16"));
//        list.add(new Model(R.drawable.julio, "Лекция 14","Анонимные классы","17.01.21",
//                "https://www.youtube.com/watch?v=LI0DqBzNbEM&list=PL0lO_mIqDDFW2xXiWSfjT7hEdOUZHVNbK&index=17"));
//        list.add(new Model(R.drawable.zapp, "Лекция 15","Абстрактные классы","17.01.21",
//                "https://www.youtube.com/watch?v=8_owG0Kk6co&list=PL0lO_mIqDDFW2xXiWSfjT7hEdOUZHVNbK&index=18"));
        initRecycler(view);
        adapter.setOnItemClick(this);

    }

    private FragmentManager getSupportManager() {
        return null;
    }
    private void initRecycler(View view) {
        rv = view.findViewById(R.id.recycler);
        adapter = new Adapter();
        adapter.setData(list);
        rv.setAdapter(adapter);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_first, container, false);

    }

    @Override
    public void itemClick(String url) {
        Uri uri = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
}