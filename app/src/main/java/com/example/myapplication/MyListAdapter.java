package com.example.myapplication;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class MyListAdapter extends ArrayAdapter<String> {
    private  final Activity  context;
    private final String[] maintitle;
    private final String[] subtitle;
    private final Integer[] imgid;

    public MyListAdapter(Activity context, String[] maintitle,String[] subtitle, Integer[] imgid) {
        super(context, R.layout.my_list_tile, maintitle);
        // TODO Auto-generated constructor stub

        this.context=context;
        this.maintitle=maintitle;
        this.subtitle=subtitle;
        this.imgid=imgid;

    }
    @NonNull
    /// This Method Iterate the Loop and return list of Value elements
    public View getView(int position, View view, ViewGroup parent) {
        // here we are creating a inflater to find our Xml from our Project
        LayoutInflater inflater=context.getLayoutInflater();
        @SuppressLint({"ViewHolder", "InflateParams"})
                /// Here we are  View that is nothing but  my_list_tile xml View;
        View rowView=inflater.inflate(R.layout.my_list_tile, null,true);
        /// Creating object  and assign value by rowView.findViewById
        TextView titleText = (TextView) rowView.findViewById(R.id.title);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
        TextView subtitleText = (TextView) rowView.findViewById(R.id.subtitle);
        // here we are setting values to the view
        titleText.setText(maintitle[position]);
        imageView.setImageResource(imgid[position]);
        subtitleText.setText(subtitle[position]);
       // Here we are retuning the view
        return rowView;

    };

}
