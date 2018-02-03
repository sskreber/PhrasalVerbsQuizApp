package com.example.android.quizapp;

import android.content.Intent;
import android.view.View;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class HardActivity extends AppCompatActivity {

    // Declares total score, selected answers and typed-in answers as global constants, initializes total score as variable.

    static final String TOTALSCORE = "totalScore";
    static final String TEXT_Q9 = "textQ9";
    static final String TEXT_Q10 = "textQ10";
    static final String HARD_Q1_OP1 = "hardQ1op1String";
    static final String HARD_Q1_OP2 = "hardQ1op2String";
    static final String HARD_Q1_OP3 = "hardQ1op3String";
    static final String HARD_Q1_OP4 = "hardQ1op4String";
    static final String HARD_Q2_OP1 = "hardQ2op1String";
    static final String HARD_Q2_OP2 = "hardQ2op2String";
    static final String HARD_Q2_OP3 = "hardQ2op3String";
    static final String HARD_Q2_OP4 = "hardQ2op4String";
    static final String HARD_Q3_OP1 = "hardQ3op1String";
    static final String HARD_Q3_OP2 = "hardQ3op2String";
    static final String HARD_Q3_OP3 = "hardQ3op3String";
    static final String HARD_Q3_OP4 = "hardQ3op4String";
    static final String HARD_Q4_OP1 = "hardQ4op1String";
    static final String HARD_Q4_OP2 = "hardQ4op2String";
    static final String HARD_Q4_OP3 = "hardQ4op3String";
    static final String HARD_Q4_OP4 = "hardQ4op4String";
    static final String HARD_Q5_OP1 = "hardQ5op1String";
    static final String HARD_Q5_OP2 = "hardQ5op2String";
    static final String HARD_Q5_OP3 = "hardQ5op3String";
    static final String HARD_Q5_OP4 = "hardQ5op4String";
    static final String HARD_Q6_OP1 = "hardQ6op1String";
    static final String HARD_Q6_OP2 = "hardQ6op2String";
    static final String HARD_Q6_OP3 = "hardQ6op3String";
    static final String HARD_Q6_OP4 = "hardQ6op4String";
    static final String HARD_Q7_OP1 = "hardQ7op1String";
    static final String HARD_Q7_OP2 = "hardQ7op2String";
    static final String HARD_Q7_OP3 = "hardQ7op3String";
    static final String HARD_Q7_OP4 = "hardQ7op4String";
    static final String HARD_Q8_OP1 = "hardQ8op1String";
    static final String HARD_Q8_OP2 = "hardQ8op2String";
    static final String HARD_Q8_OP3 = "hardQ8op3String";
    static final String HARD_Q8_OP4 = "hardQ8op4String";
    double totalScore;
    String textQ9;
    String textQ10;

    // Pulls out the value of the total score, the selected answers and the typed-in answers.

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        // Saves user's current scores.

        RadioButton hardQ1op1 = (RadioButton) findViewById(R.id.hardQ1op1);
        String hardQ1op1String = hardQ1op1.getText().toString();
        RadioButton hardQ1op2 = (RadioButton) findViewById(R.id.hardQ1op2);
        String hardQ1op2String = hardQ1op2.getText().toString();
        RadioButton hardQ1op3 = (RadioButton) findViewById(R.id.hardQ1op3);
        String hardQ1op3String = hardQ1op3.getText().toString();
        RadioButton hardQ1op4 = (RadioButton) findViewById(R.id.hardQ1op4);
        String hardQ1op4String = hardQ1op4.getText().toString();
        RadioButton hardQ2op1 = (RadioButton) findViewById(R.id.hardQ2op1);
        String hardQ2op1String = hardQ2op1.getText().toString();
        RadioButton hardQ2op2 = (RadioButton) findViewById(R.id.hardQ2op2);
        String hardQ2op2String = hardQ2op2.getText().toString();
        RadioButton hardQ2op3 = (RadioButton) findViewById(R.id.hardQ2op3);
        String hardQ2op3String = hardQ2op3.getText().toString();
        RadioButton hardQ2op4 = (RadioButton) findViewById(R.id.hardQ2op4);
        String hardQ2op4String = hardQ2op4.getText().toString();
        RadioButton hardQ3op1 = (RadioButton) findViewById(R.id.hardQ3op1);
        String hardQ3op1String = hardQ3op1.getText().toString();
        RadioButton hardQ3op2 = (RadioButton) findViewById(R.id.hardQ3op2);
        String hardQ3op2String = hardQ3op2.getText().toString();
        RadioButton hardQ3op3 = (RadioButton) findViewById(R.id.hardQ3op3);
        String hardQ3op3String = hardQ3op3.getText().toString();
        RadioButton hardQ3op4 = (RadioButton) findViewById(R.id.hardQ3op4);
        String hardQ3op4String = hardQ3op4.getText().toString();
        RadioButton hardQ4op1 = (RadioButton) findViewById(R.id.hardQ4op1);
        String hardQ4op1String = hardQ4op1.getText().toString();
        RadioButton hardQ4op2 = (RadioButton) findViewById(R.id.hardQ4op2);
        String hardQ4op2String = hardQ4op2.getText().toString();
        RadioButton hardQ4op3 = (RadioButton) findViewById(R.id.hardQ4op3);
        String hardQ4op3String = hardQ4op3.getText().toString();
        RadioButton hardQ4op4 = (RadioButton) findViewById(R.id.hardQ4op4);
        String hardQ4op4String = hardQ4op4.getText().toString();

        CheckBox hardQ5op1 = (CheckBox) findViewById(R.id.hardQ5op1);
        String hardQ5op1String = hardQ5op1.getText().toString();
        CheckBox hardQ5op2 = (CheckBox) findViewById(R.id.hardQ5op2);
        String hardQ5op2String = hardQ5op2.getText().toString();
        CheckBox hardQ5op3 = (CheckBox) findViewById(R.id.hardQ5op3);
        String hardQ5op3String = hardQ5op3.getText().toString();
        CheckBox hardQ5op4 = (CheckBox) findViewById(R.id.hardQ5op4);
        String hardQ5op4String = hardQ5op4.getText().toString();
        CheckBox hardQ6op1 = (CheckBox) findViewById(R.id.hardQ6op1);
        String hardQ6op1String = hardQ6op1.getText().toString();
        CheckBox hardQ6op2 = (CheckBox) findViewById(R.id.hardQ6op2);
        String hardQ6op2String = hardQ6op2.getText().toString();
        CheckBox hardQ6op3 = (CheckBox) findViewById(R.id.hardQ6op3);
        String hardQ6op3String = hardQ6op3.getText().toString();
        CheckBox hardQ6op4 = (CheckBox) findViewById(R.id.hardQ6op4);
        String hardQ6op4String = hardQ6op4.getText().toString();
        CheckBox hardQ7op1 = (CheckBox) findViewById(R.id.hardQ7op1);
        String hardQ7op1String = hardQ7op1.getText().toString();
        CheckBox hardQ7op2 = (CheckBox) findViewById(R.id.hardQ7op2);
        String hardQ7op2String = hardQ7op2.getText().toString();
        CheckBox hardQ7op3 = (CheckBox) findViewById(R.id.hardQ7op3);
        String hardQ7op3String = hardQ7op3.getText().toString();
        CheckBox hardQ7op4 = (CheckBox) findViewById(R.id.hardQ7op4);
        String hardQ7op4String = hardQ7op4.getText().toString();
        CheckBox hardQ8op1 = (CheckBox) findViewById(R.id.hardQ8op1);
        String hardQ8op1String = hardQ8op1.getText().toString();
        CheckBox hardQ8op2 = (CheckBox) findViewById(R.id.hardQ8op2);
        String hardQ8op2String = hardQ8op2.getText().toString();
        CheckBox hardQ8op3 = (CheckBox) findViewById(R.id.hardQ8op3);
        String hardQ8op3String = hardQ8op3.getText().toString();
        CheckBox hardQ8op4 = (CheckBox) findViewById(R.id.hardQ8op4);
        String hardQ8op4String = hardQ8op4.getText().toString();

        savedInstanceState.putDouble(TOTALSCORE, totalScore);

        savedInstanceState.putString(HARD_Q1_OP1, hardQ1op1String);
        savedInstanceState.putString(HARD_Q1_OP2, hardQ1op2String);
        savedInstanceState.putString(HARD_Q1_OP3, hardQ1op3String);
        savedInstanceState.putString(HARD_Q1_OP4, hardQ1op4String);
        savedInstanceState.putString(HARD_Q2_OP1, hardQ2op1String);
        savedInstanceState.putString(HARD_Q2_OP2, hardQ2op2String);
        savedInstanceState.putString(HARD_Q2_OP3, hardQ2op3String);
        savedInstanceState.putString(HARD_Q2_OP4, hardQ2op4String);
        savedInstanceState.putString(HARD_Q3_OP1, hardQ3op1String);
        savedInstanceState.putString(HARD_Q3_OP2, hardQ3op2String);
        savedInstanceState.putString(HARD_Q3_OP3, hardQ3op3String);
        savedInstanceState.putString(HARD_Q3_OP4, hardQ3op4String);
        savedInstanceState.putString(HARD_Q4_OP1, hardQ4op1String);
        savedInstanceState.putString(HARD_Q4_OP2, hardQ4op2String);
        savedInstanceState.putString(HARD_Q4_OP3, hardQ4op3String);
        savedInstanceState.putString(HARD_Q4_OP4, hardQ4op4String);
        savedInstanceState.putString(HARD_Q5_OP1, hardQ5op1String);
        savedInstanceState.putString(HARD_Q5_OP2, hardQ5op2String);
        savedInstanceState.putString(HARD_Q5_OP3, hardQ5op3String);
        savedInstanceState.putString(HARD_Q5_OP4, hardQ5op4String);
        savedInstanceState.putString(HARD_Q6_OP1, hardQ6op1String);
        savedInstanceState.putString(HARD_Q6_OP2, hardQ6op2String);
        savedInstanceState.putString(HARD_Q6_OP3, hardQ6op3String);
        savedInstanceState.putString(HARD_Q6_OP4, hardQ6op4String);
        savedInstanceState.putString(HARD_Q7_OP1, hardQ7op1String);
        savedInstanceState.putString(HARD_Q7_OP2, hardQ7op2String);
        savedInstanceState.putString(HARD_Q7_OP3, hardQ7op3String);
        savedInstanceState.putString(HARD_Q7_OP4, hardQ7op4String);
        savedInstanceState.putString(HARD_Q8_OP1, hardQ8op1String);
        savedInstanceState.putString(HARD_Q8_OP2, hardQ8op2String);
        savedInstanceState.putString(HARD_Q8_OP3, hardQ8op3String);
        savedInstanceState.putString(HARD_Q8_OP4, hardQ8op4String);

        savedInstanceState.putString(TEXT_Q9, textQ9);
        savedInstanceState.putString(TEXT_Q10, textQ10);

        // Calls on the superclass to save the view hierarchy state.
        super.onSaveInstanceState(savedInstanceState);
    }

    // Continues or starts activity after checking if there is a previous saved activity to reload or not.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (savedInstanceState != null) {
            setContentView(R.layout.activity_hard);
            totalScore = savedInstanceState.getInt(TOTALSCORE);
        } else
            setContentView(R.layout.activity_hard);
    }

    // Gets the value of the total score for the saved state instead of the default value.

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        totalScore = savedInstanceState.getDouble(TOTALSCORE);
    }

    /**
     * Declares a method that will calculate user's full score. Initializes total score to zero, then one by one
     * adds each question's related score to it.
     */

    public void submitQuiz(View v) {
        totalScore = 0;
        RadioButton correctQ1 = findViewById(R.id.hardQ1op2);
        if (correctQ1.isChecked()) {
            totalScore += 1;
        }
        RadioButton correctQ2 = findViewById(R.id.hardQ2op3);
        if (correctQ2.isChecked()) {
            totalScore += 1;
        }
        RadioButton correctQ3 = findViewById(R.id.hardQ3op2);
        if (correctQ3.isChecked()) {
            totalScore += 1;
        }
        RadioButton correctQ4 = findViewById(R.id.hardQ4op4);
        if (correctQ4.isChecked()) {
            totalScore += 1;
        }

        /**
         * I will need to find a better way to deal with the checkboxes.
         * (And a more elegant one than using a million if statements per question.)
         * TODO: find a way to lock the two other boxes once user selected two already.
         * Right now user can check more than 2 boxes, and the scoring deals with this
         * instead of making the selection of more than 2 boxes impossible.
         * If they choose the 2 right answers AND a wrong one, they receive no point.
         * If they check both wrong answers, they receive no points, no matter what else they check in addition.
         * If they check one of the right answers and nothing else, or if they check a right answer and a wrong one,
         * they receive half a point.
         * If they check both right answers and nothing else, they receive 1 point.
         */

        CheckBox correctQ5_1 = findViewById(R.id.hardQ5op1);
        CheckBox correctQ5_4 = findViewById(R.id.hardQ5op4);
        CheckBox incorrectQ5_2 = findViewById(R.id.hardQ5op2);
        CheckBox incorrectQ5_3 = findViewById(R.id.hardQ5op3);
        if (incorrectQ5_2.isChecked() && incorrectQ5_3.isChecked()) {
            totalScore = totalScore;
        } else if (incorrectQ5_2.isChecked() || incorrectQ5_3.isChecked()) {
            if (correctQ5_1.isChecked() && correctQ5_4.isChecked()) {
                totalScore = totalScore;
            }
        } else if (incorrectQ5_2.isChecked() || incorrectQ5_3.isChecked()) {
            if (correctQ5_1.isChecked() || correctQ5_4.isChecked()) {
                totalScore += 0.5;
            }
        } else if (correctQ5_1.isChecked() && correctQ5_4.isChecked()) {
            totalScore++;
        } else if (correctQ5_1.isChecked() || correctQ5_4.isChecked()) {
            totalScore += 0.5;
        }

        CheckBox correctQ6_1 = findViewById(R.id.hardQ6op1);
        CheckBox correctQ6_3 = findViewById(R.id.hardQ6op3);
        CheckBox incorrectQ6_2 = findViewById(R.id.hardQ6op2);
        CheckBox incorrectQ6_4 = findViewById(R.id.hardQ6op4);
        if (incorrectQ6_2.isChecked() && incorrectQ6_4.isChecked()) {
            totalScore = totalScore;
        } else if (incorrectQ6_2.isChecked() || incorrectQ6_4.isChecked()) {
            if (correctQ6_1.isChecked() && correctQ6_3.isChecked()) {
                totalScore = totalScore;
            }
        } else if (incorrectQ6_2.isChecked() || incorrectQ6_4.isChecked()) {
            if (correctQ6_1.isChecked() || correctQ6_3.isChecked()) {
                totalScore += 0.5;
            }
        } else if (correctQ6_1.isChecked() && correctQ6_3.isChecked()) {
            totalScore++;
        } else if (correctQ6_1.isChecked() || correctQ6_3.isChecked()) {
            totalScore += 0.5;
        }

        CheckBox correctQ7_2 = findViewById(R.id.hardQ7op2);
        CheckBox correctQ7_3 = findViewById(R.id.hardQ7op3);
        CheckBox incorrectQ7_1 = findViewById(R.id.hardQ7op1);
        CheckBox incorrectQ7_4 = findViewById(R.id.hardQ7op4);
        if (incorrectQ7_1.isChecked() && incorrectQ7_4.isChecked()) {
            totalScore = totalScore;
        } else if (incorrectQ7_1.isChecked() || incorrectQ7_4.isChecked()) {
            if (correctQ7_2.isChecked() && correctQ7_3.isChecked()) {
                totalScore = totalScore;
            }
        } else if (incorrectQ7_1.isChecked() || incorrectQ7_4.isChecked()) {
            if (correctQ7_2.isChecked() || correctQ7_3.isChecked()) {
                totalScore += 0.5;
            }
        } else if (correctQ7_2.isChecked() && correctQ7_3.isChecked()) {
            totalScore++;
        } else if (correctQ7_2.isChecked() || correctQ7_3.isChecked()) {
            totalScore += 0.5;
        }

        CheckBox correctQ8_2 = findViewById(R.id.hardQ8op2);
        CheckBox correctQ8_4 = findViewById(R.id.hardQ8op4);
        CheckBox incorrectQ8_1 = findViewById(R.id.hardQ8op1);
        CheckBox incorrectQ8_3 = findViewById(R.id.hardQ8op3);
        if (incorrectQ8_1.isChecked() && incorrectQ8_3.isChecked()) {
            totalScore = totalScore;
        } else if (incorrectQ8_1.isChecked() || incorrectQ8_3.isChecked()) {
            if (correctQ8_2.isChecked() && correctQ8_4.isChecked()) {
                totalScore = totalScore;
            }
        } else if (incorrectQ8_1.isChecked() || incorrectQ8_3.isChecked()) {
            if (correctQ8_2.isChecked() || correctQ8_4.isChecked()) {
                totalScore += 0.5;
            }
        } else if (correctQ8_2.isChecked() && correctQ8_4.isChecked()) {
            totalScore++;
        } else if (correctQ8_2.isChecked() || correctQ8_4.isChecked()) {
            totalScore += 0.5;
        }

        EditText textQ9Text = findViewById(R.id.answerQ9);
        String textQ9 = textQ9Text.getText().toString();
        if (textQ9.equalsIgnoreCase(getString(R.string.correctAnswerQ9))) {
            totalScore += 1;
        }

        EditText text10Text = findViewById(R.id.answerQ10);
        String text10 = text10Text.getText().toString();
        if (text10.equalsIgnoreCase(getString(R.string.correctAnswerQ10))) {
            totalScore += 1;
        }

        displayResult(totalScore);
    }

    /**
     * Declares a method that displays user's score result in a hitherto null-content text view.
     * Method is called when user clicks Submit Quiz button.
     *
     * @param totalScore User's full score calculated upon submitting the quiz.
     *                   The totalScore variable is a double, as it is possible to score half points with the checkbox answer alternatives.
     *                   Method renders the Submit Quiz button invisible after user clicked on it.
     *                   A customized toast message pops up, its message depending on user's score.
     */

    private void displayResult(double totalScore) {
        String name = getIntent().getExtras().getString("name", "name");
        String resultMessage = "Hi " + name + "!";
        resultMessage += "\nYour results: " + totalScore + " p /10 p";
        TextView scoreSummaryTextView = (TextView) findViewById(R.id.resultText);
        scoreSummaryTextView.setText(resultMessage);
        TextView submitButton = (TextView) findViewById(R.id.submit);
        submitButton.setVisibility(View.GONE);
        String toastHard1 = getString(R.string.toastHard1);
        String toastHard2 = getString(R.string.toastHard2);
        String toastHard3 = getString(R.string.toastHard3);
        String toastHard4 = getString(R.string.toastHard4);
        if (totalScore < 4) {
            Toast.makeText(getApplicationContext(), toastHard1, Toast.LENGTH_LONG).show();
        } else if (totalScore >= 3 && totalScore <= 6) {
            Toast.makeText(getApplicationContext(), toastHard2, Toast.LENGTH_LONG).show();
        } else if (totalScore > 6 && totalScore < 9) {
            Toast.makeText(getApplicationContext(), toastHard3, Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(getApplicationContext(), toastHard4, Toast.LENGTH_LONG).show();
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


