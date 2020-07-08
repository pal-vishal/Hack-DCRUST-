package com.example.hackdcrust.login.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.hackdcrust.R;
import com.example.hackdcrust.main.view.MainActivity;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        ImageView logo = findViewById(R.id.ivLogo);
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.logo_fade_in);
        logo.startAnimation(animation);
        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        final Intent intent;
        if (user == null) {
            intent = new Intent(this, LoginActivity.class);
        }else
           intent = new Intent(this, MainActivity.class);
        Thread timer = new Thread() {
            public void run() {
                try {
                    sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    startActivity(intent);
                    finish();
                }
            }
        };
        timer.start();
    }
}