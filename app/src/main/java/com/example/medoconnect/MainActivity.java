package com.example.medoconnect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {
    private static final long SPLASH_DELAY = 2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Start the next activity here (e.g., MainActivity)
                Intent intent = new Intent(MainActivity.this,login.class);
                startActivity(intent);
                finish();
            }
        }, SPLASH_DELAY);
    }
}