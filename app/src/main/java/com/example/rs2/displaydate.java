package com.example.rs2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class displaydate extends AppCompatActivity {
      TextView date_picked;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_displaydate);
        date_picked=(TextView)findViewById(R.id.date);
        Intent dateintent=getIntent();
        String datepicked2=dateintent.getStringExtra("datepassing");
        date_picked.setText(datepicked2);
    }
}