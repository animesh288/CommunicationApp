package com.example.communicationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import com.example.communicationapp.databinding.ActivityDepartmentsBinding;
import com.google.android.filament.View;

public class Departments extends AppCompatActivity {

    ActivityDepartmentsBinding activityDepartmentsBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityDepartmentsBinding=ActivityDepartmentsBinding.inflate(getLayoutInflater());

        setContentView(activityDepartmentsBinding.getRoot());

    }



    public void onClick(android.view.View view) {



        String t=view.getTag().toString();
        Intent intent=new Intent(Departments.this,FacultyDetails.class);
        intent.putExtra("tag",t);
        startActivity(intent);
    }
}