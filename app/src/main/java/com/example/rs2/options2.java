package com.example.rs2;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.rs2.R;
import com.example.rs2.datepicker;
import com.example.rs2.weekoptions;


public class options2 extends AppCompatActivity {
    private Button Button1;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);
        Button1=(Button) findViewById(R.id.slotbutton);
        button2=(Button) findViewById(R.id.grocerybutton);

        Button1.setOnClickListener(new View.OnClickListener() {
            private Object CustomIntent;

            @Override
            public void onClick(View v) {
                Intent intent;
                intent= new Intent(options2.this, datepicker.class);
                startActivity(intent);


            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent=new Intent(options2.this, weekoptions.class);
                startActivity(intent);
            }
        });



    }

}