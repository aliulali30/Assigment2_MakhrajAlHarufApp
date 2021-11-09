package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Results extends AppCompatActivity {
     Button share,menu;
     TextView sore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
    share=findViewById(R.id.btShare);
    menu=findViewById(R.id.btMenu);

    menu.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            openMainActivity();
        }
    });

    share.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    });

    }

    void openMainActivity(){
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}