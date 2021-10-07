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
                String t= (String) activityPlacementBinding.g1.getTag();
                startActivity(new Intent(Placement.this,chart21.class).putExtra("tag",t));
            }
        });
        activityPlacementBinding.g2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String t= (String) activityPlacementBinding.g2.getTag();
                startActivity(new Intent(Placement.this,chart21.class).putExtra("tag",t));
            }
        });
        activityPlacementBinding.g3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String t= (String) activityPlacementBinding.g3.getTag();
                startActivity(new Intent(Placement.this,chart21.class).putExtra("tag",t));
            }
        });
        activityPlacementBinding.g4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String t= (String) activityPlacementBinding.g4.getTag();
                startActivity(new Intent(Placement.this,chart21.class).putExtra("tag",t));
            }
        });



    }
}