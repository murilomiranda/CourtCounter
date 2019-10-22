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

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Show 3 when button +3 points is pressed
     */
    public void add3ForTeamA(View v) {
        scoreA += 3;
        displayForTeamA(scoreA);
    }

    /**
     * Show 2 when button +2 points is pressed
     */
    public void add2ForTeamA(View v) {
        scoreA += 2;
        displayForTeamA(scoreA);
    }

    /**
     * Show 1 when button free throw is pressed
     */
    public void add1ForTeamA(View v) {
        scoreA += 1;
        displayForTeamA(scoreA);
    }

    /**
     * Show 3 when button +3 points is pressed
     */
    public void add3ForTeamB(View v) {
        scoreB += 3;
        displayForTeamB(scoreB);
    }

    /**
     * Show 2 when button +2 points is pressed
     */
    public void add2ForTeamB(View v) {
        scoreB += 2;
        displayForTeamB(scoreB);
    }

    /**
     * Show 1 when button free throw is pressed
     */
    public void add1ForTeamB(View v) {
        scoreB += 1;
        displayForTeamB(scoreB);
    }

    public void reset(View v) {
        scoreA = 0;
        scoreB = 0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }
}
