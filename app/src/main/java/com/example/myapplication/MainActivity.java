package com.example.myapplication;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


// Note:
//Tto Use WebView we need to Pass Internet permission in android manifest file


public class MainActivity extends AppCompatActivity {
// Created a variable
WebView webView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        // Find UI element by Id
        webView = findViewById(R.id.web1);
        // Here we are enabling javaScript
        webView.getSettings().setJavaScriptEnabled(true);
        // Here we are Setting setWebViewClient setWebViewClient to use the web with our app
        // if we don't use this then everytime we click on webPage it will open in browser
        webView.setWebViewClient(new WebViewClient());
        // Loading the website
        webView.loadUrl("https://www.javatpoint.com/");






    }




}