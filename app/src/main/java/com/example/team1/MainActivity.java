package com.example.team1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void disable(View V){
        View myView = findViewById(R.id.imageButton6);
        myView.setEnabled(false);
        myView.setVisibility(View.GONE);

        //Button button = (Button) myView;
        //button.setText("1");

        View myView2 = findViewById(R.id.imageButton7);
        myView2.setEnabled(false);

        //Button button2 = (Button) myView2;
        //button2.setText("2");

        /*
        V.setEnabled(false);
        Button button =(Button) V;
        button.setText("Disabled");
        */
    }
}