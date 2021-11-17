package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import javax.xml.transform.Result;

public class Results extends AppCompatActivity {
     Button share,menu,detail;
     TextView score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
    share=findViewById(R.id.btShare);
    menu=findViewById(R.id.btMenu);

    score=findViewById(R.id.scoreText);

    //Get intent and bundle;
    Intent intent=getIntent();
    Bundle bundle=intent.getExtras();
    int scoreValue=bundle.getInt("score");
    score.setText(Integer.toString(scoreValue));

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

    detail=findViewById(R.id.detail);
    detail.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            openResultDetail(bundle);
        }
    });
    }

    void openMainActivity(){
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    void openResultDetail(Bundle bundle){
        Intent intent=new Intent(Results.this,ResultDetail.class);
        intent.putExtras(bundle);
        startActivity(intent);

    }
}