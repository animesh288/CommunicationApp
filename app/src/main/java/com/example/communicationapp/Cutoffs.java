package com.example.communicationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.example.communicationapp.databinding.ActivityCutoffsBinding;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter;

import java.util.ArrayList;
import java.util.List;

public class Cutoffs extends AppCompatActivity {

    ActivityCutoffsBinding binding;
    int state=1,cat=1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityCutoffsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        plotChart(1,1);


        binding.allindia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.allindia.setBackgroundColor(Color.CYAN);
                binding.homestate.setBackgroundColor(Color.WHITE);
                state=1;
                plotChart(state,cat);

            }
        });
        binding.homestate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.homestate.setBackgroundColor(Color.CYAN);
                binding.allindia.setBackgroundColor(Color.WHITE);
                state=2;
                plotChart(state,cat);

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
                plotChart(state,cat);


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
                plotChart(state,cat);


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
                plotChart(state,cat);


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
                plotChart(state,cat);


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
                plotChart(state,cat);

            }
        });

    }

    public  void plotChart(int state,int cat){

        BarChart barChart=findViewById(R.id.barchart);
        BarDataSet barDataSet1;
        String[] dept={"BIOTECH","CHEMICAL","CIVIL","CSE","ELECTRICAL","ETC","MECHANICAL","METALLURGY","MINING","IT","BIOMEDICAL"};

        barDataSet1=new BarDataSet(getBarEntriesOne(state,cat),"cutoff 2020");

        BarData data=new BarData(barDataSet1);

        barChart.setData(data);

        barChart.getDescription().setEnabled(false);

        barDataSet1.setColor(Color.BLACK);
        XAxis xAxis = barChart.getXAxis();
        xAxis.setValueFormatter(new IndexAxisValueFormatter(dept));
        xAxis.setCenterAxisLabels(true);
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setGranularity(1);
        xAxis.setGranularityEnabled(true);
        barChart.setDragEnabled(true);
        barChart.setVisibleXRangeMaximum(5);


        data.setBarWidth(0.15f);
        barChart.getXAxis().setAxisMinimum(0);

    }

    private List<BarEntry> getBarEntriesOne(int state,int cat) {
        ArrayList entries =new ArrayList<>();
        switch (state){

            case 1:
                switch (cat){
                    case 1:
                        entries.add(new BarEntry(1f, 46896));
                        entries.add(new BarEntry(2f, 38111));
                        entries.add(new BarEntry(3f, 37275));
                        entries.add(new BarEntry(4f, 10405));
                        entries.add(new BarEntry(5f, 24936));
                        entries.add(new BarEntry(6f, 17069));
                        entries.add(new BarEntry(7f, 28571));
                        entries.add(new BarEntry(8f, 45641));
                        entries.add(new BarEntry(9f, 45959));
                        entries.add(new BarEntry(10f, 13154));
                        entries.add(new BarEntry(11f, 49687));
                        break;
                    case 2:
                        entries.add(new BarEntry(1f, 8096));
                        entries.add(new BarEntry(2f, 6723));
                        entries.add(new BarEntry(3f, 6527));
                        entries.add(new BarEntry(4f, 1850));
                        entries.add(new BarEntry(5f, 4139));
                        entries.add(new BarEntry(6f, 2831));
                        entries.add(new BarEntry(7f, 4924));
                        entries.add(new BarEntry(8f, 7908));
                        entries.add(new BarEntry(9f, 8230));
                        entries.add(new BarEntry(10f, 2225));
                        entries.add(new BarEntry(11f, 8401));
                        break;
                    case 3:
                        entries.add(new BarEntry(1f, 14996));
                        entries.add(new BarEntry(2f, 12862));
                        entries.add(new BarEntry(3f, 11206));
                        entries.add(new BarEntry(4f, 3327));
                        entries.add(new BarEntry(5f, 7282));
                        entries.add(new BarEntry(6f, 5150));
                        entries.add(new BarEntry(7f, 8813));
                        entries.add(new BarEntry(8f, 14572));
                        entries.add(new BarEntry(9f, 15247));
                        entries.add(new BarEntry(10f, 4488));
                        entries.add(new BarEntry(11f, 15612));
                        break;
                    case 4:
                        entries.add(new BarEntry(1f, 3246));
                        entries.add(new BarEntry(2f, 2456));
                        entries.add(new BarEntry(3f, 1794));
                        entries.add(new BarEntry(4f, 919));
                        entries.add(new BarEntry(5f, 1851));
                        entries.add(new BarEntry(6f, 1578));
                        entries.add(new BarEntry(7f, 2106));
                        entries.add(new BarEntry(8f, 2991));
                        entries.add(new BarEntry(9f, 2763));
                        entries.add(new BarEntry(10f, 1323));
                        entries.add(new BarEntry(11f, 3471));
                        break;
                    case 5:
                        entries.add(new BarEntry(1f, 8907));
                        entries.add(new BarEntry(2f, 7267));
                        entries.add(new BarEntry(3f, 5760));
                        entries.add(new BarEntry(4f, 2071));
                        entries.add(new BarEntry(5f, 4662));
                        entries.add(new BarEntry(6f, 3767));
                        entries.add(new BarEntry(7f, 5461));
                        entries.add(new BarEntry(8f, 8572));
                        entries.add(new BarEntry(9f, 7965));
                        entries.add(new BarEntry(10f, 3159));
                        entries.add(new BarEntry(11f, 8970));
                        break;
                    default:break;
                }
                break;

            case 2:
                switch (cat){
                    case 1:
                        entries.add(new BarEntry(1f, 83411));
                        entries.add(new BarEntry(2f, 59768));
                        entries.add(new BarEntry(3f, 58947));
                        entries.add(new BarEntry(4f, 18745));
                        entries.add(new BarEntry(5f, 43536));
                        entries.add(new BarEntry(6f, 37155));
                        entries.add(new BarEntry(7f, 47955));
                        entries.add(new BarEntry(8f, 68050));
                        entries.add(new BarEntry(9f, 74477));
                        entries.add(new BarEntry(10f, 31490));
                        entries.add(new BarEntry(11f, 93115));
                        break;
                    case 2:
                        entries.add(new BarEntry(1f, 26821));
                        entries.add(new BarEntry(2f, 15962));
                        entries.add(new BarEntry(3f, 13573));
                        entries.add(new BarEntry(4f, 5799));
                        entries.add(new BarEntry(5f, 12271));
                        entries.add(new BarEntry(6f, 10517));
                        entries.add(new BarEntry(7f, 13540));
                        entries.add(new BarEntry(8f, 19104));
                        entries.add(new BarEntry(9f, 21885));
                        entries.add(new BarEntry(10f, 6857));
                        entries.add(new BarEntry(11f, 28110));
                        break;
                    case 3:
                        entries.add(new BarEntry(1f, 38319));
                        entries.add(new BarEntry(2f, 27696));
                        entries.add(new BarEntry(3f, 24279));
                        entries.add(new BarEntry(4f, 8331));
                        entries.add(new BarEntry(5f, 20681));
                        entries.add(new BarEntry(6f, 17199));
                        entries.add(new BarEntry(7f, 22803));
                        entries.add(new BarEntry(8f, 35732));
                        entries.add(new BarEntry(9f, 39294));
                        entries.add(new BarEntry(10f, 12994));
                        entries.add(new BarEntry(11f, 39768));
                        break;
                    case 4:
                        entries.add(new BarEntry(1f, 4719));
                        entries.add(new BarEntry(2f, 3616));
                        entries.add(new BarEntry(3f, 2135));
                        entries.add(new BarEntry(4f, 1388));
                        entries.add(new BarEntry(5f, 2046));
                        entries.add(new BarEntry(6f, 2643));
                        entries.add(new BarEntry(7f, 2404));
                        entries.add(new BarEntry(8f, 3982));
                        entries.add(new BarEntry(9f, 3126));
                        entries.add(new BarEntry(10f, 2200));
                        entries.add(new BarEntry(11f, 6513));
                        break;
                    case 5:
                        entries.add(new BarEntry(1f, 18721));
                        entries.add(new BarEntry(2f, 15144));
                        entries.add(new BarEntry(3f, 11102));
                        entries.add(new BarEntry(4f, 5106));
                        entries.add(new BarEntry(5f, 10821));
                        entries.add(new BarEntry(6f, 10299));
                        entries.add(new BarEntry(7f, 11166));
                        entries.add(new BarEntry(8f, 16747));
                        entries.add(new BarEntry(9f, 15827));
                        entries.add(new BarEntry(10f, 9545));
                        entries.add(new BarEntry(11f, 18797));
                        break;
                    default:break;
                }
                default:
                  break;
        }

        return entries;

    }

}