package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class userPractice extends AppCompatActivity {
    Button halqiyah,lahatiya,shajriyah,ghunna,lisaveyah,niteeyah,tarfiyah;
    ImageView image;
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
}