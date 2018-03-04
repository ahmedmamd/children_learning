package com.example.mashal.testchild.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.mashal.testchild.R;
import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class dean extends YouTubeBaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dean);

        YouTubePlayerView youTubePlayerView=(YouTubePlayerView)findViewById(R.id.youtupe_id);
        youTubePlayerView.initialize("AIzaSyANRcgUdSaY9B-vJMXfoFgLh4edetGzVD4", new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
             youTubePlayer.cuePlaylist("PLs49icgnNB200JbRS3aBF2TSPXF0onPiL");
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
                Toast.makeText(getBaseContext(),"failier",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
