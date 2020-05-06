package com.example.scorecounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int score_A = 0;
    int score_B=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void reset(View view) {
        score_A=0;
        score_B=0;
        display_A(score_A);
        display_B(score_B);
    }
    //Team A
    public void apoint_3(View view) {
        score_A=score_A+3;
        display_A(score_A);
    }

    public void apoint_2(View view) {
        score_A=score_A+2;
        display_A(score_A);
    }

    public void throw_scoreA(View view) {
        score_A=score_A+1;
        display_A(score_A);
    }
    public void foulA(View view) {
        score_A=score_A-1;
        display_A(score_A);
    }
    //Team B
    public void throw_scoreB(View view) {
        score_B=score_B+1;
        display_B(score_B);
    }


    public void bpoint_2(View view) {
        score_B=score_B+2;
        display_B(score_B);
    }

    public void bpoint_3(View view) {
        score_B=score_B+3;
        display_B(score_B);
    }
    public void foulB(View view) {
        score_B=score_B-1;
        display_B(score_B);
    }



    private void display_A(int i) {
        TextView score_a = (TextView)findViewById(R.id.teamA_score);
        score_a.setText(String.valueOf(i));
    }
    private void display_B(int j) {
        TextView score_b = (TextView)findViewById(R.id.teamB_score);
        score_b.setText(String.valueOf(j));
    }


}
