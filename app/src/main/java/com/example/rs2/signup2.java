package com.example.rs2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseAppLifecycleListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import java.util.regex.Pattern;

public class signup2 extends AppCompatActivity {
   private EditText memail,mpass;
   Button signup;
   TextView textview;
   private FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup2);
    memail=(EditText)findViewById(R.id.signupemail);
    mpass=(EditText)findViewById(R.id.signuppass);
    textview=(TextView)findViewById(R.id.text3);
    signup=(Button)findViewById(R.id.signupbutton);
    mAuth=FirebaseAuth.getInstance();
    signup.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            createUser();
        }
    });

    }

    private void createUser() {
        String email=memail.getText().toString();
        String pass=mpass.getText().toString();
        if(!email.isEmpty()&& Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            if(!pass.isEmpty()){
                  mAuth.createUserWithEmailAndPassword(email,pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                      @Override
                      public void onComplete(@NonNull  Task<AuthResult> task) {
                          Toast.makeText(signup2.this, "Registered Successfully", Toast.LENGTH_SHORT).show();
                          startActivity(new Intent(signup2.this,login.class));
                          finish();
                      }
                  }).addOnFailureListener(new OnFailureListener() {
                      @Override
                      public void onFailure(@NonNull  Exception e) {
                          Toast.makeText(signup2.this,"Registration error",Toast.LENGTH_SHORT).show();
                      }
                  });
            }else{
               mpass.setError("Empty fields are not allowed");
            }
        }else if(email.isEmpty())
        {
            memail.setError("Empty fields are not allowed");
        }
        else{
            memail.setError("Please enter correct email");
        }

    }
}