package com.example.team1;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class newreview extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newreview);
    }
    public void takecomment(View v){
        TextView t = findViewById(R.id.enterText);
        String input = t.getText().toString();
        ((TextView)findViewById(R.id.output)).setText(input);
    }
    public void disableGreen(View v){

            View ImageB = findViewById(R.id.imageButton);
            ImageB.setEnabled(false);
            ImageB.setClickable(false);
            ImageB.setBackgroundColor(Color.parseColor("#008000"));

    }
    public void disableRed(View v){

            View ImageB = findViewById(R.id.imageButton2);
            ImageB.setEnabled(false);
            ImageB.setClickable(false);
            ImageB.setBackgroundColor(Color.parseColor("#8B0000"));

    }

    public void uploaderClick(View v) {
        Intent i = new Intent(this, uploader.class);
        startActivity(i);
    }
}