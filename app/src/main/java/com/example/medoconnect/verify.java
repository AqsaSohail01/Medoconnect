package com.example.medoconnect;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class verify extends AppCompatActivity {
    private Button backArrowImageView;
    private TextView verificationHeadingTextView;
    private TextView alertTextView;
    private TextView otpTextView;
    private TextView phoneTextView;
    private EditText otp4EditText;
    private EditText otp1EditText;
    private EditText otp3EditText;
    private EditText otp2EditText;
    private Button verifyButton;
    private TextView remainingTimeTextView;
    private Button sendCodeAgainButton;
    private Button getCodeViaCallButton;
    private TextView codeTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify);
        backArrowImageView = findViewById(R.id.backArrowImageView);
        verificationHeadingTextView = findViewById(R.id.verificationHeadingTextView);
        alertTextView = findViewById(R.id.alertTextView);
        codeTextView = findViewById(R.id.codeTextView);
        otpTextView = findViewById(R.id.otpTextView);
        phoneTextView = findViewById(R.id.phoneTextView);
        otp4EditText = findViewById(R.id.otp4EditText);
        otp1EditText = findViewById(R.id.otp1EditText);
        otp3EditText = findViewById(R.id.otp3EditText);
        otp2EditText = findViewById(R.id.otp2EditText);
        verifyButton = findViewById(R.id.verifyButton);
        remainingTimeTextView = findViewById(R.id.remainingTimeTextView);
        sendCodeAgainButton = findViewById(R.id.sendCodeAgainButton);
        getCodeViaCallButton = findViewById(R.id.getCodeViaCallButton);

        backArrowImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the signup activity here
                Intent intent = new Intent(verify.this, signup.class);
                startActivity(intent);
            }
        });
    }

}