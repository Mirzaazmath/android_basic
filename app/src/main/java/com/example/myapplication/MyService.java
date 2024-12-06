package com.example.myapplication;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class MyService extends Service {
    // here are creating the MediaPlayer object to access the native media player
    MediaPlayer myPlayer;
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Toast.makeText(this, "Service Created", Toast.LENGTH_SHORT).show();
        // here we are creating the player and also setting the file
        myPlayer= MediaPlayer.create(this,R.raw.song);
        // here we are setting loop to false
        myPlayer.setLooping(false); // Set looping

    }

    @Override
    public int onStartCommand(Intent intent,int flags, int startId) {
        super.onStart(intent, startId);
        Log.d("DEBUGTAG", "In onStart.");
        // here we are starting our player
        myPlayer.start();
        return Service.START_STICKY_COMPATIBILITY;
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Service Stopped", Toast.LENGTH_LONG).show();
        // here we are stopping our player
        myPlayer.stop();
    }
}
