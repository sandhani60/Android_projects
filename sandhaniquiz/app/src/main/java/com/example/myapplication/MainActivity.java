package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView totalquestionsTextView;
    TextView questionTextView;
    Button ansA,ansB,ansC,ansD;
    Button submitBtn;

    int score=0;
    int totalQuestion=question.question1.length;
    int currentQuestionIndex=0;
    String selectedAnswer="";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        totalquestionsTextView =findViewById(R.id.total_question);
        questionTextView=findViewById(R.id.question);
        ansA=findViewById(R.id.ans_A);
        ansB=findViewById(R.id.ans_B);
        ansC=findViewById(R.id.ans_C);
        ansD=findViewById(R.id.ans_D);
        submitBtn=findViewById(R.id.submit_btn);

        ansA.setOnClickListener(this);
        ansB.setOnClickListener(this);
        ansC.setOnClickListener(this);
        ansD.setOnClickListener(this);
        submitBtn.setOnClickListener(this);

        totalquestionsTextView.setText("total questions:"+totalQuestion);
        loadnewQuestion();



    }


    @SuppressLint("ResourceAsColor")
    @Override
    public void onClick(View view) {
        ansA.setBackgroundColor(Color.WHITE);
        ansB.setBackgroundColor(Color.WHITE);
        ansC.setBackgroundColor(Color.WHITE);
        ansD.setBackgroundColor(Color.WHITE);

        Button clickedButton=(Button) view;
        if(clickedButton.getId()==R.id.submit_btn){
            if(selectedAnswer.equals(question.correctanswer[currentQuestionIndex])) {
                score++;
            }
            currentQuestionIndex++;
            loadnewQuestion();


        }else{

            selectedAnswer=clickedButton.getText().toString();
            clickedButton.setBackgroundColor(Color.MAGENTA);
        }

    }
    void loadnewQuestion(){

        if(currentQuestionIndex== totalQuestion){
            finishQuiz();
            return;
        }
        questionTextView.setText(question.question1[currentQuestionIndex]);
        ansA.setText(question.choices[currentQuestionIndex][0]);
        ansB.setText(question.choices[currentQuestionIndex][1]);
        ansC.setText(question.choices[currentQuestionIndex][2]);
        ansD.setText(question.choices[currentQuestionIndex][3]);
    }
    void finishQuiz(){
        String passStatus="";
        if(score>totalQuestion*0.60){
            passStatus="passes you have common sense";
        }else{
            passStatus="failed";
        }
        new AlertDialog.Builder(this)
                .setTitle(passStatus)
                .setMessage("score is"+score+"out of"+totalQuestion)
                .setPositiveButton("Restart",(dialogInterface,i)->restartQuiz())
                .setCancelable(false)
                .show();
    }
    void restartQuiz(){
        score=0;
        currentQuestionIndex=0;
        loadnewQuestion();
    }
}