package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Results extends AppCompatActivity {
     Button share,menu;
     TextView score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
    share=findViewById(R.id.btShare);
    menu=findViewById(R.id.btMenu);

    score=findViewById(R.id.scoreText);
    Intent intent=getIntent();
    score.setText(intent.getStringExtra("score"));

    menu.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            openMainActivity();
        }
    });

    share.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent whatsapp= new Intent(Intent.ACTION_SEND);
            whatsapp.setType("text/plain");
            whatsapp.setPackage("com.whatsapp");
            whatsapp.putExtra(Intent.EXTRA_TEXT,"Hii my Name is AliulAli\nMy mukhraj Score is : "+score.getText().toString());
            startActivity(whatsapp);
        }
    });

    }

    void openMainActivity(){
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}