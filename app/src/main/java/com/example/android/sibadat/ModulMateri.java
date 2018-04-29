package com.example.android.sibadat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ModulMateri extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modul_materi);
    }

    public void modul1(View view){
        Intent intent = new Intent(ModulMateri.this,Modul.class);
        startActivity(intent);
    }

    public void mod2(View view){
        Intent intent = new Intent(ModulMateri.this,modul2.class);
        startActivity(intent);
    }

    public void brdshrt(View view){
        Intent intent = new Intent(ModulMateri.this,MainActivity.class);
        startActivity(intent);
        finish();
    }

    public void onBackPressed(){
        Intent intent = new Intent(ModulMateri.this,MainActivity.class);
        startActivity(intent);
        finish();
    }

}
