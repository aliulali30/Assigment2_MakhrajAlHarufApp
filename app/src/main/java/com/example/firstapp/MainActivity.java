package com.example.firstapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;


import java.net.URI;

public class MainActivity extends AppCompatActivity {
    Button bt,practice,Git;
    TextView tx;
    Toolbar tool;
    //private Object CompetetionActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tool=findViewById(R.id.toolbar1);
        setSupportActionBar(tool);

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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.practice: {
                openPracticeActivity();
                Log.d("menu", "onOptionsItemSelected: practice");
                break;
            }
            case R.id.git: {
                Uri uri = Uri.parse("https://github.com/aliulali30/Assigment2_MakhrajAlHarufApp");
                Intent webintent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(webintent);
                Log.d("menu", "onOptionsItemSelected: git");
            break;
            }
            case R.id.exam: {
                OpenCompetitionActivity();
                Log.d("menu", "onOptionsItemSelected: exam");
            break;
            }
            default:
                return super.onOptionsItemSelected(item);
        }
        return false;
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