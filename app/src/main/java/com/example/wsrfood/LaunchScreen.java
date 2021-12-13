package com.example.wsrfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class LaunchScreen extends AppCompatActivity {

    private final int SPLASH_DISPLAY_LENGHT = 3000;


    public LaunchScreen() {
    }

    @Override
    protected void onCreate(Bundle getInstanceState) {
        super.onCreate(getInstanceState);
        setContentView(R.layout.activity_launch_screen);
        Intent i = new Intent(this,OnBoardingScreen.class);
        startActivity(i);
        finish();

    }

}