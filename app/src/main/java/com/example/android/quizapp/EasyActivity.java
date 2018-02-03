package com.example.android.quizapp;

import android.content.Intent;
import android.view.View;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.view.View.OnClickListener;
import android.widget.Toast;

import java.lang.reflect.Method;

public class EasyActivity extends AppCompatActivity {

    // Declares total score and selected answers as global constants, initializes total score as variable.

    static final String TOTALSCORE = "totalScore";
    static final String EASY_Q1_OP1 = "easyQ1op1String";
    static final String EASY_Q1_OP2 = "easyQ1op2String";
    static final String EASY_Q1_OP3 = "easyQ1op3String";
    static final String EASY_Q1_OP4 = "easyQ1op4String";
    static final String EASY_Q2_OP1 = "easyQ2op1String";
    static final String EASY_Q2_OP2 = "easyQ2op2String";
    static final String EASY_Q2_OP3 = "easyQ2op3String";
    static final String EASY_Q2_OP4 = "easyQ2op4String";
    static final String EASY_Q3_OP1 = "easyQ3op1String";
    static final String EASY_Q3_OP2 = "easyQ3op2String";
    static final String EASY_Q3_OP3 = "easyQ3op3String";
    static final String EASY_Q3_OP4 = "easyQ3op4String";
    static final String EASY_Q4_OP1 = "easyQ4op1String";
    static final String EASY_Q4_OP2 = "easyQ4op2String";
    static final String EASY_Q4_OP3 = "easyQ4op3String";
    static final String EASY_Q4_OP4 = "easyQ4op4String";
    static final String EASY_Q5_OP1 = "easyQ5op1String";
    static final String EASY_Q5_OP2 = "easyQ5op2String";
    static final String EASY_Q5_OP3 = "easyQ5op3String";
    static final String EASY_Q5_OP4 = "easyQ5op4String";
    static final String EASY_Q6_OP1 = "easyQ6op1String";
    static final String EASY_Q6_OP2 = "easyQ6op2String";
    static final String EASY_Q6_OP3 = "easyQ6op3String";
    static final String EASY_Q6_OP4 = "easyQ6op4String";
    static final String EASY_Q7_OP1 = "easyQ7op1String";
    static final String EASY_Q7_OP2 = "easyQ7op2String";
    static final String EASY_Q7_OP3 = "easyQ7op3String";
    static final String EASY_Q7_OP4 = "easyQ7op4String";
    static final String EASY_Q8_OP1 = "easyQ8op1String";
    static final String EASY_Q8_OP2 = "easyQ8op2String";
    static final String EASY_Q8_OP3 = "easyQ8op3String";
    static final String EASY_Q8_OP4 = "easyQ8op4String";
    static final String EASY_Q9_OP1 = "easyQ9op1String";
    static final String EASY_Q9_OP2 = "easyQ9op2String";
    static final String EASY_Q9_OP3 = "easyQ9op3String";
    static final String EASY_Q9_OP4 = "easyQ9op4String";
    static final String EASY_Q10_OP1 = "easyQ10op1String";
    static final String EASY_Q10_OP2 = "easyQ10op2String";
    static final String EASY_Q10_OP3 = "easyQ10op3String";
    static final String EASY_Q10_OP4 = "easyQ10op4String";
    int totalScore;

    // Pulls out the value of the total score and the selected answers.

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        // Saves user's current score and selected answers.

