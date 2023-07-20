package com.example.medoconnect;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


import com.google.android.material.bottomnavigation.BottomNavigationView;

public class dashboard extends AppCompatActivity  {

    private Button navButton;
    private ImageView navbell,navwallet;
    private BottomNavigationView bottomNavigationView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        navButton = findViewById(R.id.navButton);
        navbell = findViewById(R.id.navbell);
        navwallet = findViewById(R.id.navwallet);
        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setItemIconTintList(null);
        navButton.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {
                    Intent intent = new Intent(dashboard.this, navigation.class);
                    startActivity(intent);
                }
            });

        navbell.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(dashboard.this, notification.class);
                startActivity(intent);
            }
        });

        navwallet.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(dashboard.this, wallet1.class);
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








