package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    // Creating the Variable to Access the value from UI
    private EditText editText1,editText2;
    private Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        // Here We are finding and assigning the value to our variable by using id
        editText1=findViewById(R.id.et1);
        editText2=findViewById(R.id.et2);
        btn=findViewById(R.id.bt1);

        addButtonListener();

    }
    public  void addButtonListener(){

    // Here we are setting a listener on our button
        btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                // here we are getting user input value
                String value1=editText1.getText().toString();
                String value2=editText2.getText().toString();
                // here we are converting String into int
                int a=Integer.parseInt(value1);
                int b=Integer.parseInt(value2);
                // here we are add two values
                int sum=a+b;
                // here we are displaying the toast message
                Toast.makeText(getApplicationContext(),String.valueOf(sum), Toast.LENGTH_LONG).show();
            }


        });

    }

}