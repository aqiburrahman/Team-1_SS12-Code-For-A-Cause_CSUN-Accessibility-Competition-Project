package com.example.team1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Objects;

public class loginActivity extends AppCompatActivity {
    EditText username,password;
    Button login;
    View success;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username=findViewById(R.id.username);
        password=findViewById(R.id.password);
        login=findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Objects.equals(username.getText().toString(), "admin")&&Objects.equals(password.getText().toString(),"admin"))
                {
                    Toast.makeText(loginActivity.this,"You have Authenticated Successfully",Toast.LENGTH_LONG).show();
                    newreview(success);
                }else
                {
                    Toast.makeText(loginActivity.this,"Authentication Failed",Toast.LENGTH_LONG).show();
                }
            }
        });

    }
    public void newreview(View v){
        Intent i=new Intent(this, newreview.class);
        startActivity(i);
    }
}