package com.example.myapplication;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

// To use the Dropdown Menu we need to implements our class with  AdapterView.OnItemSelectedListener
public class MainActivity extends AppCompatActivity  implements AdapterView.OnItemSelectedListener {
// Here we are Creating the list of String
String[] country={"India","Spain","Russia","USA"};
String selectedCountry = "";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        //Getting the instance of Spinner and applying OnItemSelectedListener on it
        Spinner spin =  findViewById(R.id.spiner);
        spin.setOnItemSelectedListener(this);
       //Creating the ArrayAdapter instance having the country list
        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,country);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //Setting the ArrayAdapter data on the Spinner
        spin.setAdapter(aa);


    }
    //Performing action onItemSelected and onNothing selected

    public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {
        selectedCountry=country[position];
        Toast.makeText(getApplicationContext(),country[position] , Toast.LENGTH_LONG).show();
        System.out.println(selectedCountry);
    }
    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }

}