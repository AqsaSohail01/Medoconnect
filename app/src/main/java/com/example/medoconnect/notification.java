package com.example.medoconnect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class notification extends AppCompatActivity {
    private BottomNavigationView bottomNavigationView;
    private Button backArrownotif;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        backArrownotif= findViewById(R.id.backArrownotif);
        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setItemIconTintList(null);

        backArrownotif.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(notification.this, dashboard.class);
                startActivity(intent);
            }
        });

        bottomNavigationView.setOnItemSelectedListener(item -> {
            int itemId = item.getItemId();

            if (itemId == R.id.navigation_home) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                finish();
                return true;
            } else if (itemId == R.id.navigation_appointment) {
                startActivity(new Intent(getApplicationContext(), navigation.class));
                finish();
                return true;
            } else if (itemId == R.id.navigation_call) {
                startActivity(new Intent(getApplicationContext(), verify.class));
                finish();
                return true;
            } else if (itemId == R.id.navigation_med) {
                startActivity(new Intent(getApplicationContext(), signin.class));
                finish();
                return true;
            } else if (itemId == R.id.navigation_profile) {
                startActivity(new Intent(getApplicationContext(), signup.class));
                finish();
                return true;
            }

            return false;

        });

    }
}