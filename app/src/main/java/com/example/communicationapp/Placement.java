package com.example.communicationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.communicationapp.databinding.ActivityPlacementBinding;

public class Placement extends AppCompatActivity {

    ActivityPlacementBinding activityPlacementBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        activityPlacementBinding=ActivityPlacementBinding.inflate(getLayoutInflater());
        setContentView(activityPlacementBinding.getRoot());

        activityPlacementBinding.g1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Placement.this,chart21.class));
            }
        });
        activityPlacementBinding.g2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Placement.this,chart20.class));
            }
        });
        activityPlacementBinding.g3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Placement.this,chart19.class));
            }
        });
        activityPlacementBinding.g4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Placement.this,chart18.class));
            }
        });



    }
}