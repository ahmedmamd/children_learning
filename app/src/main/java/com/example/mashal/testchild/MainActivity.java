package com.example.mashal.testchild;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.mashal.testchild.model.modell;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         onclick();

    }
    public void onclick(){
        RecyclerView recyclerView;
        ArrayList<modell> data =new ArrayList<>();
        String name []={"دين","انجليزي","عربي","رياضة","كرتون","اغاني","قصص","رسام"};
        int image[]={R.drawable.dean ,R.drawable.abc,R.drawable.arbic,R.drawable.num,R.drawable.carton,R.drawable.songs,R.drawable.dean,R.drawable.carton};
        for (int i=0;i<name.length;i++){
            modell variable=new modell();
            variable.setData(name[i]);
            variable.setImage(image[i]);
            data.add(variable);
        }
        recyclerView=(RecyclerView)findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adaptor products=new adaptor(data,this);
        recyclerView.setAdapter(products);
    }

}
