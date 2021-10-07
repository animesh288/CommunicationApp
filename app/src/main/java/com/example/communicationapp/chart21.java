package com.example.communicationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter;

import java.util.ArrayList;
import java.util.List;

public class chart21 extends AppCompatActivity {

    ArrayList entries;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart21);
        TextView year=findViewById(R.id.year);

        Bundle extras=getIntent().getExtras();
        String v=extras.getString("tag");

        BarChart barChart=findViewById(R.id.barchart);
        BarDataSet barDataSet2,barDataSet1;

        String[] dept={"BIO MED","BIO TECH","CHEMICAL","CIVIL","CSE","ELECTRICAL","ETC","IT","MECHANICAL","METALLURGY","MINING"};

        switch(v){
            case "1":
                barDataSet1=new BarDataSet(getBarEntriesOne(),"OFFERS RECIEVED");
                barDataSet2=new BarDataSet(getBarEntriesTwo(),"ELIGIBLE CANDIDATES");
                barDataSet2.setColor(Color.BLUE);
                barDataSet1.setColor(Color.GREEN);
                year.setText("2020-2021 BATCH");
                break;
            case "2":
                barDataSet1=new BarDataSet(getBarEntriesthree(),"OFFERS RECIEVED");
                barDataSet2=new BarDataSet(getBarEntriesfour(),"ELIGIBLE CANDIDATES");
                barDataSet2.setColor(Color.BLUE);
                barDataSet1.setColor(Color.GREEN);
                year.setText("2019-2020 BATCH");

                break;
            case "3":
                barDataSet1=new BarDataSet(getBarEntriesfive(),"OFFERS RECIEVED");
                barDataSet2=new BarDataSet(getBarEntriessix(),"ELIGIBLE CANDIDATES");
                barDataSet2.setColor(Color.BLUE);
                barDataSet1.setColor(Color.GREEN);
                year.setText("2018-2019 BATCH");

                break;
            case "4":
                barDataSet1=new BarDataSet(getBarEntriesseven(),"OFFERS RECIEVED");
                barDataSet2=new BarDataSet(getBarEntrieseight(),"ELIGIBLE CANDIDATES");
                barDataSet2.setColor(Color.BLUE);
                barDataSet1.setColor(Color.GREEN);
                year.setText("2017-2018 BATCH");

                break;

            default:
                throw new IllegalStateException("Unexpected value: " + v);
        }



        BarData data=new BarData(barDataSet1,barDataSet2);

        barChart.setData(data);

        barChart.getDescription().setEnabled(false);

        XAxis xAxis = barChart.getXAxis();
        xAxis.setValueFormatter(new IndexAxisValueFormatter(dept));
        xAxis.setCenterAxisLabels(true);
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setGranularity(1);
        xAxis.setGranularityEnabled(true);
        barChart.setDragEnabled(true);
        barChart.setVisibleXRangeMaximum(3);

        float barSpace = 0.1f;
        float groupSpace = 0.5f;
        data.setBarWidth(0.15f);
        barChart.getXAxis().setAxisMinimum(0);
        barChart.animate();
        barChart.groupBars(0, groupSpace, barSpace);
        barChart.invalidate();




    }

    private List<BarEntry> getBarEntriesTwo() {

        entries=new ArrayList<>();
        entries.add(new BarEntry(1f, 28));
        entries.add(new BarEntry(2f, 24));
        entries.add(new BarEntry(3f, 47));
        entries.add(new BarEntry(4f, 73));
        entries.add(new BarEntry(5f, 84));
        entries.add(new BarEntry(6f, 76));
        entries.add(new BarEntry(7f, 71));
        entries.add(new BarEntry(8f, 83));
        entries.add(new BarEntry(9f, 78));
        entries.add(new BarEntry(10f, 49));
        entries.add(new BarEntry(11f, 52));

        return entries;
    }

    private List<BarEntry> getBarEntriesOne() {
        entries=new ArrayList<>();
        entries.add(new BarEntry(1f, 9));
        entries.add(new BarEntry(2f, 8));
        entries.add(new BarEntry(3f, 27));
        entries.add(new BarEntry(4f, 20));
        entries.add(new BarEntry(5f, 75));
        entries.add(new BarEntry(6f, 53));
        entries.add(new BarEntry(7f, 58));
        entries.add(new BarEntry(8f, 75));
        entries.add(new BarEntry(9f, 45));
        entries.add(new BarEntry(10f, 37));
        entries.add(new BarEntry(11f, 33));



        return entries;
    }
    private List<BarEntry> getBarEntriesfour() {

        entries=new ArrayList<>();
        entries.add(new BarEntry(1f, 16));
        entries.add(new BarEntry(2f, 21));
        entries.add(new BarEntry(3f, 48));
        entries.add(new BarEntry(4f, 68));
        entries.add(new BarEntry(5f, 90));
        entries.add(new BarEntry(6f, 92));
        entries.add(new BarEntry(7f, 67));
        entries.add(new BarEntry(8f, 90));
        entries.add(new BarEntry(9f, 86));
        entries.add(new BarEntry(10f, 57));
        entries.add(new BarEntry(11f, 63));

        return entries;
    }

    private List<BarEntry> getBarEntriesthree() {
        entries=new ArrayList<>();
        entries.add(new BarEntry(1f, 5));
        entries.add(new BarEntry(2f, 7));
        entries.add(new BarEntry(3f, 38));
        entries.add(new BarEntry(4f, 34));
        entries.add(new BarEntry(5f, 82));
        entries.add(new BarEntry(6f, 70));
        entries.add(new BarEntry(7f, 77));
        entries.add(new BarEntry(8f, 79));
        entries.add(new BarEntry(9f, 78));
        entries.add(new BarEntry(10f, 31));
        entries.add(new BarEntry(11f, 36));



        return entries;
    }
    private List<BarEntry> getBarEntriessix() {

        entries=new ArrayList<>();
        entries.add(new BarEntry(1f, 23));
        entries.add(new BarEntry(2f, 24));
        entries.add(new BarEntry(3f, 41));
        entries.add(new BarEntry(4f, 74));
        entries.add(new BarEntry(5f, 86));
        entries.add(new BarEntry(6f, 85));
        entries.add(new BarEntry(7f, 89));
        entries.add(new BarEntry(8f, 78));
        entries.add(new BarEntry(9f, 90));
        entries.add(new BarEntry(10f, 73));
        entries.add(new BarEntry(11f, 71));

        return entries;
    }

    private List<BarEntry> getBarEntriesfive() {
        entries=new ArrayList<>();
        entries.add(new BarEntry(1f, 5));
        entries.add(new BarEntry(2f, 6));
        entries.add(new BarEntry(3f, 29));
        entries.add(new BarEntry(4f, 24));
        entries.add(new BarEntry(5f, 88));
        entries.add(new BarEntry(6f, 53));
        entries.add(new BarEntry(7f, 60));
        entries.add(new BarEntry(8f, 80));
        entries.add(new BarEntry(9f, 58));
        entries.add(new BarEntry(10f, 37));
        entries.add(new BarEntry(11f, 38));



        return entries;
    }
    private List<BarEntry> getBarEntrieseight() {

        entries=new ArrayList<>();
        entries.add(new BarEntry(1f, 32));
        entries.add(new BarEntry(2f, 29));
        entries.add(new BarEntry(3f, 42));
        entries.add(new BarEntry(4f, 68));
        entries.add(new BarEntry(5f, 91));
        entries.add(new BarEntry(6f, 81));
        entries.add(new BarEntry(7f, 76));
        entries.add(new BarEntry(8f, 87));
        entries.add(new BarEntry(9f, 86));
        entries.add(new BarEntry(10f, 81));
        entries.add(new BarEntry(11f, 54));

        return entries;
    }

    private List<BarEntry> getBarEntriesseven() {
        entries=new ArrayList<>();
        entries.add(new BarEntry(1f, 10));
        entries.add(new BarEntry(2f, 10));
        entries.add(new BarEntry(3f, 29));
        entries.add(new BarEntry(4f, 27));
        entries.add(new BarEntry(5f, 81));
        entries.add(new BarEntry(6f, 48));
        entries.add(new BarEntry(7f, 60));
        entries.add(new BarEntry(8f, 71));
        entries.add(new BarEntry(9f, 60));
        entries.add(new BarEntry(10f, 36));
        entries.add(new BarEntry(11f, 26));



        return entries;
    }
    
}