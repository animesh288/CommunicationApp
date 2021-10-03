package com.example.communicationapp;

import androidx.appcompat.app.AppCompatActivity;

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
        String msg="";
        switch (t){
            case "1":msg="cse"; break;
            case "2":msg="it"; break;
            case "3":msg="a"; break;
            case "4":msg="arch"; break;
            case "5":msg="bi"; break;
            case "6":msg="bjjb"; break;
            default:msg="work in progress";


        }
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();

    }
}