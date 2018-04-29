package com.example.android.sibadat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class HasilKuis extends AppCompatActivity {

    ArrayList<String> rdJawaban;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_kuis);

        Intent i = getIntent();
        int score = i.getExtras().getInt("score");
        rdJawaban = (ArrayList<String>) i.getSerializableExtra("rdJawaban");
        Log.v("nilai pertama : ",rdJawaban.get(0));
        TextView scoreText = (TextView) findViewById(R.id.score);
        String str = Integer.toString(score);
        scoreText.setText(str);
    }

    public void hasil(View view){
        Intent intent = new Intent(HasilKuis.this,KunciKuis1.class);
        intent.putExtra("rdJawaban",rdJawaban);
        startActivity(intent);
        finish();
    }

    public void statistik(View view){
        Intent intent = new Intent(HasilKuis.this,StatistikNilai.class);
        startActivity(intent);
        finish();
    }

    public void ulangikuis(View View){
        Intent intent = new Intent(HasilKuis.this,Modul.class);
        startActivity(intent);
        finish();
    }

    public void brd4(View view){
        Intent intent = new Intent(HasilKuis.this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}
