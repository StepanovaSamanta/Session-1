package com.example.wsrfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class LaunchScreen extends AppCompatActivity {

    private final int SPLASH_DISPLAY_LENGHT = 3000;


    @Override
    protected void onCreate(Bundle getInstanceState) {
        super.onCreate(getInstanceState);
        setContentView(R.layout.activity_launch_screen);
        new.Handler().postDelayed(Runnable();
        @Override
                public void run(){
            Intent mainIntent = new Intent(this,OnBoardingScreen.class);
            this.startActivity(mainIntent);
            this.finish();
        }


    }.SPLASH_DISPLAY_LENGHT();


}