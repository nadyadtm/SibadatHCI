package com.example.android.sibadat;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.RadioButton;

import java.util.ArrayList;

import static com.example.android.sibadat.R.id.score;

public class KunciKuis1 extends AppCompatActivity {

    Dialog tutorDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kunci_kuis1);

        Intent i = getIntent();
        ArrayList<String> x = (ArrayList<String>) i.getSerializableExtra("rdJawaban");
        RadioButton r1a = (RadioButton) findViewById(R.id.pilihana11);
        RadioButton r1b = (RadioButton) findViewById(R.id.pilihanb11);
        RadioButton r1c = (RadioButton) findViewById(R.id.pilihanc11);
        RadioButton r1d = (RadioButton) findViewById(R.id.pilihand11);
        RadioButton r2a = (RadioButton) findViewById(R.id.pilihana22);
        RadioButton r2b = (RadioButton) findViewById(R.id.pilihanb22);
        RadioButton r2c = (RadioButton) findViewById(R.id.pilihanc22);
        RadioButton r2d = (RadioButton) findViewById(R.id.pilihand22);
        RadioButton r3a = (RadioButton) findViewById(R.id.pilihana33);
        RadioButton r3b = (RadioButton) findViewById(R.id.pilihanb33);
        RadioButton r3c = (RadioButton) findViewById(R.id.pilihanc33);
        RadioButton r3d = (RadioButton) findViewById(R.id.pilihand33);
        RadioButton r4a = (RadioButton) findViewById(R.id.pilihana44);
        RadioButton r4b = (RadioButton) findViewById(R.id.pilihanb44);
        RadioButton r4c = (RadioButton) findViewById(R.id.pilihanc44);
        RadioButton r4d = (RadioButton) findViewById(R.id.pilihand44);
        RadioButton r5a = (RadioButton) findViewById(R.id.pilihana55);
        RadioButton r5b = (RadioButton) findViewById(R.id.pilihanb55);
        RadioButton r5c = (RadioButton) findViewById(R.id.pilihanc55);
        RadioButton r5d = (RadioButton) findViewById(R.id.pilihand55);

        Log.v("Nilai pertama",x.get(0));


        if (r1a.getText().toString().equals(x.get(0))){
            r1a.setChecked(true);
        } else if (r1b.getText().toString().equals(x.get(0))){
            r1b.setChecked(true);
            r1b.setTextColor(getResources().getColor(R.color.colorRed));
        } else if (r1c.getText().toString().equals(x.get(0))){
            r1c.setChecked(true);
            r1c.setTextColor(getResources().getColor(R.color.colorRed));
        } else if (r1d.getText().toString().equals(x.get(0))){
            r1d.setChecked(true);
            r1d.setTextColor(getResources().getColor(R.color.colorRed));
        }

        if (r2a.getText().toString().equals(x.get(1))){
            r2a.setChecked(true);
            r2a.setTextColor(getResources().getColor(R.color.colorRed));
        } else if (r2b.getText().toString().equals(x.get(1))){
            r2b.setChecked(true);
            r2b.setTextColor(getResources().getColor(R.color.colorRed));
        } else if (r2c.getText().toString().equals(x.get(1))){
            r2c.setChecked(true);
        } else if (r2d.getText().toString().equals(x.get(1))){
            r2d.setChecked(true);
            r2d.setTextColor(getResources().getColor(R.color.colorRed));
        }

        if (r3a.getText().toString().equals(x.get(2))){
            r3a.setChecked(true);
            r3a.setTextColor(getResources().getColor(R.color.colorRed));
        } else if (r3b.getText().toString().equals(x.get(2))){
            r3b.setChecked(true);
            r3b.setTextColor(getResources().getColor(R.color.colorRed));
        } else if (r3c.getText().toString().equals(x.get(2))){
            r3c.setChecked(true);
        } else if (r3d.getText().toString().equals(x.get(2))){
            r3d.setChecked(true);
            r3d.setTextColor(getResources().getColor(R.color.colorRed));
        }

        if (r4a.getText().toString().equals(x.get(3))){
            r4a.setChecked(true);
            r4a.setTextColor(getResources().getColor(R.color.colorRed));
        } else if (r4b.getText().toString().equals(x.get(3))){
            r4b.setChecked(true);
        } else if (r4c.getText().toString().equals(x.get(3))){
            r4c.setChecked(true);
            r4c.setTextColor(getResources().getColor(R.color.colorRed));
        } else if (r4d.getText().toString().equals(x.get(3))){
            r4d.setChecked(true);
            r4d.setTextColor(getResources().getColor(R.color.colorRed));
        }

        if (r5a.getText().toString().equals(x.get(4))){
            r5a.setChecked(true);
        } else if (r5b.getText().toString().equals(x.get(4))){
            r5b.setChecked(true);
            r5b.setTextColor(getResources().getColor(R.color.colorRed));
        } else if (r5c.getText().toString().equals(x.get(4))){
            r5c.setChecked(true);
            r5c.setTextColor(getResources().getColor(R.color.colorRed));
        } else if (r5d.getText().toString().equals(x.get(4))){
            r5d.setChecked(true);
            r5d.setTextColor(getResources().getColor(R.color.colorRed));
        }

    }

    public void kembalikemenu1(View view){
        startActivity(new Intent(KunciKuis1.this,MainActivity.class));
        finish();
    }

    public void brd6(View view){
        startActivity(new Intent(KunciKuis1.this,MainActivity.class));
        finish();
    }

    public void TutorialBox1(){
        tutorDialog = new Dialog(KunciKuis1.this);
        tutorDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        tutorDialog.setContentView(R.layout.pbs1);

        tutorDialog.show();
    }

    public void TutorialBox2(){
        tutorDialog = new Dialog(KunciKuis1.this);
        tutorDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        tutorDialog.setContentView(R.layout.pbs2);

        tutorDialog.show();
    }

    public void TutorialBox3(){
        tutorDialog = new Dialog(KunciKuis1.this);
        tutorDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        tutorDialog.setContentView(R.layout.pbs3);

        tutorDialog.show();
    }

    public void TutorialBox4(){
        tutorDialog = new Dialog(KunciKuis1.this);
        tutorDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        tutorDialog.setContentView(R.layout.pbs4);

        tutorDialog.show();
    }

    public void TutorialBox5(){
        tutorDialog = new Dialog(KunciKuis1.this);
        tutorDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        tutorDialog.setContentView(R.layout.pbs5);

        tutorDialog.show();
    }

    public void pbs1(View view){
        TutorialBox1();
    }

    public void pbs2(View view){
        TutorialBox2();
    }

    public void pbs3(View view){
        TutorialBox3();
    }

    public void pbs4(View view){
        TutorialBox4();
    }

    public void pbs5(View view){
        TutorialBox5();
    }
}
