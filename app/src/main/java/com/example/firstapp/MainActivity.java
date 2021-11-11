package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.net.URI;

public class MainActivity extends AppCompatActivity {
    Button bt,practice,Git;
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

       practice=findViewById(R.id.pracId);
       practice.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               openPracticeActivity();
           }
       });

       Git=findViewById(R.id.button2);
       Git.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Uri uri=Uri.parse("https://github.com/aliulali30/Assigment2_MakhrajAlHarufApp");
               Intent webintent=new Intent(Intent.ACTION_VIEW,uri);
               startActivity(webintent);
           }
       });
    }
    public  void OpenCompetitionActivity(){
        Intent intent = new Intent(this,CompetetionActivity.class);
        startActivity(intent) ;
    }

    public void openPracticeActivity(){
        Intent intent2=new Intent(this,userPractice.class);
        startActivity(intent2);
    }


}