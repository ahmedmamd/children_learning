package com.example.mashal.testchild.views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.mashal.testchild.R;
import com.example.mashal.testchild.youtupe.A_learn;
import com.example.mashal.testchild.youtupe.A_song;

public class arbicviews extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arbicviews);

        Button puzzel=(Button)findViewById(R.id.puzzel);
        Button song=(Button)findViewById(R.id.song);
        Button learn=(Button)findViewById(R.id.learn);
        song.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getBaseContext(),A_song.class);
                startActivity(intent);
            }
        });
        learn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getBaseContext(),A_learn.class);
                startActivity(intent);
            }
        });
    }}



