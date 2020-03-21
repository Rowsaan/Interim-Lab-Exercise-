package com.example.cricketgamesscore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int teamAScore;
    private int teamAWicketScore;
    private int teamAOverScore;
    private int teamBScore;
    private int teamBWicketScore;
    private int teamBOverScore;
    private TextView teamATextViewScore;
    private TextView teamATextViewWicketScore;
    private TextView teamATextViewOverScore;
    private TextView teamBTextViewScore;
    private TextView teamBTextViewWicketScore;
    private TextView teamBTextViewOverScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        teamATextViewScore=findViewById(R.id.team_a_score);
        teamATextViewWicketScore=findViewById(R.id.team_a_wicket_score);
        teamATextViewOverScore=findViewById(R.id.team_a_over_score);
        teamBTextViewScore=findViewById(R.id.team_b_score);
        teamBTextViewWicketScore=findViewById(R.id.team_b_wicket_score);
        teamBTextViewOverScore=findViewById(R.id.team_b_over_score);

    }


    public void updateForTeamAWicket(View view){
        teamAWicketScore=teamAWicketScore+1;
        displayWicketScoreTeamA(teamAWicketScore);
    }

    public void updateForTeamAOver(View view){
        teamAOverScore=teamAOverScore+1;
        displayOverScoreTeamA(teamAOverScore);
    }


    public void updateForTeamBWicket(View view){
        teamBWicketScore=teamBWicketScore+1;
        displayWicketScoreTeamB(teamBWicketScore);
    }

    public void updateForTeamBOver(View view){
        teamBOverScore=teamBOverScore+1;
        displayOverScoreTeamB(teamBOverScore);
    }

    public void updateForTeamAPoint3(View view){
        teamAScore=teamAScore+6;
        displayScoreTeamA(teamAScore);
    }

    public void updateForTeamAPoint4(View view){
        teamAScore=teamAScore+2;
        displayScoreTeamA(teamAScore);
    }

    public void updateForTeamAPoint5(View view){
        teamAScore=teamAScore+1;
        displayScoreTeamA(teamAScore);
    }

    public void updateForTeamAPoint2(View view){
        teamAScore=teamAScore+4;
        displayScoreTeamA(teamAScore);
    }

    public void updateForTeamAPoint1(View view){
        teamAScore=teamAScore+3;
        displayScoreTeamA(teamAScore);
    }

    public void updateForTeamBPoint3(View view){
        teamBScore=teamBScore+6;
        displayScoreTeamB(teamBScore);
    }

    public void updateForTeamBPoint2(View view){
        teamBScore=teamBScore+4;
        displayScoreTeamB(teamBScore);
    }

    public void updateForTeamBPoint1(View view){
        teamBScore=teamBScore+3;
        displayScoreTeamB(teamBScore);
    }

    public void updateForTeamBPoint4(View view){
        teamBScore=teamBScore+2;
        displayScoreTeamB(teamBScore);
    }

    public void updateForTeamBPoint5(View view){
        teamBScore=teamBScore+1;
        displayScoreTeamB(teamBScore);
    }
    public void updateForReset(View view){
        teamAScore=0;
        teamBScore=0;
        teamAWicketScore=0;
        teamAOverScore=0;
        teamBWicketScore=0;
        teamBOverScore=0;
        displayScoreTeamB(teamBScore);
        displayScoreTeamA(teamAScore);
        displayWicketScoreTeamA(teamAWicketScore);
        displayOverScoreTeamA(teamAOverScore);
        displayWicketScoreTeamB(teamBWicketScore);
        displayOverScoreTeamB(teamBOverScore);
    }
    public void displayScoreTeamA(int score){
        teamATextViewScore.setText(String.valueOf(score));
    }
    public void displayWicketScoreTeamA(int score){ teamATextViewWicketScore.setText(String.valueOf(score));  }
    public void displayOverScoreTeamA(int score){ teamATextViewOverScore.setText(String.valueOf(score));  }
    public void displayScoreTeamB(int score){
        teamBTextViewScore.setText(String.valueOf(score));
    }
    public void displayWicketScoreTeamB(int score){ teamBTextViewWicketScore.setText(String.valueOf(score));  }
    public void displayOverScoreTeamB(int score){ teamBTextViewOverScore.setText(String.valueOf(score));  }


}