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
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;

import javax.xml.transform.Result;

public class Results extends AppCompatActivity {
     Button share,menu,detail;
     TextView score;
     Toolbar tool;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
    share=findViewById(R.id.btShare);
    menu=findViewById(R.id.btMenu);

    tool=findViewById(R.id.toolbar1);
    setSupportActionBar(tool);

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