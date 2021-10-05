package com.example.communicationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.communicationapp.Adapter.ContactAdapter;
import com.example.communicationapp.Model.CollegeContacts;
import com.example.communicationapp.databinding.ActivityConnectBinding;

import java.sql.Array;
import java.util.ArrayList;

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

        String []name={"Dr. Arif Khan","Dr. Shrish Verma","Dr. P. Y. Dhekne","Dr.(Mrs) A. B. Soni",
        "Dr. Prabhat Diwan","Dr. R.K. Tripathi","Dr. (Mrs.) Shubhrata Gupta","Dr. Manoj Pradhan","Dr. Sanjeev Pandey",
        "Establishment Section","Store & Purchase Section","Student Section","Examination Section","Central Library","Placement Cell"};

        String []designation={"Registrar","Dean Office (Academics)","Dean Office (Student Welfare)","Dean Office (Faculty Welfare)",
        "Dean Office (Research & Consultancy)","Dean Office (Planning & Development)","Chief Warden (Girl's Hostel)",
        "Chief Warden (Boy's Hostel)","Sr. Medical Officer (Dispensary)"," "," "," "," "," "," "};

        String []contact={"0771-2252700","+91-9755574795","+91-9669400678","+91-9617777363","+91-9479221399","0771-2254114",
        "+91-9993244929","+91-9826540711","+91-8889838150","+91-8602705520","+91-9993947106","+91-9981544944","+91-9893655655",
        "+91-9977508422","+91-7400730333"};

        ArrayList<CollegeContacts> list=new ArrayList<>();

        for(int i=0;i<name.length;i++){
            CollegeContacts x=new CollegeContacts(name[i],designation[i],contact[i]);
            list.add(x);
        }

        ContactAdapter contactAdapter=new ContactAdapter(Connect.this,list);
        activityConnectBinding.listView.setAdapter(contactAdapter);






    }
    private void gotoUrl(String s){

        Uri uri=Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));



    }
}