package com.example.communicationapp;

import androidx.appcompat.app.AppCompatActivity;

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


    }
}