        RadioButton easyQ1op1 = (RadioButton) findViewById(R.id.easyQ1op1);
        String easyQ1op1String = easyQ1op1.getText().toString();
        RadioButton easyQ1op2 = (RadioButton) findViewById(R.id.easyQ1op2);
        String easyQ1op2String = easyQ1op2.getText().toString();
        RadioButton easyQ1op3 = (RadioButton) findViewById(R.id.easyQ1op3);
        String easyQ1op3String = easyQ1op3.getText().toString();
        RadioButton easyQ1op4 = (RadioButton) findViewById(R.id.easyQ1op4);
        String easyQ1op4String = easyQ1op4.getText().toString();
        RadioButton easyQ2op1 = (RadioButton) findViewById(R.id.easyQ2op1);
        String easyQ2op1String = easyQ2op1.getText().toString();
        RadioButton easyQ2op2 = (RadioButton) findViewById(R.id.easyQ2op2);
        String easyQ2op2String = easyQ2op2.getText().toString();
        RadioButton easyQ2op3 = (RadioButton) findViewById(R.id.easyQ2op3);
        String easyQ2op3String = easyQ2op3.getText().toString();
        RadioButton easyQ2op4 = (RadioButton) findViewById(R.id.easyQ2op4);
        String easyQ2op4String = easyQ2op4.getText().toString();
        RadioButton easyQ3op1 = (RadioButton) findViewById(R.id.easyQ3op1);
        String easyQ3op1String = easyQ3op1.getText().toString();
        RadioButton easyQ3op2 = (RadioButton) findViewById(R.id.easyQ3op2);
        String easyQ3op2String = easyQ3op2.getText().toString();
        RadioButton easyQ3op3 = (RadioButton) findViewById(R.id.easyQ3op3);
        String easyQ3op3String = easyQ3op3.getText().toString();
        RadioButton easyQ3op4 = (RadioButton) findViewById(R.id.easyQ3op4);
        String easyQ3op4String = easyQ3op4.getText().toString();
        RadioButton easyQ4op1 = (RadioButton) findViewById(R.id.easyQ4op1);
        String easyQ4op1String = easyQ4op1.getText().toString();
        RadioButton easyQ4op2 = (RadioButton) findViewById(R.id.easyQ4op2);
        String easyQ4op2String = easyQ4op2.getText().toString();
        RadioButton easyQ4op3 = (RadioButton) findViewById(R.id.easyQ4op3);
        String easyQ4op3String = easyQ4op3.getText().toString();
        RadioButton easyQ4op4 = (RadioButton) findViewById(R.id.easyQ4op4);
        String easyQ4op4String = easyQ4op4.getText().toString();
        RadioButton easyQ5op1 = (RadioButton) findViewById(R.id.easyQ5op1);
        String easyQ5op1String = easyQ5op1.getText().toString();
        RadioButton easyQ5op2 = (RadioButton) findViewById(R.id.easyQ5op2);
        String easyQ5op2String = easyQ5op2.getText().toString();
        RadioButton easyQ5op3 = (RadioButton) findViewById(R.id.easyQ5op3);
        String easyQ5op3String = easyQ5op3.getText().toString();
        RadioButton easyQ5op4 = (RadioButton) findViewById(R.id.easyQ5op4);
        String easyQ5op4String = easyQ5op4.getText().toString();
        RadioButton easyQ6op1 = (RadioButton) findViewById(R.id.easyQ6op1);
        String easyQ6op1String = easyQ6op1.getText().toString();
        RadioButton easyQ6op2 = (RadioButton) findViewById(R.id.easyQ6op2);
        String easyQ6op2String = easyQ6op2.getText().toString();
        RadioButton easyQ6op3 = (RadioButton) findViewById(R.id.easyQ6op3);
        String easyQ6op3String = easyQ6op3.getText().toString();
        RadioButton easyQ6op4 = (RadioButton) findViewById(R.id.easyQ6op4);
        String easyQ6op4String = easyQ6op4.getText().toString();
        RadioButton easyQ7op1 = (RadioButton) findViewById(R.id.easyQ7op1);
        String easyQ7op1String = easyQ7op1.getText().toString();
        RadioButton easyQ7op2 = (RadioButton) findViewById(R.id.easyQ7op2);
        String easyQ7op2String = easyQ7op2.getText().toString();
        RadioButton easyQ7op3 = (RadioButton) findViewById(R.id.easyQ7op3);
        String easyQ7op3String = easyQ7op3.getText().toString();
        RadioButton easyQ7op4 = (RadioButton) findViewById(R.id.easyQ7op4);
        String easyQ7op4String = easyQ7op4.getText().toString();
        RadioButton easyQ8op1 = (RadioButton) findViewById(R.id.easyQ8op1);
        String easyQ8op1String = easyQ8op1.getText().toString();
        RadioButton easyQ8op2 = (RadioButton) findViewById(R.id.easyQ8op2);
        String easyQ8op2String = easyQ8op2.getText().toString();
        RadioButton easyQ8op3 = (RadioButton) findViewById(R.id.easyQ8op3);
        String easyQ8op3String = easyQ8op3.getText().toString();
        RadioButton easyQ8op4 = (RadioButton) findViewById(R.id.easyQ8op4);
        String easyQ8op4String = easyQ8op4.getText().toString();
        RadioButton easyQ9op1 = (RadioButton) findViewById(R.id.easyQ9op1);
        String easyQ9op1String = easyQ9op1.getText().toString();
        RadioButton easyQ9op2 = (RadioButton) findViewById(R.id.easyQ9op2);
        String easyQ9op2String = easyQ9op2.getText().toString();
        RadioButton easyQ9op3 = (RadioButton) findViewById(R.id.easyQ9op3);
        String easyQ9op3String = easyQ9op3.getText().toString();
        RadioButton easyQ9op4 = (RadioButton) findViewById(R.id.easyQ9op4);
        String easyQ9op4String = easyQ9op4.getText().toString();
        RadioButton easyQ10op1 = (RadioButton) findViewById(R.id.easyQ10op1);
        String easyQ10op1String = easyQ10op1.getText().toString();
        RadioButton easyQ10op2 = (RadioButton) findViewById(R.id.easyQ10op2);
        String easyQ10op2String = easyQ10op2.getText().toString();
        RadioButton easyQ10op3 = (RadioButton) findViewById(R.id.easyQ10op3);
        String easyQ10op3String = easyQ10op3.getText().toString();
        RadioButton easyQ10op4 = (RadioButton) findViewById(R.id.easyQ10op4);
        String easyQ10op4String = easyQ10op4.getText().toString();

