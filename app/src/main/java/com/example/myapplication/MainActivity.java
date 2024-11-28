package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    // Creating the Variable to Access the value from UI
    private CheckBox burger, pizza, chips, drinks,selectAll;
    private Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        // Call a Method to all logic
        addListenerToButton();
    }

    public void addListenerToButton() {
        burger = findViewById(R.id.cbB);
        pizza = findViewById(R.id.cbP);
        chips = findViewById(R.id.cbC);
        drinks = findViewById(R.id.cbD);
        selectAll=findViewById(R.id.cbA);
        btn =findViewById(R.id.btn1);

        selectAll.setOnCheckedChangeListener((buttonView, isChecked) -> {
            burger.setChecked(isChecked);
            pizza.setChecked(isChecked);
            chips.setChecked(isChecked);
            drinks.setChecked(isChecked);

        });



        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                int totalamount=0;
                StringBuilder result=new StringBuilder();
                result.append("Selected Items:");
                if(burger.isChecked()){
                  //  result.append("\nBurger 120Rs");
                    totalamount+=120;
                }
                if(pizza.isChecked()){
                    //result.append("\nPizza 100Rs");
                    totalamount+=100;
                }
                if(chips.isChecked()){
                   // result.append("\nChips 50Rs");
                    totalamount+=50;
                }
                if(drinks.isChecked()){
                   // result.append("\nDrinks 60Rs");
                    totalamount+=50;
                }

                result.append("\nTotal: "+totalamount+"Rs");
                //Displaying the message on the toast
                Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_LONG).show();
            }
        });


    }


}