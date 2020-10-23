package com.example.fashionbusinessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void SignUp(View view) {
        startActivity(new Intent(LoginActivity.this, SignUpActivity.class));
    }

    public void ViewMain(View view) {
        startActivity(new Intent(LoginActivity.this , MainActivity.class));
    }
}