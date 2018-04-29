package com.example.android.sibadat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class hasil2 extends AppCompatActivity {
    ArrayList<String> rdJawaban;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil2);


        Intent i = getIntent();
        int score = i.getExtras().getInt("score");
        rdJawaban = (ArrayList<String>) i.getSerializableExtra("rdJawaban");
        TextView scoreText = (TextView) findViewById(R.id.score1);
        String str = Integer.toString(score);
        scoreText.setText(str);
    }

    public void hasil1(View view){
        Intent intent = new Intent(hasil2.this,KunciKuis2.class);
        intent.putExtra("rdJawaban",rdJawaban);
        startActivity(intent);
        finish();
    }

    public void statistik1(View view){
        Intent intent = new Intent(hasil2.this,StatistikNilai.class);
        startActivity(intent);
        finish();
    }

    public void ulangikuis1(View View){
        Intent intent = new Intent(hasil2.this,modul2.class);
        startActivity(intent);
        finish();
    }

    public void brd5(View view){
        Intent intent = new Intent(hasil2.this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}
