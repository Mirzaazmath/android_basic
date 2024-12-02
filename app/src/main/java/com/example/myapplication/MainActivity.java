package com.example.myapplication;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;




public class MainActivity extends AppCompatActivity {

SeekBar seekBar;
Toast m_currentToast;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        seekBar = findViewById(R.id.seekbar1);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

//                Toast.makeText(MainActivity.this, "Progress :"+progress, Toast.LENGTH_SHORT).show();
                showToast(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
               // Toast.makeText(MainActivity.this, "Progress Starts", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
               // Toast.makeText(MainActivity.this, "Progress Ends", Toast.LENGTH_SHORT).show();

            }
        });


    }
    void showToast(int text)
    {
        if(m_currentToast != null)
        {
            m_currentToast.cancel();
        }
        m_currentToast = Toast.makeText(this, "Progress : "+text, Toast.LENGTH_LONG);
        m_currentToast.show();

    }




}