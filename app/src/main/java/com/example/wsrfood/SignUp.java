package com.example.wsrfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.snackbar.Snackbar;

public class SignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
    }
    public void btn1 (View view){
        Intent i = new Intent(this,OnBoardingScreen.class);
        startActivity(i);
        finish();
    }

    public void onClick(View view) {
        Intent i = new Intent(this,MainActivity.class);
        Snackbar.make(view, "Complete", Snackbar.LENGTH_LONG)
                .setAction("Error", null).show();

}
}