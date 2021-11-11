package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        String score= getIntent().getExtras().getString("key");
        String text = "Your score is " + score +"/5!";
        TextView txt = findViewById(R.id.textView3);
        txt.setText(text);
    }
}