package com.example.myapplication;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    Button shareButton;







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        shareButton = findViewById(R.id.shareBtn1);
        shareButton.setOnClickListener((v -> {
            // here we are creating a new intent for Share
            Intent shareIntent=new Intent(Intent.ACTION_SEND);
            //  here we are setting type
            shareIntent.setType("text/Plain");
            shareIntent.putExtra(Intent.EXTRA_SUBJECT,"Insert Subject here");
            String app_url = " https://play.google.com/store/apps/details?id=my.example.javatpoint";
            // here we are add url to our share intent
            shareIntent.putExtra(android.content.Intent.EXTRA_TEXT,app_url);
            // here we are starting the intent
            startActivity(Intent.createChooser(shareIntent, "Share via"));

        }));



    }

}



