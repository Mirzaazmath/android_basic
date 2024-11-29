package com.example.myapplication;
import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.data.DataModel;


public class MainActivity extends AppCompatActivity {

    // Created a ListView Variable
    ListView listView;

// Created a List Of Titles
    String[] maintitle ={
            "Drive","Google",
            "Instagram","Twitter",
            "Youtube",
    };
    // Created a List Of SubTitle
    String[] subtitle ={
            "Sub Title 1","Sub Title 2",
            "Sub Title 3","Sub Title 4",
            "Sub Title 5",
    };
/// Note : I Have Added all Images in Drawable folder or Res
    Integer[] imgid={
            R.drawable.drive,R.drawable.google,
            R.drawable.insta,R.drawable.twitter,
            R.drawable.youtube,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        // Here we have Created a Custom Adapter  which extends from  ArrayAdapter ,
        // and we are passing values in parameters  and returning list or Row elements
        MyListAdapter adapter=new MyListAdapter(this, maintitle, subtitle,imgid);
        // here we are assigning the element to variable
        listView=(ListView)findViewById(R.id.listView);
        // here we are setting list of Row elements from MyListAdapter
        listView.setAdapter(adapter);

    }


}