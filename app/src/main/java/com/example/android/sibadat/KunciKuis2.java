package com.example.android.sibadat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;

import java.util.ArrayList;

public class KunciKuis2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kunci_kuis2);


        Intent i = getIntent();
        ArrayList<String> x = (ArrayList<String>) i.getSerializableExtra("rdJawaban");
        RadioButton r1a = (RadioButton) findViewById(R.id.pilihana12);
        RadioButton r1b = (RadioButton) findViewById(R.id.pilihanb12);
        RadioButton r1c = (RadioButton) findViewById(R.id.pilihanc12);
        RadioButton r1d = (RadioButton) findViewById(R.id.pilihand12);
        RadioButton r2a = (RadioButton) findViewById(R.id.pilihana21);
        RadioButton r2b = (RadioButton) findViewById(R.id.pilihanb21);
        RadioButton r2c = (RadioButton) findViewById(R.id.pilihanc21);
        RadioButton r2d = (RadioButton) findViewById(R.id.pilihand21);
        RadioButton r3a = (RadioButton) findViewById(R.id.pilihana32);
        RadioButton r3b = (RadioButton) findViewById(R.id.pilihanb32);
        RadioButton r3c = (RadioButton) findViewById(R.id.pilihanc32);
        RadioButton r3d = (RadioButton) findViewById(R.id.pilihand32);
        RadioButton r4a = (RadioButton) findViewById(R.id.pilihana42);
        RadioButton r4b = (RadioButton) findViewById(R.id.pilihanb42);
        RadioButton r4c = (RadioButton) findViewById(R.id.pilihanc42);
        RadioButton r4d = (RadioButton) findViewById(R.id.pilihand42);
        RadioButton r5a = (RadioButton) findViewById(R.id.pilihana52);
        RadioButton r5b = (RadioButton) findViewById(R.id.pilihanb52);
        RadioButton r5c = (RadioButton) findViewById(R.id.pilihanc52);
        RadioButton r5d = (RadioButton) findViewById(R.id.pilihand52);

        Log.v("Nilai pertama",x.get(0));


        if (r1a.getText().toString().equals(x.get(0))){
            r1a.setChecked(true);
            r1a.setTextColor(getResources().getColor(R.color.colorRed));
        } else if (r1b.getText().toString().equals(x.get(0))){
            r1b.setChecked(true);
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
        } else if (r2c.getText().toString().equals(x.get(1))){
            r2c.setChecked(true);
            r2c.setTextColor(getResources().getColor(R.color.colorRed));
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
            r3c.setTextColor(getResources().getColor(R.color.colorRed));
        } else if (r3d.getText().toString().equals(x.get(2))){
            r3d.setChecked(true);
        }

        if (r4a.getText().toString().equals(x.get(3))){
            r4a.setChecked(true);
            r4a.setTextColor(getResources().getColor(R.color.colorRed));
        } else if (r4b.getText().toString().equals(x.get(3))){
            r4b.setChecked(true);
            r4b.setTextColor(getResources().getColor(R.color.colorRed));
        } else if (r4c.getText().toString().equals(x.get(3))){
            r4c.setChecked(true);
        } else if (r4d.getText().toString().equals(x.get(3))){
            r4d.setChecked(true);
            r4d.setTextColor(getResources().getColor(R.color.colorRed));
        }

        if (r5a.getText().toString().equals(x.get(4))){
            r5a.setChecked(true);
            r5a.setTextColor(getResources().getColor(R.color.colorRed));
        } else if (r5b.getText().toString().equals(x.get(4))){
            r5b.setChecked(true);
            r5b.setTextColor(getResources().getColor(R.color.colorRed));
        } else if (r5c.getText().toString().equals(x.get(4))){
            r5c.setChecked(true);
        } else if (r5d.getText().toString().equals(x.get(4))){
            r5d.setChecked(true);
            r5d.setTextColor(getResources().getColor(R.color.colorRed));
        }
    }

    public void kembalikemenu2(View view){
        startActivity(new Intent(KunciKuis2.this,MainActivity.class));
        finish();
    }

    public void brd7(View view){
        startActivity(new Intent(KunciKuis2.this,MainActivity.class));
        finish();
    }


}
