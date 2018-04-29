package com.example.android.sibadat;

import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    Button tutorial;
    Dialog tutorDialog;
    Button oke;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tutorial = (Button) findViewById(R.id.tutorial);

        tutorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TutorialBox();
            }
        });
    }

    public void Materi(View view){
        Intent intent = new Intent(MainActivity.this,ModulMateri.class);
        startActivity(intent);
        finish();
    }

    public void Profil(View view){
        Intent intent = new Intent(MainActivity.this,Profile.class);
        startActivity(intent);
        finish();
    }

    public void Statistik(View view){
        Intent intent = new Intent(MainActivity.this,StatistikNilai.class);
        startActivity(intent);
        finish();
    }

    public void Kuis(View view){
        Intent intent = new Intent(MainActivity.this,ModulKuis.class);
        startActivity(intent);
        finish();
    }

    public void TutorialBox(){
        tutorDialog = new Dialog(MainActivity.this);
        tutorDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        tutorDialog.setContentView(R.layout.tutorial);
        oke = (Button) tutorDialog.findViewById(R.id.okeb);
        oke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tutorDialog.cancel();
            }
        });

        tutorDialog.show();
    }

    public void help(View view){
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:" + "nadyadtm17@gmail.com")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_EMAIL, "nadyadtm17@gmail.com");
        intent.putExtra(Intent.EXTRA_SUBJECT, "Help");
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}
