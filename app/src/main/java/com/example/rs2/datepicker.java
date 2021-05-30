package com.example.rs2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.telecom.Call;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;

import com.options;

public class datepicker extends AppCompatActivity {
    private Button next;
    public Button home;
   private CalendarView mCalendarView;
   private static final String TAG="datepicker";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datepicker);
        next=findViewById(R.id.button);
        home=(Button) findViewById(R.id.home_button);
        mCalendarView=(CalendarView)findViewById(R.id.calendarView);
        mCalendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                String date=dayOfMonth + "/" + month + "/" + year;
                Log.d(TAG,"onSelectedDayChange: dd/mm/yyyy"+date);
                Intent intent=new Intent(datepicker.this,timepicker.class);
                intent.putExtra("date",date);
                startActivity(intent);

            }
        });


        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(datepicker.this,options2.class);
                startActivity(intent);
            }
        });
    }
}