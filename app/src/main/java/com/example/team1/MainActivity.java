package com.example.team1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void jacaranda(View v) {
        Intent i = new Intent(this, JacarandaActivity.class);
        startActivity(i);
    }
    public void education(View v) {
        Intent i = new Intent(this, EducationActivity.class);
        startActivity(i);
    }
    public void sierra(View v) {
        Intent i = new Intent(this, SierraActivity.class);
        startActivity(i);
    }
}