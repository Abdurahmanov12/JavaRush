package com.example.javarush;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;

public class VipeigerAdapter extends FragmentStateAdapter {
    private ArrayList<Fragment> list = new ArrayList<>();

    public void addFragments(ArrayList<Fragment> list){
        this.list.addAll(list);
        notifyDataSetChanged();
    }

    public VipeigerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @Override
    public Fragment createFragment(int position) {
        return list.get(position);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
