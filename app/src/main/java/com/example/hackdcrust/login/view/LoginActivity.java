package com.example.hackdcrust.login.view;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.hackdcrust.R;


public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //TODO: Change this to LoginOption fragment
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new LoginOptionFragment()).commit();
    }
}