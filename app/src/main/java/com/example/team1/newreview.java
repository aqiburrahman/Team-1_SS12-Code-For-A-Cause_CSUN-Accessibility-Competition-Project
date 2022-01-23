package com.example.team1;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class newreview extends AppCompatActivity {
    File file;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newreview);
        File d=getExternalFilesDir(Environment.DIRECTORY_DOCUMENTS);
        file = new File(d,"data.txt");

    }
    public void takecomment(View v) throws IOException {
        TextView t = findViewById(R.id.enterText);
        String input = t.getText().toString();
        ((TextView)findViewById(R.id.output)).setText(input);

        FileWriter writer=new FileWriter(file);
        EditText editText=(EditText)findViewById(R.id.enterText);
        writer.append(editText.getText().toString());
        writer.close();

        readData(findViewById(R.id.output));
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


    public void readData(View view) throws IOException {
        File d=getExternalFilesDir(Environment.DIRECTORY_DOCUMENTS);
        File file=new File(d,"data.txt");
        FileReader reader=new FileReader(file);
        int ch;
        StringBuilder builder = new StringBuilder();
        while((ch=reader.read())!=-1)
        {
            builder.append ((char)ch);

        }
        Toast.makeText(this,"Data:" +builder.toString(),Toast.LENGTH_SHORT).show();
    }
}