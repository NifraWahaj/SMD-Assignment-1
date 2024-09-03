package com.example.smd_assignment1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class activity_review_info extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review_info);

        // sender info
        String senderEmail = getIntent().getStringExtra("senderEmail");
        String senderName = getIntent().getStringExtra("senderName");
        String senderContact = getIntent().getStringExtra("senderContact");
        String senderCountry = getIntent().getStringExtra("senderCountry");
        String senderAddress = getIntent().getStringExtra("senderAddress");

        // reciever info
        String recieverEmail = getIntent().getStringExtra("recieverEmail");
        String recieverName = getIntent().getStringExtra("recieverName");
        String recieverContact = getIntent().getStringExtra("recieverContact");
        String recieverCountry = getIntent().getStringExtra("recieverCountry");
        String recieverAddress = getIntent().getStringExtra("recieverAddress");

        // display sender info
        ((TextView) findViewById(R.id.senderName)).setText(senderName);
        ((TextView) findViewById(R.id.senderCountry)).setText(senderEmail);
        ((TextView) findViewById(R.id.senderContact)).setText(senderContact);
        ((TextView) findViewById(R.id.senderAddress)).setText(senderAddress);

        // display reciever info
        ((TextView) findViewById(R.id.receiverName)).setText(recieverName);
        ((TextView) findViewById(R.id.receiverCountry)).setText(recieverEmail);
        ((TextView) findViewById(R.id.receiverContact)).setText(recieverContact);
        ((TextView) findViewById(R.id.receiverAddress)).setText(recieverAddress);

        // FAB
        FloatingActionButton btnFab = findViewById(R.id.fabReview);
        btnFab.setOnClickListener(v -> {
            Intent iReciever = new Intent(activity_review_info.this, activity_sender_info.class);
            startActivity(iReciever);
        });
    }

}