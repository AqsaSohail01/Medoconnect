package com.example.medoconnect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class signup extends AppCompatActivity {
    private EditText fullNameEditText, phoneNumberEditText, passwordEditText, confirmPasswordEditText;
    private CheckBox termsCheckBox;
    private Button signUpButton;
    private TextView signInTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        fullNameEditText = findViewById(R.id.fullNameEditText);
        phoneNumberEditText = findViewById(R.id.phoneNumberEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        confirmPasswordEditText = findViewById(R.id.confirmPasswordEditText);
        termsCheckBox = findViewById(R.id.termsCheckBox);
        signUpButton = findViewById(R.id.signUpButton);
        signInTextView = findViewById(R.id.signInTextView);

        signUpButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(signup.this, verify.class);
                startActivity(intent);
            }
        });

        signInTextView.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(signup.this, signin.class);
                startActivity(intent);
            }
        });
    }
}