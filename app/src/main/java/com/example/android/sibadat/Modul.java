package com.example.android.sibadat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

import static android.R.attr.button;
import static com.google.android.youtube.player.YouTubePlayer.FULLSCREEN_FLAG_CONTROL_ORIENTATION;
import static com.google.android.youtube.player.YouTubePlayer.FULLSCREEN_FLAG_CONTROL_SYSTEM_UI;

public class Modul extends YouTubeBaseActivity {
    YouTubePlayerView youTubePlayerView;
    YouTubePlayer.OnInitializedListener onInitializedListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modul);

        youTubePlayerView = (YouTubePlayerView) findViewById(R.id.video);
        onInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("c2NjHFdUC14");
                youTubePlayer.setFullscreenControlFlags(FULLSCREEN_FLAG_CONTROL_ORIENTATION);
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };
         youTubePlayerView.initialize(PlayerConfig.API_KEY,onInitializedListener);

    }

    public void mulaiKuis(View view){
        startActivity(new Intent(Modul.this,Kuiz.class));
        finish();
    }

    public void mtrshrt(View view){
        startActivity(new Intent(Modul.this,ModulMateri.class));
        finish();
    }

    public void brdshrt1(View view){
        Intent intent = new Intent(Modul.this,MainActivity.class);
        startActivity(intent);
        finish();
    }

    /*public void onBackPressed(){
        Intent intent = new Intent(Modul.this,ModulMateri.class);
        startActivity(intent);
        finish();
    }*/

}
