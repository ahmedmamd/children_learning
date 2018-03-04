package com.example.mashal.testchild.views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.mashal.testchild.R;
import com.example.mashal.testchild.youtupe.E_learn;
import com.example.mashal.testchild.youtupe.E_songe;

public class E_view extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e_view);

        Button puzzel=(Button)findViewById(R.id.E_puzzel);
        Button song=(Button)findViewById(R.id.E_song);
        Button learn=(Button)findViewById(R.id.E_learn);
        song.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),E_songe.class);
                startActivity(intent);
            }
        });
        learn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),E_learn.class);
                startActivity(intent);
            }
        });

    }
}
