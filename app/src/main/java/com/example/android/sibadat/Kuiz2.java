package com.example.android.sibadat;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;

import java.util.ArrayList;

import static com.example.android.sibadat.R.id.score;

public class Kuiz2 extends AppCompatActivity {

    RadioButton radioButtona1;
    RadioButton radioButtonb1;
    RadioButton radioButtonc1;
    RadioButton radioButtond1;
    RadioButton radioButtona2;
    RadioButton radioButtonb2;
    RadioButton radioButtonc2;
    RadioButton radioButtond2;
    RadioButton radioButtona3;
    RadioButton radioButtonb3;
    RadioButton radioButtonc3;
    RadioButton radioButtond3;
    RadioButton radioButtona4;
    RadioButton radioButtonb4;
    RadioButton radioButtonc4;
    RadioButton radioButtond4;
    RadioButton radioButtona5;
    RadioButton radioButtonb5;
    RadioButton radioButtonc5;
    RadioButton radioButtond5;
    ArrayList<String> rdJawaban;
    int score = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuiz2);

        radioButtona1 = (RadioButton) findViewById(R.id.pilihana111);
        radioButtonb1 = (RadioButton) findViewById(R.id.pilihanb111);
        radioButtonc1 = (RadioButton) findViewById(R.id.pilihanc111);
        radioButtond1= (RadioButton) findViewById(R.id.pilihand111);
        radioButtona2 = (RadioButton) findViewById(R.id.pilihana222);
        radioButtonb2 = (RadioButton) findViewById(R.id.pilihanb222);
        radioButtonc2 = (RadioButton) findViewById(R.id.pilihanc222);
        radioButtond2 = (RadioButton) findViewById(R.id.pilihand222);
        radioButtona3 = (RadioButton) findViewById(R.id.pilihana333);
        radioButtonb3  = (RadioButton) findViewById(R.id.pilihanb333);
        radioButtonc3 = (RadioButton) findViewById(R.id.pilihanc333);
        radioButtond3  = (RadioButton) findViewById(R.id.pilihand333);
        radioButtona4  = (RadioButton) findViewById(R.id.pilihana444);
        radioButtonb4  = (RadioButton) findViewById(R.id.pilihanb444);
        radioButtonc4  = (RadioButton) findViewById(R.id.pilihanc444);
        radioButtond4  = (RadioButton) findViewById(R.id.pilihand444);
        radioButtona5   = (RadioButton) findViewById(R.id.pilihana555);
        radioButtonb5 = (RadioButton) findViewById(R.id.pilihanb555);
        radioButtonc5 = (RadioButton) findViewById(R.id.pilihanc555);
        radioButtond5  = (RadioButton) findViewById(R.id.pilihand555);
    }

    public void selesai2(View view){
        AlertDialog.Builder builder=new AlertDialog.Builder(Kuiz2.this);
        builder.setCancelable(true);
        builder.setTitle("Konfirmasi");
        builder.setMessage("Apakah anda yakin?");
        builder.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                rdJawaban = new ArrayList<>();
                if (radioButtona1.isChecked()){
                    rdJawaban.add(radioButtona1.getText().toString());
                } else if (radioButtonb1.isChecked()){
                    rdJawaban.add(radioButtonb1.getText().toString());
                } else if (radioButtonc1.isChecked()){
                    rdJawaban.add(radioButtonc1.getText().toString());
                } else if (radioButtond1.isChecked()){
                    rdJawaban.add(radioButtond1.getText().toString());
                }

                if (radioButtona2.isChecked()){
                    rdJawaban.add(radioButtona2.getText().toString());
                }
                else if (radioButtonb2.isChecked()){
                    rdJawaban.add(radioButtonb2.getText().toString());
                }
                else if (radioButtonc2.isChecked()){
                    rdJawaban.add(radioButtonc2.getText().toString());
                }
                else if (radioButtond2.isChecked()){
                    rdJawaban.add(radioButtond2.getText().toString());
                }

                if (radioButtona3.isChecked()){
                    rdJawaban.add(radioButtona3.getText().toString());
                }
                else if (radioButtonb3.isChecked()){
                    rdJawaban.add(radioButtonb3.getText().toString());
                }
                else if (radioButtonc3.isChecked()){
                    rdJawaban.add(radioButtonc3.getText().toString());
                }
                else if (radioButtond3.isChecked()){
                    rdJawaban.add(radioButtond3.getText().toString());
                }

                if (radioButtona4.isChecked()){
                    rdJawaban.add(radioButtona4.getText().toString());
                }
                else if (radioButtonb4.isChecked()){
                    rdJawaban.add(radioButtonb4.getText().toString());
                }
                else if (radioButtonc4.isChecked()){
                    rdJawaban.add(radioButtonc4.getText().toString());
                }
                else if (radioButtond4.isChecked()){
                    rdJawaban.add(radioButtond4.getText().toString());
                }

                if (radioButtona5.isChecked()){
                    rdJawaban.add(radioButtona5.getText().toString());
                }
                else if (radioButtonb5.isChecked()){
                    rdJawaban.add(radioButtonb5.getText().toString());
                }
                else if (radioButtonc5.isChecked()){
                    rdJawaban.add(radioButtonc5.getText().toString());
                }
                else if (radioButtond5.isChecked()){
                    rdJawaban.add(radioButtond5.getText().toString());
                }

                if (radioButtonb1.isChecked()){
                    score = score + 20;
                }
                if (radioButtonb2.isChecked()){
                    score = score + 20;
                }
                if (radioButtond3.isChecked()){
                    score = score + 20;
                }
                if (radioButtonc4.isChecked()){
                    score = score + 20;
                }
                if (radioButtonc5.isChecked()){
                    score = score + 20;
                }
                String scr = Integer.toString(score);
                Log.v("score ",scr);
                Intent intent = new Intent(Kuiz2.this,hasil2.class);
                intent.putExtra("score",score);
                intent.putExtra("rdJawaban",rdJawaban);
                startActivity(intent);
                finish();
            }
        });
        builder.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        builder.create().show();
    }

    public void brd3(View view){
        Intent intent = new Intent(Kuiz2.this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}
