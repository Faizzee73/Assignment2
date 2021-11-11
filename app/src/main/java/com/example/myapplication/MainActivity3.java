package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity3 extends AppCompatActivity {

    List<String> Questions= Arrays.asList("Which alphabets shows production sound from the End of Throat","Which alphabets is used for Tongue touching the center of the mouth roof","Which alphabets is used for the Tip of the tongue touching the tip of the frontal 2 teeth","Which alphabets shows the Inner part of the both lips touch each other",  "Which alphabets shows One side of the tongue touching the molar teeth");
    List<String> Answers=Arrays.asList("ة","ج","ث","م","ض");
    List<String> Q1=Arrays.asList("ة","ق","ك","خ");
    List<String> Q2=Arrays.asList("ج","ق","ك","خ");
    List<String> Q3=Arrays.asList("ث","ق","ك","خ");
    List<String> Q4=Arrays.asList("م","ق","ك","خ");
    List<String> Q5=Arrays.asList("ض","ق","ك","خ");
    List<String> Input=Arrays.asList("_","_","_","_","_");


    int index=0;
    int count =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        RadioGroup R1=findViewById(R.id.radiogroup1);
        TextView text=findViewById(R.id.textView2);

        text.setText(Questions.get(index));
        for(int j=0;j<4;j++){
            ((RadioButton) R1.getChildAt(j)).setText(Q1.get(j));
        }
    }

    public void nextQues(View view){
        Button btn = findViewById(R.id.button9);

        if(btn.getText().equals("Next")){
            index++;
            RadioGroup R1=findViewById(R.id.radiogroup1);
            TextView text=findViewById(R.id.textView2);

            text.setText(Questions.get(index));
            if(index == 1){
                for(int j=0;j<4;j++){
                    ((RadioButton) R1.getChildAt(j)).setText(Q2.get(j));
                }
            }else if (index == 2){
                for(int j=0;j<4;j++){
                    ((RadioButton) R1.getChildAt(j)).setText(Q3.get(j));
                }
            }else if(index == 3){
                for(int j=0;j<4;j++){
                    ((RadioButton) R1.getChildAt(j)).setText(Q4.get(j));
                }
            }else if(index == 4){
                for(int j=0;j<4;j++){
                    ((RadioButton) R1.getChildAt(j)).setText(Q5.get(j));
                }
            }
            R1.clearCheck();

            if(index >= 4){
                btn.setText("Finish");
            }
        }else{

            for(int i=0;i<5;i++){
                if(Input.get(i).equals(Answers.get(i))){
                    count++;
                }
            }
            Intent i = new Intent(this, MainActivity4.class);
            i.putExtra("key", Integer.toString(count));
            startActivity(i);
        }

    }
    public void onRadioButton(View view){
        RadioGroup R1=findViewById(R.id.radiogroup1);
        int selectedId = R1.getCheckedRadioButtonId();
        RadioButton rb = findViewById(selectedId);
        Input.add(index, rb.getText().toString());
    }
}