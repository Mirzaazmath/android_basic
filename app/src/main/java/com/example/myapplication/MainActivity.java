package com.example.myapplication;
import android.app.ActionBar;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.ViewSwitcher;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {
SeekBar seekBar;
ImageSwitcher imageSwitcher;

int[] imageSwitcherImages ={R.drawable.youtube,R.drawable.twitter,R.drawable.insta,R.drawable.google,R.drawable.drive};

int imageSwitcherLenght=imageSwitcherImages.length;
int counter =-1;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        imageSwitcher = findViewById(R.id.imageSwitcher);
        seekBar = findViewById(R.id.seekBar);

        imageSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView switcherImage=new ImageView(getApplicationContext());
                switcherImage.setLayoutParams(new ImageSwitcher.LayoutParams(
                        ActionBar.LayoutParams.FILL_PARENT, ActionBar.LayoutParams.FILL_PARENT
                ));
                switcherImage.setScaleType(ImageView.ScaleType.FIT_CENTER);
                switcherImage.setImageResource(R.drawable.youtube);
                //switcherImageView.setMaxHeight(100);
                return switcherImage;
            }
        });
        Animation aniOut =  AnimationUtils.loadAnimation(this, android.R.anim.fade_out);
        Animation aniIN =  AnimationUtils.loadAnimation(this, android.R.anim.fade_in);

        imageSwitcher.setOutAnimation(aniOut);
        imageSwitcher.setInAnimation(aniIN);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                if (progress<20){
                    imageSwitcher.setImageResource(imageSwitcherImages[0]);
                } else  if (progress<40 && progress>20){
                    imageSwitcher.setImageResource(imageSwitcherImages[1]);
                }else  if (progress<60 && progress>40){
                    imageSwitcher.setImageResource(imageSwitcherImages[2]);
                }else  if (progress<80 && progress>60){
                    imageSwitcher.setImageResource(imageSwitcherImages[3]);
                }else  if (progress<100 && progress>80){
                    imageSwitcher.setImageResource(imageSwitcherImages[4]);
                }



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
    }



