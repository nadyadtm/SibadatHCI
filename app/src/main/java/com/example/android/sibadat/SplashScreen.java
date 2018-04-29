package com.example.android.sibadat;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {
    private final int SPLASH_DISPLAY_LENGHT=2500;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mainIntent = new Intent(SplashScreen.this,LoginActivity.class);//pindah page
                SplashScreen.this.startActivity(mainIntent);//mulai activity dari main intent (mengubah dari splashscreen ke main activity)
                SplashScreen.this.finish();
            }
        }, SPLASH_DISPLAY_LENGHT);
    }
}
