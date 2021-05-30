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
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.options;

public class login extends AppCompatActivity {
    private EditText memail,mpass;
    private Button signin;

    private FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        memail=(EditText)findViewById(R.id.loginemail);
        mpass=(EditText)findViewById(R.id.loginpass);
        signin=(Button)findViewById(R.id.loginbutton);
        mAuth=FirebaseAuth.getInstance();
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginUser();
            }
        });
    }

     private void loginUser() {
        String email=memail.getText().toString();
        String pass=mpass.getText().toString();
        if(!email.isEmpty()&& Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            if(!pass.isEmpty()){
                mAuth.signInWithEmailAndPassword(email,pass).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull  Exception e) {
                        Toast.makeText(login.this,"Login Error",Toast.LENGTH_SHORT).show();
                    }
                }).addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                    @Override
                    public void onSuccess(AuthResult authResult) {
                        Toast.makeText(login.this, "Login Successful", Toast.LENGTH_SHORT).show();
                        success();
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

    private void success() {
        Intent intent;
        intent=new Intent(login.this,options2.class);
        startActivity(intent);
    }

}