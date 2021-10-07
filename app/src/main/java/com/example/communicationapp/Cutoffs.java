package com.example.communicationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.example.communicationapp.databinding.ActivityCutoffsBinding;

public class Cutoffs extends AppCompatActivity {

    ActivityCutoffsBinding binding;
    int state=1,cat=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityCutoffsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.allindia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.allindia.setBackgroundColor(Color.CYAN);
                binding.homestate.setBackgroundColor(Color.WHITE);
                state=1;
            }
        });
        binding.homestate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.homestate.setBackgroundColor(Color.CYAN);
                binding.allindia.setBackgroundColor(Color.WHITE);
                state=2;
            }
        });

        binding.open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.open.setBackgroundColor(Color.CYAN);
                binding.ews.setBackgroundColor(Color.WHITE);
                binding.obc.setBackgroundColor(Color.WHITE);
                binding.st.setBackgroundColor(Color.WHITE);
                binding.sc.setBackgroundColor(Color.WHITE);
                cat=1;

            }
        });
        binding.ews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.open.setBackgroundColor(Color.WHITE);
                binding.ews.setBackgroundColor(Color.CYAN);
                binding.obc.setBackgroundColor(Color.WHITE);
                binding.st.setBackgroundColor(Color.WHITE);
                binding.sc.setBackgroundColor(Color.WHITE);
                cat=2;

            }
        });
        binding.obc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.open.setBackgroundColor(Color.WHITE);
                binding.ews.setBackgroundColor(Color.WHITE);
                binding.obc.setBackgroundColor(Color.CYAN);
                binding.st.setBackgroundColor(Color.WHITE);
                binding.sc.setBackgroundColor(Color.WHITE);
                cat=3;

            }
        });
        binding.st.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.open.setBackgroundColor(Color.WHITE);
                binding.ews.setBackgroundColor(Color.WHITE);
                binding.obc.setBackgroundColor(Color.WHITE);
                binding.st.setBackgroundColor(Color.CYAN);
                binding.sc.setBackgroundColor(Color.WHITE);
                cat=4;

            }
        });
        binding.sc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.open.setBackgroundColor(Color.WHITE);
                binding.ews.setBackgroundColor(Color.WHITE);
                binding.obc.setBackgroundColor(Color.WHITE);
                binding.st.setBackgroundColor(Color.WHITE);
                binding.sc.setBackgroundColor(Color.CYAN);
                cat=5;

            }
        });




    }
}