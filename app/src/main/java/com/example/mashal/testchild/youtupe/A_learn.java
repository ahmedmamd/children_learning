package com.example.mashal.testchild.youtupe;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.mashal.testchild.R;
import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class A_learn extends YouTubeBaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_learn);
        YouTubePlayerView youTubePlayerView=(YouTubePlayerView)findViewById(R.id.arbic_learn);
        youTubePlayerView.initialize("AIzaSyANRcgUdSaY9B-vJMXfoFgLh4edetGzVD4", new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.cuePlaylist("PL9rg0qAUI14Mx3fA_qOr8Bfy_GKO-eXli");
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
                Toast.makeText(getBaseContext(),"failier",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
