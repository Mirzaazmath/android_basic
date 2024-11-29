package com.example.myapplication;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    // Creating Variable for Accessing the element from  UI
    Button closeButton;
    // here we are creating AlertDialog.Builder to build the alert dialog
    AlertDialog.Builder builder;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        // Assigning the value to our Variable  using Id
        closeButton =findViewById(R.id.CloseBtn);
        // Here we are instance of Alert dialog
        builder=new AlertDialog.Builder(this);
       // Here we are Add Listener to Our Close Button
        closeButton.setOnClickListener((v)->{
            // here we are setting our message into out alert dialog
            builder.setMessage("Do you want to Close the App ?")
                    // Here we are setting weather our alert dialog is cancelable or not
                    .setCancelable(false).
                    // Here we are adding yes button to our alert dialog and also adding the listener to perform some tasks
                    setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int id) {
                    // if we use   finish(); it will close the entire application
                   // finish();
                    // here we are closing the alert dialog
                    dialog.cancel();
                    // here we are displaying the toast message
                    Toast.makeText(getApplicationContext(),"You have Pressed Yes", Toast.LENGTH_LONG).show();

                }
                        // Here we are adding yes button to our alert dialog and also adding the listener to perform some tasks
            }).setNegativeButton("No", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    // here we are closing the alert dialog
                    dialog.cancel();
                    // here we are displaying the toast message
                    Toast.makeText(getApplicationContext(),"You have Pressed No", Toast.LENGTH_LONG).show();
                }
                        // Here we are adding Title of our alert dialog
            }).setTitle("Android Alert Example");
           // here we are creating the alert dialog
            AlertDialog alert = builder.create();
            // here we are showing the alert dialog
            alert.show();

        });

    }


}