        savedInstanceState.putInt(TOTALSCORE, totalScore);

        savedInstanceState.putString(EASY_Q1_OP1, easyQ1op1String);
        savedInstanceState.putString(EASY_Q1_OP2, easyQ1op2String);
        savedInstanceState.putString(EASY_Q1_OP3, easyQ1op3String);
        savedInstanceState.putString(EASY_Q1_OP4, easyQ1op4String);
        savedInstanceState.putString(EASY_Q2_OP1, easyQ2op1String);
        savedInstanceState.putString(EASY_Q2_OP2, easyQ2op2String);
        savedInstanceState.putString(EASY_Q2_OP3, easyQ2op3String);
        savedInstanceState.putString(EASY_Q2_OP4, easyQ2op4String);
        savedInstanceState.putString(EASY_Q3_OP1, easyQ3op1String);
        savedInstanceState.putString(EASY_Q3_OP2, easyQ3op2String);
        savedInstanceState.putString(EASY_Q3_OP3, easyQ3op3String);
        savedInstanceState.putString(EASY_Q3_OP4, easyQ3op4String);
        savedInstanceState.putString(EASY_Q4_OP1, easyQ4op1String);
        savedInstanceState.putString(EASY_Q4_OP2, easyQ4op2String);
        savedInstanceState.putString(EASY_Q4_OP3, easyQ4op3String);
        savedInstanceState.putString(EASY_Q4_OP4, easyQ4op4String);
        savedInstanceState.putString(EASY_Q5_OP1, easyQ5op1String);
        savedInstanceState.putString(EASY_Q5_OP2, easyQ5op2String);
        savedInstanceState.putString(EASY_Q5_OP3, easyQ5op3String);
        savedInstanceState.putString(EASY_Q5_OP4, easyQ5op4String);
        savedInstanceState.putString(EASY_Q6_OP1, easyQ6op1String);
        savedInstanceState.putString(EASY_Q6_OP2, easyQ6op2String);
        savedInstanceState.putString(EASY_Q6_OP3, easyQ6op3String);
        savedInstanceState.putString(EASY_Q6_OP4, easyQ6op4String);
        savedInstanceState.putString(EASY_Q7_OP1, easyQ7op1String);
        savedInstanceState.putString(EASY_Q7_OP2, easyQ7op2String);
        savedInstanceState.putString(EASY_Q7_OP3, easyQ7op3String);
        savedInstanceState.putString(EASY_Q7_OP4, easyQ7op4String);
        savedInstanceState.putString(EASY_Q8_OP1, easyQ8op1String);
        savedInstanceState.putString(EASY_Q8_OP2, easyQ8op2String);
        savedInstanceState.putString(EASY_Q8_OP3, easyQ8op3String);
        savedInstanceState.putString(EASY_Q8_OP4, easyQ8op4String);
        savedInstanceState.putString(EASY_Q9_OP1, easyQ9op1String);
        savedInstanceState.putString(EASY_Q9_OP2, easyQ9op2String);
        savedInstanceState.putString(EASY_Q9_OP3, easyQ9op3String);
        savedInstanceState.putString(EASY_Q9_OP4, easyQ9op4String);
        savedInstanceState.putString(EASY_Q10_OP1, easyQ10op1String);
        savedInstanceState.putString(EASY_Q10_OP2, easyQ10op2String);
        savedInstanceState.putString(EASY_Q10_OP3, easyQ10op3String);
        savedInstanceState.putString(EASY_Q10_OP4, easyQ10op4String);

