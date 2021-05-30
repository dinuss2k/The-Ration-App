package com.example.rs2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import com.options;


public class timepicker extends AppCompatActivity {
    private Button one,two,three,four,five,six,seven,eight,home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timepicker);
        one=findViewById(R.id.one);
        two=findViewById(R.id.two);
        three=findViewById(R.id.three);
        four=findViewById(R.id.four);
        five=findViewById(R.id.five);
        six=findViewById(R.id.six);
        seven=findViewById(R.id.seven);
        eight=findViewById(R.id.eight);
        home=(Button) findViewById(R.id.home_button);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(timepicker.this,"Slot has been booked",Toast.LENGTH_LONG).show();
                Intent datepassingintent=getIntent();
                   String datepass=datepassingintent.getStringExtra("date");
                   Intent intent= new Intent(timepicker.this, displaydate.class);
                intent.putExtra("datepassing",datepass);
                startActivity(intent);
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(timepicker.this,"Slot has been booked",Toast.LENGTH_LONG).show();
                Intent datepassingintent=getIntent();
                String datepass=datepassingintent.getStringExtra("date");
                Intent intent= new Intent(timepicker.this, displaydate.class);
                intent.putExtra("datepassing",datepass);
                startActivity(intent);
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(timepicker.this,"Slot has been booked",Toast.LENGTH_LONG).show();
                Intent datepassingintent=getIntent();
                String datepass=datepassingintent.getStringExtra("date");
                Intent intent= new Intent(timepicker.this, displaydate.class);
                intent.putExtra("datepassing",datepass);
                startActivity(intent);
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(timepicker.this,"Slot has been booked",Toast.LENGTH_LONG).show();
                Intent datepassingintent=getIntent();
                String datepass=datepassingintent.getStringExtra("date");
                Intent intent= new Intent(timepicker.this, displaydate.class);
                intent.putExtra("datepassing",datepass);
                startActivity(intent);
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(timepicker.this,"Slot has been booked",Toast.LENGTH_LONG).show();
                Intent datepassingintent=getIntent();
                String datepass=datepassingintent.getStringExtra("date");
                Intent intent= new Intent(timepicker.this, displaydate.class);
                intent.putExtra("datepassing",datepass);
                startActivity(intent);
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(timepicker.this,"Slot has been booked",Toast.LENGTH_LONG).show();
                Intent datepassingintent=getIntent();
                String datepass=datepassingintent.getStringExtra("date");
                Intent intent= new Intent(timepicker.this, displaydate.class);
                intent.putExtra("datepassing",datepass);
                startActivity(intent);
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(timepicker.this,"Slot has been booked",Toast.LENGTH_LONG).show();
                Intent datepassingintent=getIntent();
                String datepass=datepassingintent.getStringExtra("date");
                Intent intent= new Intent(timepicker.this, displaydate.class);
                intent.putExtra("datepassing",datepass);
                startActivity(intent);
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(timepicker.this,"Slot has been booked",Toast.LENGTH_LONG).show();
                Intent datepassingintent=getIntent();
                String datepass=datepassingintent.getStringExtra("date");
                Intent intent= new Intent(timepicker.this, displaydate.class);
                intent.putExtra("datepassing",datepass);
                startActivity(intent);
            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(timepicker.this,options2.class);
                startActivity(intent);
            }
        });


    }
}