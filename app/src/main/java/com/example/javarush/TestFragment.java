package com.example.javarush;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

public class TestFragment extends Fragment implements View.OnClickListener{

    private Button btnSend, btnSend1, btnSend2, btnSend3, btnSend4, btnSend5;


//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        btnSend.findViewById(R.id.btnSend);
//        btnSend.setOnClickListener(v -> {
//            //Intent intent = new Intent(TestFragment.class,ChatFragment.class);
//            //startActivity(intent);
//        });
//    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_test, container, false);

    }

    @Override
    public void onClick(View v) {
        //btnSend.setOnClickListener(TestFragment.class,ChatFragment.class);
    }
}