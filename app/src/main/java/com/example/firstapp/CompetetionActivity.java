package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class CompetetionActivity extends AppCompatActivity {
     TextView CompText ;
      Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_competetion);
        char[] arbiAlphabet={'ا','ب','ت','ث','ج','ح','خ','د','ذ','ر','ز','س','ش','ص','ض','ط','ظ','ع','غ','ف','ق','ك','ل','م','ن','ه','و','ي'};
       char temp=showCharacter(arbiAlphabet);
       btn=findViewById(R.id.submitAns);
       btn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
              char temp= showCharacter(arbiAlphabet);
           }
       });

    }

    public char showCharacter(char[] arbiAlphabet){
        Random random= new Random();
        int rand=random.nextInt(29);
        CompText=findViewById(R.id.textViewComp);
        char ch = arbiAlphabet[rand];
        String text="";
        text+=ch;
        CompText.setText(text);
        return ch;
    }
}

