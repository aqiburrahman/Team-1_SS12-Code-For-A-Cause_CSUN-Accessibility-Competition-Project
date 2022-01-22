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
    public void jacaranda(View v){
        Intent i=new Intent(this, jacarandaActivity.class);
        startActivity(i);
    }
    public void laural(View v){
        Intent i=new Intent(this, lauralActivity.class);
        startActivity(i);
    }
    public void arbor(View v){
        Intent i=new Intent(this, arborActivity.class);
        startActivity(i);
    }
}