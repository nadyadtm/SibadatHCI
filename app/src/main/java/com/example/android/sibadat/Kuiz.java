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

public class Kuiz extends AppCompatActivity {

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
        setContentView(R.layout.activity_kuiz);
        radioButtona1 = (RadioButton) findViewById(R.id.pilihana1);
        radioButtonb1 = (RadioButton) findViewById(R.id.pilihanb1);
        radioButtonc1 = (RadioButton) findViewById(R.id.pilihanc1);
        radioButtond1= (RadioButton) findViewById(R.id.pilihand1);
        radioButtona2 = (RadioButton) findViewById(R.id.pilihana2);
        radioButtonb2 = (RadioButton) findViewById(R.id.pilihanb2);
        radioButtonc2 = (RadioButton) findViewById(R.id.pilihanc2);
        radioButtond2 = (RadioButton) findViewById(R.id.pilihand2);
        radioButtona3 = (RadioButton) findViewById(R.id.pilihana3);
        radioButtonb3  = (RadioButton) findViewById(R.id.pilihanb3);
        radioButtonc3 = (RadioButton) findViewById(R.id.pilihanc3);
        radioButtond3  = (RadioButton) findViewById(R.id.pilihand3);
        radioButtona4  = (RadioButton) findViewById(R.id.pilihana4);
        radioButtonb4  = (RadioButton) findViewById(R.id.pilihanb4);
        radioButtonc4  = (RadioButton) findViewById(R.id.pilihanc4);
        radioButtond4  = (RadioButton) findViewById(R.id.pilihand4);
        radioButtona5   = (RadioButton) findViewById(R.id.pilihana5);
        radioButtonb5 = (RadioButton) findViewById(R.id.pilihanb5);
        radioButtonc5 = (RadioButton) findViewById(R.id.pilihanc5);
        radioButtond5  = (RadioButton) findViewById(R.id.pilihand5);
    }

    public void selesai(View view){

        AlertDialog.Builder builder=new AlertDialog.Builder(Kuiz.this);
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

                if (radioButtona1.isChecked()){
                    score = score + 20;
                }
                if (radioButtonc2.isChecked()){
                    score = score + 20;
                }
                if (radioButtonc3.isChecked()){
                    score = score + 20;
                }
                if (radioButtonb4.isChecked()){
                    score = score + 20;
                }
                if (radioButtona5.isChecked()){
                    score = score + 20;
                }
                String scr = Integer.toString(score);
                Log.v("score ",scr);
                Intent intent = new Intent(Kuiz.this,HasilKuis.class);
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

    public void brd2(View view){
        Intent intent = new Intent(Kuiz.this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}
