package com.example.myapplication;
import android.os.Bundle;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;




public class MainActivity extends AppCompatActivity {
    // Created Variable
    DatePicker datePicker;
    TextView textView;
     Button button;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        // Assigning value to variable based on id
        datePicker = findViewById(R.id.date1);
        textView= findViewById(R.id.txt1);
        button = findViewById(R.id.btn1);
      // Adding Listener
        button.setOnClickListener((v)->{
            textView.setText("Selected Date :"+ getDate());
        });

    }

    public String getDate(){
        StringBuilder builder =new StringBuilder();
        // Getting Year
        builder.append(datePicker.getYear()).append("/");
        // Getting Month
        builder.append(datePicker.getMonth()+1).append("/");
        // Getting Day
        builder.append(datePicker.getDayOfMonth());
        return builder.toString();

    }





}