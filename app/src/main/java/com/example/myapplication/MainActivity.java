package com.example.myapplication;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RatingBar;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;




public class MainActivity extends AppCompatActivity {
    RatingBar ratingBar;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ratingBar = findViewById(R.id.rb);
        button=findViewById(R.id.btn);

        addListnerToButton();


    }
    public  void  addListnerToButton(){

        button.setOnClickListener((v)->{

            String rating = String.valueOf(ratingBar.getRating());

            Toast.makeText(getApplicationContext(), rating, Toast.LENGTH_SHORT).show();

        });
    }



}