package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second);
        // here we are creating the  Bundle to access the send data
        Bundle extras = getIntent().getExtras();
        // Here we are creating one Intent that act as navigator and passing context and Activity (where you want to navigate)
        Intent navigatorIntent = new Intent(this, MainActivity.class);
        Button btn= findViewById(R.id.btn1);
        TextView textView1= findViewById(R.id.val1);
        TextView textView2= findViewById(R.id.val2);
        House houseData;
        // here we are setting the value which we have send through intent
        textView1.setText(extras.getString("val1"));
        textView2.setText(extras.getString("val2"));
        // if we need to get model data then we need to use parcel
        houseData= extras.getParcelable("model");
        // here we are printing
        System.out.println(houseData.getLocation());
        btn.setOnClickListener((v)->{
            startActivity(navigatorIntent);
        });

    }
}