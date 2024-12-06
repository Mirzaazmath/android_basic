package com.example.myapplication;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    Button startBtn,stopBtn,nextBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        nextBtn = findViewById(R.id.next);
        startBtn = findViewById(R.id.start);
        stopBtn = findViewById(R.id.stop);
        // Here we are Creating the navigatorIntent
        Intent navigatorIntent=new Intent(getApplicationContext(), SecondActivity.class);
        nextBtn.setOnClickListener((v)-> {
            startActivity(navigatorIntent);
        });

        startBtn.setOnClickListener((v)-> {
            // Here we are Starting the service that we have created
           startService(new Intent(this,MyService.class));
        });
        stopBtn.setOnClickListener((v)-> {
             // Here we are Stopping the service that we have created
            stopService(new Intent(this, MyService.class));
        });



    }

}



