package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.Random;

public class CompetetionActivity extends AppCompatActivity {
     TextView CompText,Roundtext,resultText ;
      Button submit;
      int Number_of_rounds=0,score=0;
      RadioGroup rg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_competetion);
        char[] arbiAlphabet={'ا','ب','ت','ث','ج','ح','خ','د','ذ','ر','ز','س','ش','ص','ض','ط','ظ','ع','غ','ف','ق','ك','ل','م','ن','ه','و','ي'};

       Roundtext=findViewById(R.id.textViewRound);
       resultText=findViewById(R.id.textViewResult);
        rg=findViewById(R.id.radioGroup);
        for(int i=0;i< rg.getChildCount();i++)
            rg.getChildAt(i).setEnabled(false);

        submit=findViewById(R.id.btShare);
       submit.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if(Number_of_rounds>0 && Number_of_rounds<=10) {

                   String roundTitle="Round "+Number_of_rounds+"/10";
                   Roundtext.setText(roundTitle);
                   char correctAns;
                   String s= CompText.getText().toString();
                   correctAns=s.charAt(0);
                   int CorrectoptionNumber = corrctOptionNumber(correctAns);
                   int markoptionNumber = MakrOptionNumber();

                   if (markoptionNumber == CorrectoptionNumber) {
                       score += 1;
                       resultText.setText("correct");

                   }
                   else resultText.setText("false");

                   Number_of_rounds++;
                   rg.clearCheck();
                   showCharacter(arbiAlphabet);
               }
               else if(Number_of_rounds<=0)
               {
                   for(int i=0;i< rg.getChildCount();i++)
                       rg.getChildAt(i).setEnabled(true);

                   submit.setText("Submit Answer");
                   Number_of_rounds++;
                   String roundTitle="Round "+Number_of_rounds+"/10";
                   Roundtext.setText(roundTitle);
                   showCharacter(arbiAlphabet);
               }

               if(Number_of_rounds==10){

                   submit.setText("final submit");
               }

               if(Number_of_rounds==11){
                   for(int i=0;i< rg.getChildCount();i++)
                       rg.getChildAt(i).setEnabled(false);
                   CompText.setText("-----");
                   submit.setText("See Results");
                   Number_of_rounds++;
               }
               if(Number_of_rounds==12){
                   openResultActivity(score);
               }

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

    public int corrctOptionNumber(char ch){
       char[] Halqiyah={'ا','ه','ع','غ','خ','ح'};
        char[] Lahatiyah={'ق','ک'};
        char[] ShajariyahـHaafiyah={'ج','ش','ی','ض'};
        char[] Tarfiyah={'ل','ن','ر'};
        char[] Nitـeeyah={'ت','د','ط'};
        char[] Lisaveyah={'ذ','ث','ظ','ز','س','ص'};
        char[] Ghunna={'م','ف','ب','و'};

        for(int i=0;i<2;i++)
            if(ch==Lahatiyah[i])
                return 1 ;

        for(int i=0;i<6;i++)
            if(ch==Halqiyah[i])
                return 2 ;

        for(int i=0;i<4;i++)
            if(ch==ShajariyahـHaafiyah[i])
                return 3 ;

        for(int i=0;i<3;i++)
            if(ch==Tarfiyah[i])
                return 4 ;

        for(int i=0;i<3;i++)
            if(ch==Nitـeeyah[i])
                return 5 ;

        for(int i=0;i<6;i++)
            if(ch==Lisaveyah[i])
                return 6 ;

        for(int i=0;i<4;i++)
            if(ch==Ghunna[i])
                return 7 ;

        return 0;
    }


    int MakrOptionNumber(){
        RadioButton Halqiyah,Lahatiyah,Shajariyah_Haafiyah,Tarfiyah,Nit_eeyah,Lisaveyah,Ghunna;
    Halqiyah=findViewById(R.id.radioButton);
    Lahatiyah=findViewById(R.id.radioButton2);
    Shajariyah_Haafiyah=findViewById(R.id.radioButton3);
    Tarfiyah=findViewById(R.id.radioButton4);
    Nit_eeyah=findViewById(R.id.radioButton5);
    Lisaveyah=findViewById(R.id.radioButton6);
    Ghunna=findViewById(R.id.radioButton7);

    if(Lahatiyah.isChecked())
        return 1;
    if(Halqiyah.isChecked())
        return 2;
    if(Shajariyah_Haafiyah.isChecked())
        return 3;
    if(Tarfiyah.isChecked())
        return 4;
    if(Nit_eeyah.isChecked())
        return 5;
    if(Lisaveyah.isChecked())
        return 6;
    if(Ghunna.isChecked())
        return 7;

    return 0;
    }

    void openResultActivity(int score){
        //always opne activity in separate funcation
        Intent intent=new Intent(this,Results.class);
        startActivity(intent);
    }
}

