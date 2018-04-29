package com.example.android.sibadat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

import static com.google.android.youtube.player.YouTubePlayer.FULLSCREEN_FLAG_CONTROL_ORIENTATION;

public class modul2 extends YouTubeBaseActivity {
    YouTubePlayerView youTubePlayerView;
    YouTubePlayer.OnInitializedListener onInitializedListener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modul2);

        youTubePlayerView = (YouTubePlayerView) findViewById(R.id.video2);
        onInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("KMlNvQE1lhA");
                youTubePlayer.setFullscreenControlFlags(FULLSCREEN_FLAG_CONTROL_ORIENTATION);
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };
        youTubePlayerView.initialize(PlayerConfig.API_KEY,onInitializedListener);
    }

    public void mulaiKuis2(View view){
        startActivity(new Intent(modul2.this,Kuiz2.class));
        finish();
    }

    public void mtrshrt2(View view){
        startActivity(new Intent(modul2.this,ModulMateri.class));
        finish();
    }

    public void brdshrt2(View view){
        Intent intent = new Intent(modul2.this,MainActivity.class);
        startActivity(intent);
        finish();
    }

    /*public void onBackPressed(){
        Intent intent = new Intent(modul2.this,ModulMateri.class);
        startActivity(intent);
        finish();
    }*/
}
