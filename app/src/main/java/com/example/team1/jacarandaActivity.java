package com.example.team1;

import androidx.appcompat.app.AppCompatActivity;

//import android.content.Intent;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class jacarandaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jacaranda);
    }
    public void login(View v){
        Intent i=new Intent(this, loginActivity.class);
        startActivity(i);
    }
}