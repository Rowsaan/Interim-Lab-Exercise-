package com.example.ownquizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioGroup;

public class QuizActivity extends AppCompatActivity {

    private Button submitButton;
    private int score;
    private RadioGroup numOneRadionGroup;
    private RadioGroup numTwoRadionGroup;
    private RadioGroup numThreeRadionGroup;
    private RadioGroup numFourRadionGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        submitButton = findViewById(R.id.submit_button);
        numOneRadionGroup = findViewById(R.id.num_one_radio_group);
        numTwoRadionGroup = findViewById(R.id.num_two_radio_group);
        numThreeRadionGroup = findViewById(R.id.num_three_radio_group);
        numFourRadionGroup = findViewById(R.id.num_four_radio_group);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score = 0;
                if (numOneRadionGroup.getCheckedRadioButtonId() == R.id.rhododendron_ferrugineum_radio) {
                    score += 1;
                }

                if (numTwoRadionGroup.getCheckedRadioButtonId() == R.id.rosa_radio) {
                    score += 1;
                }

                if (numThreeRadionGroup.getCheckedRadioButtonId() == R.id.ocimum_tenuiflorum_radio) {
                    score += 1;
                }

                if (numFourRadionGroup.getCheckedRadioButtonId() == R.id.azadirachta_indica_radio) {
                    score += 1;
                }

                Intent intent= new Intent(QuizActivity.this, ScoreActivity.class);
                intent.putExtra("SCORE",score+"/4");
                startActivity(intent);
            }

        });
    }
}