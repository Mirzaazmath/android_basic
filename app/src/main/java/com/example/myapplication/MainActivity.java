package com.example.myapplication;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        // Here we are creating one Intent that act as navigator and passing context and Activity (where you want to navigate)
        Intent navigatorIntent = new Intent(this, SecondActivity.class);
        Button btn= findViewById(R.id.btn1);
        // here we are Creating an object to pass to another activity
        House modelData= new House(1000,"Hyderabd",false,new ArrayList<>());
        // here we are creating OnClickListener
        btn.setOnClickListener((v)->{
            // here we are putting some data to another screen
            navigatorIntent.putExtra("val1","My Name is Khan");
            navigatorIntent.putExtra("val2","My Name is Mirza");
            navigatorIntent.putExtra("model",modelData);
            // here we are starting the intent
            startActivity(navigatorIntent);
        });

    }

}



