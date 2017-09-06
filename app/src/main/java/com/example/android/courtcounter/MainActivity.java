package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    int teamA = 0, teamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayTeamA(0);
        displayTeamB(0);
    }

    private void displayTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreA);
        scoreView.setText(String.valueOf(score));
    }

    private void displayTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreB);
        scoreView.setText(String.valueOf(score));
    }

    public void add3A(View v) {
        teamA += 3;
        displayTeamA(teamA);
    }

    public void add2A(View v) {
        teamA += 2;
        displayTeamA(teamA);
    }

    public void addA(View v) {
        teamA++;
        displayTeamA(teamA);
    }

    public void add3B(View v) {
        teamB += 3;
        displayTeamB(teamB);
    }

    public void add2B(View v) {
        teamB += 2;
        displayTeamB(teamB);
    }

    public void addB(View v) {
        teamB++;
        displayTeamB(teamB);
    }

    public void reset(View v) {
        teamB = 0;
        teamA = 0;
        displayTeamA(teamA);
        displayTeamB(teamB);
    }
}
