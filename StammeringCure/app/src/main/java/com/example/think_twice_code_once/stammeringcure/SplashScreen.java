package com.example.think_twice_code_once.stammeringcure;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent next = new Intent(SplashScreen.this , UserRegistration.class);
                startActivity(next);
                finish();
            }
        } , 2000);
    }
}
