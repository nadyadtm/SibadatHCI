package com.example.android.sibadat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class LupaPassword extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lupa_password);
        textView = (TextView) findViewById(R.id.messageLupa);
        textView.setVisibility(View.INVISIBLE);
    }

    public void Selesai(View view){
        textView.setVisibility(View.VISIBLE);
        textView.setText("Password Baru telah dikirim ke email anda, silakan cek email anda.");
    }
}
