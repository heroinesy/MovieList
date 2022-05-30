package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button actionimage;
    Button calling;
    EditText editText;
    String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.edText);
        actionimage = findViewById(R.id.action_image);
        calling = findViewById(R.id.call);

        calling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent threeIntent = new Intent(MainActivity.this, three_Activity.class);
                startActivity(threeIntent);
            }
        });

        actionimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent act_image = new Intent(MainActivity.this, actionimage.class);
                str = editText.getText().toString();
                act_image.putExtra("11",str);
                startActivity(act_image);
            }
        });
    }
}