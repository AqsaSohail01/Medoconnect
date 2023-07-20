package com.example.medoconnect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class signin extends AppCompatActivity {
    private EditText  phoneNumberEditText, passwordEditText;
    private Button signInButton,backArrow;
    private TextView signUpTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        phoneNumberEditText = findViewById(R.id.phoneNumberEditText);
        passwordEditText = findViewById(R.id.passwordEditText);

        signInButton = findViewById(R.id.signInButton);
        signUpTextView = findViewById(R.id.signUpTextView);
        backArrow= findViewById(R.id.backArrow);
        signInButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // Perform sign up logic here
            }
        });
        signInButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(signin.this, dashboard.class);
                startActivity(intent);
            }
        });
        signUpTextView.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(signin.this, signup.class);
                startActivity(intent);
            }
        });
        backArrow.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(signin.this, login.class);
                startActivity(intent);
            }
        });
    }
}