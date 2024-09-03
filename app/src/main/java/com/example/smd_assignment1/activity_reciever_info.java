package com.example.smd_assignment1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class activity_reciever_info extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reciever_info);


        Button btnNext;
        btnNext = findViewById(R.id.btnNextReview);
        btnNext.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                // Inside btnNext onClickListener
                Intent iReview = new Intent(activity_reciever_info.this, activity_review_info.class);
                iReview.putExtra("recieverEmail", ((EditText) findViewById(R.id.email)).getText().toString());
                iReview.putExtra("recieverName", ((EditText) findViewById(R.id.name)).getText().toString());
                iReview.putExtra("recieverContact", ((EditText) findViewById(R.id.contact_info)).getText().toString());
                iReview.putExtra("recieverCountry", ((EditText) findViewById(R.id.country)).getText().toString());
                iReview.putExtra("recieverAddress", ((EditText) findViewById(R.id.address)).getText().toString());

// Pass the sender's data as well
                iReview.putExtra("senderEmail", getIntent().getStringExtra("senderEmail"));
                iReview.putExtra("senderName", getIntent().getStringExtra("senderName"));
                iReview.putExtra("senderContact", getIntent().getStringExtra("senderContact"));
                iReview.putExtra("senderCountry", getIntent().getStringExtra("senderCountry"));
                iReview.putExtra("senderAddress", getIntent().getStringExtra("senderAddress"));

                startActivity(iReview);

            }
        });
    }
}