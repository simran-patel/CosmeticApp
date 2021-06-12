package com.example.pink;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ForgetPassActivity extends AppCompatActivity {

    EditText email;
    Button password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_pass);

        email=(EditText)findViewById(R.id.forget_pass);
        password=(Button) findViewById(R.id.forget_btn);
        password.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
              opencreatepassword();
            }
        });
    }
    public void opencreatepassword(){
        Intent intent = new Intent(this , CreatePassword.class);
        startActivity(intent);
    }
};