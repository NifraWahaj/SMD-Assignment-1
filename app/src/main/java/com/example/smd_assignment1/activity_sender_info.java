package com.example.smd_assignment1;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class activity_sender_info extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sender_info);

        Button btnNext;
        btnNext = findViewById(R.id.btnNextSender);
        btnNext.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Intent iReciever = new Intent(activity_sender_info.this, activity_reciever_info.class);
                iReciever.putExtra("senderEmail", ((EditText) findViewById(R.id.email)).getText().toString());
                iReciever.putExtra("senderName", ((EditText) findViewById(R.id.name)).getText().toString());
                iReciever.putExtra("senderContact", ((EditText) findViewById(R.id.contact_info)).getText().toString());
                iReciever.putExtra("senderCountry", ((EditText) findViewById(R.id.country)).getText().toString());
                iReciever.putExtra("senderAddress", ((EditText) findViewById(R.id.address)).getText().toString());

                startActivity(iReciever);

            }
        });
    }
}