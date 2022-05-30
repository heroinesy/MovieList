package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class actionimage extends AppCompatActivity {
    TextView tView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actionimage);
        tView = findViewById(R.id.tView);
        Intent subIntent = getIntent();
        String str = subIntent.getStringExtra("11");
        tView.setText(str);
    }
}