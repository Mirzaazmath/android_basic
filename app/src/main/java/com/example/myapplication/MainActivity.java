package com.example.myapplication;
import android.os.Bundle;
import android.widget.Button;

import android.widget.TextView;
import android.widget.TimePicker;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;




public class MainActivity extends AppCompatActivity {
    // Created Variable
    TimePicker timePicker;
    TextView textView;
     Button button;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        // Assigning value to variable based on id
        timePicker = findViewById(R.id.time1);
        textView= findViewById(R.id.txt1);
        button = findViewById(R.id.btn1);
      // Adding Listener
        button.setOnClickListener((v)->{
            textView.setText("Selected Time : "+ getTime());
        });

    }

    public String getTime(){
        StringBuilder builder =new StringBuilder();
        // Getting Hour
        builder.append(timePicker.getHour()).append(":");
        // Getting Minute
        builder.append(timePicker.getMinute());
        // Returning String
        return builder.toString();

    }





}