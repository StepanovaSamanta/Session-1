package com.example.wsrfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class OnBoardingScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_boarding_screen);
    }
    public void btn1(View view){
        Intent i = new Intent(this,SignIn.class);
        startActivity(i);
        finish();
    }
    public void btn2(View view){
        Intent i = new Intent(this,SignUp.class);
        startActivity(i);
        finish();
    }
}