package com.example.javarush;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class Home extends Fragment {
    private VipeigerAdapter adapter;
    private ViewPager2 viewPager2;
    private TabLayout tabLayout;
    private ArrayList<Fragment> list;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initNitViewPager(view);

    }

    private void initNitViewPager(View view){
        viewPager2 = view.findViewById(R.id.viewPager);
        adapter = new VipeigerAdapter(requireActivity());
        list = new ArrayList<>();
        list.add(new FirstFragment());
        list.add(new SeccondFragment());
        adapter.addFragments(list);
        viewPager2.setAdapter(adapter);
    }
}
