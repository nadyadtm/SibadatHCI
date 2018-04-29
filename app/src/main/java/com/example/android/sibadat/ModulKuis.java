package com.example.android.sibadat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ModulKuis extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modul_kuis);
    }

    public void modul11(View view){
        Intent intent = new Intent(ModulKuis.this,Kuiz.class);
        startActivity(intent);
    }

    public void modul22(View view){
        Intent intent = new Intent(ModulKuis.this,Kuiz2.class);
        startActivity(intent);
    }

    public void brd(View view){
        Intent intent = new Intent(ModulKuis.this,MainActivity.class);
        startActivity(intent);
        finish();
    }

    public void onBackPressed(){
        Intent intent = new Intent(ModulKuis.this,MainActivity.class);
        startActivity(intent);
        finish();
    }

}
