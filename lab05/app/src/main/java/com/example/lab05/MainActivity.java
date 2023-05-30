package com.example.lab05;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnBai1 = (Button) findViewById(R.id.btnBai1);
        Button btnBai2 = (Button) findViewById(R.id.btnBai2);
        Button btnBai3 = (Button) findViewById(R.id.btnBai3);

       btnBai1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity(Bai1.class);
            }
        });
        btnBai2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity(Bai1.class);
            }
        });
       btnBai3.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               openActivity(NewActivity.class);
           }
       });
    }
    public void openActivity(Class className) {
        Intent intent = new Intent(this, className);
        startActivity(intent);
    }
}