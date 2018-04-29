package com.example.android.sibadat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;

import java.util.ArrayList;

import static android.R.attr.data;

public class StatistikNilai extends AppCompatActivity {

    BarChart barChart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistik_nilai);

        barChart = (BarChart) findViewById(R.id.bargraph);

        ArrayList<BarEntry> barEntries = new ArrayList<>();
        barEntries.add(new BarEntry(10f,0));
        barEntries.add(new BarEntry(100f,1));
        barEntries.add(new BarEntry(60f,2));
        barEntries.add(new BarEntry(70f,3));
        barEntries.add(new BarEntry(0f,4));
        barEntries.add(new BarEntry(0f,5));
        barEntries.add(new BarEntry(0f,6));
        barEntries.add(new BarEntry(0f,7));
        barEntries.add(new BarEntry(0f,8));
        barEntries.add(new BarEntry(0f,9));


        ArrayList<String> modul = new ArrayList<>();
        modul.add("Modul1");
        modul.add("Modul2");
        modul.add("Modul3");
        modul.add("Modul4");
        modul.add("Modul5");
        modul.add("Modul6");
        modul.add("Modul7");
        modul.add("Modul8");
        modul.add("Modul9");
        modul.add("Modul10");
        BarDataSet barDataSet = new BarDataSet(barEntries,"Nilai Kuis");
        barDataSet.setColor(getResources().getColor(R.color.colorRadio));

        BarData set = new BarData(modul,barDataSet);
        barChart.setData(set);

        barChart.setTouchEnabled(false);
        barChart.setDragEnabled(false);
        barChart.setScaleEnabled(false);
        barChart.setDoubleTapToZoomEnabled(false);
        barChart.setPinchZoom(false);

        barChart.setDescription("");
        YAxis yAxisRight = barChart.getAxisRight();
        yAxisRight.setEnabled(false);

        XAxis xAxis = barChart.getXAxis();
        xAxis.setDrawGridLines(false);
        barChart.invalidate();
    }

    public void brd8(View view){
        startActivity(new Intent(StatistikNilai.this,MainActivity.class));
        finish();
    }

    public void onBackPressed(){
        Intent intent = new Intent(StatistikNilai.this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}
