package com.example.smd_assignment1;



import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class activity_splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Intent iHome = new Intent(activity_splash.this, activity_sender_info.class);

        new Handler().postDelayed(() -> {
            startActivity(iHome);
            finish();
        }, 4000);


    }
}
