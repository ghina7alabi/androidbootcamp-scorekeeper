package com.example.user.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int scoreForTeamA = 0;
    int scoreForTeamB = 0;

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void sixPointsIncrementA(View view) {
        scoreForTeamA += 6;
        displayForTeamA(scoreForTeamA);
    }

    public void threePointsIncrementA(View view) {
        scoreForTeamA += 3;
        displayForTeamA(scoreForTeamA);
    }

    public void twoPointsIncrementA(View view) {
        scoreForTeamA += 2;
        displayForTeamA(scoreForTeamA);
    }

    public void onePointIncrementA(View view) {
        scoreForTeamA += 1;
        displayForTeamA(scoreForTeamA);
    }


    public void sixPointsIncrementB(View view) {
        scoreForTeamB += 6;
        displayForTeamB(scoreForTeamB);
    }

    public void threePointsIncrementB(View view) {
        scoreForTeamB += 3;
        displayForTeamB(scoreForTeamB);
    }

    public void twoPointsIncrementB(View view) {
        scoreForTeamB += 2;
        displayForTeamB(scoreForTeamB);
    }

    public void onePointIncrementB(View view) {
        scoreForTeamB += 1;
        displayForTeamB(scoreForTeamB);
    }

    public void Reset(View view) {
        scoreForTeamA = 0;
        scoreForTeamB = 0;
        displayForTeamA(scoreForTeamA);
        displayForTeamB(scoreForTeamB);
    }
}
