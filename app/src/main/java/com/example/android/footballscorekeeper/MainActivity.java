package com.example.android.footballscorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int homeTeamScore = 0;
    int awayTeamScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayScoreHomeTeam(int score) {
        TextView scoreView = (TextView) findViewById(R.id.home_team_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayScoreAwayTeam(int score) {
        TextView scoreView = (TextView) findViewById(R.id.away_team_score);
        scoreView.setText(String.valueOf(score));
    }

    public void touchDownHomeTeam(View v) {
        homeTeamScore = homeTeamScore + 6;
        displayScoreHomeTeam(homeTeamScore);
    }

    public void touchDownAwayTeam(View v) {
        awayTeamScore = awayTeamScore + 6;
        displayScoreAwayTeam(awayTeamScore);
    }

    public void fieldGoalHomeTeam(View v) {
        homeTeamScore = homeTeamScore + 3;
        displayScoreHomeTeam(homeTeamScore);
    }

    public void fieldGoalAwayTeam(View v) {
        awayTeamScore = awayTeamScore + 3;
        displayScoreAwayTeam(awayTeamScore);
    }
    public void twoPointConversionHomeTeam(View v) {
        homeTeamScore = homeTeamScore + 2;
        displayScoreHomeTeam(homeTeamScore);
    }

    public void twoPointConversionAwayTeam(View v) {
        awayTeamScore = awayTeamScore + 2;
        displayScoreAwayTeam(awayTeamScore);
    }
    public void extraPointHomeTeam(View v) {
        homeTeamScore = homeTeamScore + 1;
        displayScoreHomeTeam(homeTeamScore);
    }

    public void extraPointAwayTeam(View v) {
        awayTeamScore = awayTeamScore + 1;
        displayScoreAwayTeam(awayTeamScore);
    }

    public void newGame(View v) {
        homeTeamScore = 0;
        awayTeamScore = 0;
        displayScoreHomeTeam(homeTeamScore);
        displayScoreAwayTeam(awayTeamScore);
    }

}
