package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA = 0;
    int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void score3A(View v){
        scoreA += 3;
        displayForTeamA();
    }

    public void score2A(View v){
        scoreA += 2;
        displayForTeamA();
    }

    public void freeThrowA(View v){
        scoreA += 1;
        displayForTeamA();
    }

    public void score3B(View v){
        scoreB += 3;
        displayForTeamB();
    }

    public void score2B(View v){
        scoreB += 2;
        displayForTeamB();
    }

    public void freeThrowB(View v){
        scoreB += 1;
        displayForTeamB();
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA() {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreA));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB() {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreB));
    }

    public void resetScore(View v) {
        scoreA = 0;
        scoreB = 0;
        displayForTeamA();
        displayForTeamB();
    }
}
