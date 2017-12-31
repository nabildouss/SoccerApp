package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int scoreA = 0;
    private int scoreB = 0;
    private int foulsA = 0;
    private int foulsB = 0;
    private int yellowCardsA = 0;
    private int redCardsA = 0;
    private int yellowCardsB = 0;
    private int redCardsB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayScoreA(scoreA);
        displayScoreB(scoreB);
        displayYellowA(yellowCardsA);
        displayYellowB(yellowCardsB);
        displayFoulsA(foulsA);
        displayFoulsB(foulsB);
        displayRedA(redCardsA);
        displayRedB(redCardsB);
    }

    //increase the score
    public void scoreA(View view) {
        scoreA++;
        displayScoreA(scoreA);
    }

    public void scoreB(View view) {
        scoreB++;
        displayScoreB(scoreB);
    }

    //increase fouls
    public void foulA(View view) {
        foulsA++;
        displayFoulsA(foulsA);
    }

    public void foulB(View view) {
        foulsB++;
        displayFoulsB(foulsB);
    }

    //increase yellow cards
    public void yellowA(View view) {
        yellowCardsA++;
        displayYellowA(yellowCardsA);
    }

    public void yellowB(View view) {
        yellowCardsB++;
        displayYellowB(yellowCardsB);
    }

    //increase red cards
    public void redA(View view) {
        redCardsA++;
        displayRedA(redCardsA);
    }

    public void redB(View view) {
        redCardsB++;
        displayRedB(redCardsB);
    }


    //reset everything to 0
    public void resetScores(View v) {
        scoreB = 0;
        scoreA = 0;
        yellowCardsA = 0;
        yellowCardsB = 0;
        redCardsA = 0;
        redCardsB = 0;
        foulsA = 0;
        foulsB = 0;
        displayScoreA(scoreA);
        displayScoreB(scoreB);
        displayYellowA(yellowCardsA);
        displayYellowB(yellowCardsB);
        displayFoulsA(foulsA);
        displayFoulsB(foulsB);
        displayRedA(redCardsA);
        displayRedB(redCardsB);
    }

    /**
     * Displays the given score for Team A.
     */
    private void displayScoreA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    private void displayScoreB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays fouls for Team A.
     */
    private void displayFoulsA(int fouls) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_foul);
        scoreView.setText(String.valueOf(fouls));
    }

    /**
     * Displays fouls for Team B.
     */
    private void displayFoulsB(int fouls) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_foul);
        scoreView.setText(String.valueOf(fouls));
    }

    /**
     * Displays yellow cards for Team A.
     */
    private void displayYellowA(int yellowCard) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_yellow);
        scoreView.setText(String.valueOf(yellowCard));
    }

    /**
     * Displays yellow cards for Team B.
     */
    private void displayYellowB(int yellowCard) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_yellow);
        scoreView.setText(String.valueOf(yellowCard));
    }

    /**
     * Displays red cards for Team A.
     */
    private void displayRedA(int redCard) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_red);
        scoreView.setText(String.valueOf(redCard));
    }

    /**
     * Displays red cards for Team B.
     */
    private void displayRedB(int redCard) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_red);
        scoreView.setText(String.valueOf(redCard));
    }

}
