package com.example.communicationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.communicationapp.Adapter.ListAdapter;
import com.example.communicationapp.Model.Faculty;
import com.example.communicationapp.databinding.ActivityFacultyDetailsBinding;

import java.util.ArrayList;

public class FacultyDetails extends AppCompatActivity {

    ActivityFacultyDetailsBinding activityFacultyDetailsBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityFacultyDetailsBinding=ActivityFacultyDetailsBinding.inflate(getLayoutInflater());
        setContentView(activityFacultyDetailsBinding.getRoot());

        int []imageId={R.drawable.img,R.drawable.img,R.drawable.img,R.drawable.img};
        String []name={"Animesh Agrawal","Animesh Agrawal","Animesh Agrawal","Animesh Agrawal"};
        String []contact={"2145784521","2145784521","2145784521","2145784521"};
        String []domain={"Domain: Ph.D. (Biomedical Engineering), NIT Raipur; M.Tech (Instrumentation and Control), B Tech",
                "Domain: Ph.D. (Biomedical Engineering), NIT Raipur; M.Tech (Instrumentation and Control), B Tech",
                "Domain: Ph.D. (Biomedical Engineering), NIT Raipur; M.Tech (Instrumentation and Control), B Tech",
                "Domain: Ph.D. (Biomedical Engineering), NIT Raipur; M.Tech (Instrumentation and Control), B Tech" };
        String[] gib={"gibbreish: Instrumentation, Biomedical Signal Processing, Medical Imaging, Information Retrieval, Soft computing, Pattern recognition.",
                "gibbreish: Instrumentation, Biomedical Signal Processing, Medical Imaging, Information Retrieval, Soft computing, Pattern recognition.",
                "gibbreish: Instrumentation, Biomedical Signal Processing, Medical Imaging, Information Retrieval, Soft computing, Pattern recognition.",
                "gibbreish: Instrumentation, Biomedical Signal Processing, Medical Imaging, Information Retrieval, Soft computing, Pattern recognition."
        };

        ArrayList<Faculty> facultyArrayList=new ArrayList<>();

        for(int i=0;i<4;i++){
            Faculty faculty=new Faculty(imageId[i],name[i],domain[i],contact[i],gib[i]);
            facultyArrayList.add(faculty);
        }
        ListAdapter listAdapter=new ListAdapter(FacultyDetails.this,facultyArrayList);
        activityFacultyDetailsBinding.listView.setAdapter(listAdapter);

    }
}