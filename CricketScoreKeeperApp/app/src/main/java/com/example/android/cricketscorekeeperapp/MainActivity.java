package com.example.android.cricketscorekeeperapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    int scoreIndia = 0;
    int scoreEngland = 0;
    int scoreOutIndia = 0;
    int scoreOutEngland = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForIndia(scoreIndia);
        displayForEngland(scoreEngland);
    }

    /**
     * Displays the given score for India
     **/
    public void displayForIndia(int score) {
        TextView scoreView = findViewById(R.id.team_1_score);
        String scoreString = score + "/" + scoreOutIndia;
        scoreView.setText(scoreString);
    }

    /**
     * This Method is called when six button is clicked
     * for team India
     **/
    public void addSixForIndia(View view) {
        scoreIndia += 6;
        displayForIndia(scoreIndia);
    }

    /**
     * This Method is called when four button is clicked
     * for team India
     **/
    public void addFourForIndia(View view) {
        scoreIndia += 4;
        displayForIndia(scoreIndia);
    }

    /**
     * This Method is called when single button is clicked
     * for team India
     **/
    public void addOneForIndia(View view) {
        scoreIndia += 1;
        displayForIndia(scoreIndia);
    }

    /**
     * This Method is called when out button is clicked
     * for team India
     **/
    public void addOneForOutIndia(View view) {
        if (scoreOutIndia < 10) {
            scoreOutIndia += 1;
        }
        displayForIndia(scoreIndia);
    }

    /**
     * Displays the given score for England
     **/
    public void displayForEngland(int score) {
        TextView scoreView = findViewById(R.id.team_2_score);
        String scoreString = score + "/" + scoreOutEngland;
        scoreView.setText(scoreString);
    }

    /**
     * This Method is called when six button is clicked
     * for team England
     **/
    public void addSixForEngland(View view) {
        scoreEngland += 6;
        displayForEngland(scoreEngland);
    }

    /**
     * This Method is called when four button is clicked
     * for team England
     **/
    public void addFourForEngland(View view) {
        scoreEngland += 4;
        displayForEngland(scoreEngland);
    }

    /**
     * This Method is called when single button is clicked
     * for team England
     **/
    public void addOneForEngland(View view) {
        scoreEngland += 1;
        displayForEngland(scoreEngland);
    }

    /**
     * This Method is called when out button is clicked
     * for team England
     **/
    public void addOneForOutEngland(View view) {
        if (scoreOutEngland < 10) {
            scoreOutEngland += 1;
        }
        displayForEngland(scoreEngland);
    }

    /**
     * This Method is called when RESET button is clicked
     **/
    public void resetScore(View v) {
        scoreIndia = 0;
        scoreOutIndia = 0;
        displayForIndia(scoreIndia);
        scoreEngland = 0;
        scoreOutEngland = 0;
        displayForEngland(scoreEngland);


    }


}
