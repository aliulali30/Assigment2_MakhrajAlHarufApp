package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.widget.Toolbar;

public class userPractice extends AppCompatActivity {
    Button halqiyah,lahatiya,shajriyah,ghunna,lisaveyah,niteeyah,tarfiyah;
    ImageView image;
    Toolbar tool;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_practice);
        image=findViewById(R.id.imageView5);

        halqiyah=findViewById(R.id.halqiyah);
        lahatiya=findViewById(R.id.lahatiyah);
        shajriyah=findViewById(R.id.shajriyah);
        ghunna=findViewById(R.id.ghunna);
        lisaveyah=findViewById(R.id.lisaveryah);
        niteeyah=findViewById(R.id.niteeyah);
        tarfiyah=findViewById(R.id.tarfiyah);

        tool=findViewById(R.id.toolbar1);
        setSupportActionBar(tool);

        halqiyah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image.setImageResource(R.drawable.halqiyah);
            }
        });

        lahatiya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image.setImageResource(R.drawable.lahatiya);
            }
        });

        shajriyah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image.setImageResource(R.drawable.shajriyah);
            }
        });

        ghunna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image.setImageResource(R.drawable.ghunna);
            }
        });

        niteeyah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image.setImageResource(R.drawable.niteeyah);
            }
        });

        tarfiyah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image.setImageResource(R.drawable.tarfiyan);
            }
        });

        lisaveyah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image.setImageResource(R.drawable.lisaveyah);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
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