package com.example.mashal.testchild.views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.mashal.testchild.R;
import com.example.mashal.testchild.youtupe.E_songe;
import com.example.mashal.testchild.youtupe.M_learn;

public class math extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math);

        Button puzzel=(Button)findViewById(R.id.Math_puzzel);
        Button learn=(Button)findViewById(R.id.Math_learn);
        learn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),M_learn.class);
                startActivity(intent);
            }
        });
    }
}
