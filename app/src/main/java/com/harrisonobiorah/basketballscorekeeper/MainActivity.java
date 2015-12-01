package com.harrisonobiorah.basketballscorekeeper;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v7.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private int homeScore = 0;
    private int awayScore = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //this method is how the application knows what view to pull up the screen. The ui is defined in the layout folder
        //so we are able to access the layout file in
        setContentView(R.layout.activity_main);
        updateScore();

    }

    public void plusOneH(View view)
    {
        homeScore++;
        updateScore();
        gameOver();
    }

    public void plusTwoH(View view)
    {
        homeScore += 2;
        updateScore();
        gameOver();
    }

    public void plusOneA(View view)
    {
        awayScore++;
        updateScore();
        gameOver();
    }

    public void plusTwoA(View view)
    {
        awayScore += 2;

        updateScore();
        gameOver();
    }

    public void gameOver()
    {
       if(homeScore>=11)
       {
           TextView homeTeam = (TextView) findViewById(R.id.winningTeam);
           homeTeam.setText("Home Team Won!");
       }
        else if(awayScore>=11)
       {
           TextView awayTeam = (TextView) findViewById(R.id.winningTeam);
           awayTeam.setText("Away Team Won!");
       }


    }

    public void updateScore()
    {
        TextView homeTeam = (TextView) findViewById(R.id.homePoints_text_view);
        TextView awayTeam = (TextView) findViewById(R.id.awayPoints_text_view);

        homeTeam.setText(" " +homeScore);
        awayTeam.setText(" " +awayScore);

    }


    public void reset(View view)
    {
        homeScore =0;
        awayScore = 0;
        updateScore();
        TextView team = (TextView) findViewById(R.id.winningTeam);
        team.setText("");
    }



}