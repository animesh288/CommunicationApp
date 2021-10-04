package com.example.communicationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.communicationapp.databinding.ActivityConnectBinding;

public class Connect extends AppCompatActivity {

    ActivityConnectBinding activityConnectBinding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityConnectBinding=ActivityConnectBinding.inflate(getLayoutInflater());
        setContentView(activityConnectBinding.getRoot());

        activityConnectBinding.linkedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.linkedin.com/school/national-institute-of-technology-raipur/?originalSubdomain=in");
            }
        });
        activityConnectBinding.instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.instagram.com/nit_raipur/");
            }
        });
        activityConnectBinding.facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.facebook.com/nitrr.raipur/");
            }
        });
        activityConnectBinding.twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://twitter.com/NITRR?ref_src=twsrc%5Egoogle%7Ctwcamp%5Eserp%7Ctwgr%5Eauthor");
            }
        });
        activityConnectBinding.web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("http://nitrr.ac.in/");
            }
        });






    }
    private void gotoUrl(String s){

        Uri uri=Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));



    }
}