        // Calls on the superclass to save the view hierarchy state.
        super.onSaveInstanceState(savedInstanceState);
    }

    // Continues or starts activity after checking if there is a previous saved activity to reload or not.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (savedInstanceState != null) {
            setContentView(R.layout.activity_easy);
            totalScore = savedInstanceState.getInt(TOTALSCORE);
        } else
            setContentView(R.layout.activity_easy);
    }

    // Gets the value of the total score for the saved state instead of the default value.

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        totalScore = savedInstanceState.getInt(TOTALSCORE);
    }

    /**
     * Declares a method that will calculate user's full score. Initializes total score to zero, then one by one
     * adds each question's related score to it.
     */

    public void submitQuiz(View v) {
        totalScore = 0;
        RadioButton correctQ1 = findViewById(R.id.easyQ1op1);
        if (correctQ1.isChecked()) {
            totalScore ++;
        }
        RadioButton correctQ2 = findViewById(R.id.easyQ2op1);
        if (correctQ2.isChecked()) {
            totalScore ++;
        }
        RadioButton correctQ3 = findViewById(R.id.easyQ3op3);
        if (correctQ3.isChecked()) {
            totalScore ++;
        }
        RadioButton correctQ4 = findViewById(R.id.easyQ4op2);
        if (correctQ4.isChecked()) {
            totalScore ++;
        }
        RadioButton correctQ5 = findViewById(R.id.easyQ5op3);
        if (correctQ5.isChecked()) {
            totalScore ++;
        }
        RadioButton correctQ6 = findViewById(R.id.easyQ6op1);
        if (correctQ6.isChecked()) {
            totalScore ++;
        }
        RadioButton correctQ7 = findViewById(R.id.easyQ7op4);
        if (correctQ7.isChecked()) {
            totalScore ++;
        }
        RadioButton correctQ8 = findViewById(R.id.easyQ8op2);
        if (correctQ8.isChecked()) {
            totalScore ++;
        }
        RadioButton correctQ9 = findViewById(R.id.easyQ9op4);
        if (correctQ9.isChecked()) {
            totalScore ++;
        }
        RadioButton correctQ10 = findViewById(R.id.easyQ10op3);
        if (correctQ10.isChecked()) {
            totalScore ++;
        }
        displayResult(totalScore);

    }

    /**
     * Declares a method that displays user's score result in a hitherto null-content text view.
     * Method is called when user clicks Submit Quiz button.
     *
     * @param totalScore User's full score calculated upon submitting the quiz.
     *                   Method renders the Submit Quiz button invisible after user clicked on it.
     *                   A customized toast message pops up, its message depending on user's score.
     */

    private void displayResult(int totalScore) {
        String name = getIntent().getExtras().getString("name", "name");
        String resultMessage = "Hi " + name + "!";
        resultMessage += "\nYour results: " + totalScore + " p /10 p";
        TextView scoreSummaryTextView = (TextView) findViewById(R.id.resultText);
        scoreSummaryTextView.setText(resultMessage);
        TextView submitButton = (TextView) findViewById(R.id.submit);
        submitButton.setVisibility(View.GONE);
        String toastEasy1 = getString(R.string.toastEasy1);
        String toastEasy2 = getString(R.string.toastEasy2);
        String toastEasy3 = getString(R.string.toastEasy3);
        String toastEasy4 = getString(R.string.toastEasy4);
        if (totalScore < 4) {
            Toast.makeText(getApplicationContext(), toastEasy1, Toast.LENGTH_LONG).show();
        } else if (totalScore >= 3 && totalScore <= 6) {
            Toast.makeText(getApplicationContext(), toastEasy2, Toast.LENGTH_LONG).show();
        } else if (totalScore > 6 && totalScore < 9) {
            Toast.makeText(getApplicationContext(), toastEasy3, Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(getApplicationContext(), toastEasy4, Toast.LENGTH_LONG).show();
        }
        resetScore();
    }

    /**
     * Declares a method that gets called as part of the above disPlayResult method (activated when user submits the quiz.
     * Method resets the score to zero.
     */

    private void resetScore() {
        totalScore = 0;
    }

}


