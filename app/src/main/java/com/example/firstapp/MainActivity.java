package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button bt;
    TextView tx;
    //private Object CompetetionActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       bt = findViewById(R.id.btn1);
       bt.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v){
            OpenCompetitionActivity();
           }
       });
    }
    public  void OpenCompetitionActivity(){
        Intent intent = new Intent(this,CompetetionActivity.class);
        startActivity(intent) ;
    }


}