package com.example.rs2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


import com.options;

public class weekoptions extends AppCompatActivity {
    private Button w1,w2,w3,w4,home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weekoptions);

        w1=(Button)findViewById(R.id.week1);
        w2=(Button)findViewById(R.id.week2);
        w3=(Button)findViewById(R.id.week3);
        w4=(Button)findViewById(R.id.week4);

        home=(Button) findViewById(R.id.home_button);
        w1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent=new Intent(weekoptions.this,week1.class);
                startActivity(intent);
            }
        });
        w2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent=new Intent(weekoptions.this,week2.class);
                startActivity(intent);
            }
        });
        w3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent=new Intent(weekoptions.this,week3.class);
                startActivity(intent);
            }
        });
        w4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent=new Intent(weekoptions.this,week4.class);
                startActivity(intent);
            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(weekoptions.this,options2.class);
                startActivity(intent);
            }
        });


    }
}