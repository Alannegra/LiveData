package com.example.livedata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView xd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        xd = findViewById(R.id.loko);



        xd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             xd.animate().rotation(360f);

            }
        });

    }
}