package com.example.medoconnect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class login extends AppCompatActivity {
    private ImageView medoimageview;
    private Button googlebtn,gmailbtn,cellphonebtn,facebookbtn,emailbtn;
    private TextView welcomeEditText,signintext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        medoimageview = findViewById(R.id.medoimageview);
        googlebtn = findViewById(R.id.googlebtn);
        gmailbtn = findViewById(R.id.gmailbtn);
        cellphonebtn = findViewById(R.id.cellphonebtn);
        facebookbtn = findViewById(R.id.facebookbtn);
        emailbtn = findViewById(R.id.emailbtn);
        welcomeEditText = findViewById(R.id.welcomeEditText);
        signintext = findViewById(R.id.signintext);
        cellphonebtn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(login.this, signup.class);
                startActivity(intent);
            }
        });
        signintext.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(login.this, signin.class);
                startActivity(intent);
            }
        });
    }
}