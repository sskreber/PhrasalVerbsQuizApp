package com.example.android.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class HardActivity extends AppCompatActivity {

    /**
     * Declares total score, selected answers and typed-in answers as global constants, initializes total score
     * and selectedOptions (to count selected answers for each checkbox) as variables.
     */

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
    int totalScore;
    String textQ9;
    String textQ10;

    CheckBox[] selectedOptions = {null, null};

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

        savedInstanceState.putInt(TOTALSCORE, totalScore);

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
        totalScore = savedInstanceState.getInt(TOTALSCORE);
    }

    /**
     * Declares a method that will calculate user's full score. Initializes total score to zero, then one by one
     * adds each question's related score to it.
     */

    public void submitQuiz(View v) {
        totalScore = 0;
        RadioButton correctQ1 = findViewById(R.id.hardQ1op2);
        if (correctQ1.isChecked()) {
            totalScore++;
        }
        RadioButton correctQ2 = findViewById(R.id.hardQ2op3);
        if (correctQ2.isChecked()) {
            totalScore++;
        }
        RadioButton correctQ3 = findViewById(R.id.hardQ3op2);
        if (correctQ3.isChecked()) {
            totalScore++;
        }
        RadioButton correctQ4 = findViewById(R.id.hardQ4op4);
        if (correctQ4.isChecked()) {
            totalScore++;
        }

        // Calls on four methods below which score Question 5-8 (all CheckBox-based) and make sure no more than 2 answers are checked.

        checkBox5(v);
        checkBox6(v);
        checkBox7(v);
        checkBox8(v);

        // Scores Question 9 (EditText) by comparing user's input to the predefined right answer.

        EditText textQ9Text = findViewById(R.id.answerQ9);
        String textQ9 = textQ9Text.getText().toString();
        if (textQ9.equalsIgnoreCase(getString(R.string.correctAnswerQ9))) {
            totalScore++;
        }

        // Scores Question 10 (EditText) by comparing user's input to the predefined right answer.

        EditText text10Text = findViewById(R.id.answerQ10);
        String text10 = text10Text.getText().toString();
        if (text10.equalsIgnoreCase(getString(R.string.correctAnswerQ10))) {
            totalScore++;
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
        String toastHard1 = totalScore + getString(R.string.toastHard1);
        String toastHard2 = totalScore + getString(R.string.toastHard2);
        String toastHard3 = totalScore + getString(R.string.toastHard3);
        String toastHard4 = totalScore + getString(R.string.toastHard4);
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

    /**
     * checkBox5-8 are four methods which score Questions 5-8 (all CheckBox-based) and make sure no more than 2 options are checked per question,
     * relying on a helper method validateCheckbox (checkBox1, checkBox2, checkBox3, checkBox4).
     * CREDITS: the creation of the validateCheckbox method and its incorporation into methods checkBox5-8 were all largely due to and based on
     * the help and suggested code examples of this project's first reviewer, Ali. Thank you!
     */

    public void checkBox5(View view) {
        CheckBox correctQ5_1 = findViewById(R.id.hardQ5op1);
        CheckBox correctQ5_4 = findViewById(R.id.hardQ5op4);
        CheckBox incorrectQ5_2 = findViewById(R.id.hardQ5op2);
        CheckBox incorrectQ5_3 = findViewById(R.id.hardQ5op3);

        validateCheckbox(correctQ5_1, correctQ5_4, incorrectQ5_2, incorrectQ5_3);
        if ((selectedOptions[0] == correctQ5_1 && selectedOptions[1] == correctQ5_4) ||
                (selectedOptions[0] == correctQ5_4 && selectedOptions[1] == correctQ5_1)) {
            totalScore++;
        }
    }

    public void checkBox6(View view) {
        CheckBox correctQ6_1 = findViewById(R.id.hardQ6op1);
        CheckBox correctQ6_3 = findViewById(R.id.hardQ6op3);
        CheckBox incorrectQ6_2 = findViewById(R.id.hardQ6op2);
        CheckBox incorrectQ6_4 = findViewById(R.id.hardQ6op4);

        validateCheckbox(correctQ6_1, correctQ6_3, incorrectQ6_2, incorrectQ6_4);
        if ((selectedOptions[0] == correctQ6_1 && selectedOptions[1] == correctQ6_3) ||
                (selectedOptions[0] == correctQ6_3 && selectedOptions[1] == correctQ6_1)) {
            totalScore++;
        }
    }

    public void checkBox7(View view) {
        CheckBox correctQ7_2 = findViewById(R.id.hardQ7op2);
        CheckBox correctQ7_3 = findViewById(R.id.hardQ7op3);
        CheckBox incorrectQ7_1 = findViewById(R.id.hardQ7op1);
        CheckBox incorrectQ7_4 = findViewById(R.id.hardQ7op4);

        validateCheckbox(correctQ7_2, correctQ7_3, incorrectQ7_1, incorrectQ7_4);
        if ((selectedOptions[0] == correctQ7_2 && selectedOptions[1] == correctQ7_3) ||
                (selectedOptions[0] == correctQ7_3 && selectedOptions[1] == correctQ7_2)) {
            totalScore++;
        }
    }

    public void checkBox8(View view) {
        CheckBox correctQ8_2 = findViewById(R.id.hardQ8op2);
        CheckBox correctQ8_4 = findViewById(R.id.hardQ8op4);
        CheckBox incorrectQ8_1 = findViewById(R.id.hardQ8op1);
        CheckBox incorrectQ8_3 = findViewById(R.id.hardQ8op3);

        validateCheckbox(correctQ8_2, correctQ8_4, incorrectQ8_1, incorrectQ8_3);
        if ((selectedOptions[0] == correctQ8_2 && selectedOptions[1] == correctQ8_4) ||
                (selectedOptions[0] == correctQ8_4 && selectedOptions[1] == correctQ8_2)) {
            totalScore++;
        }
    }

    /**
     * A helper method to provide grounds for methods Checkbox5-8 in making sure no more than 2 options are checked for each checkbox.
     *
     * @param checkBox1, checkBox2, checkBox3, checkBox4: options of each checkbox in each individual checkbox-based question.
     */

    public void validateCheckbox(CheckBox checkBox1, CheckBox checkBox2, CheckBox checkBox3, CheckBox checkBox4) {
        int checkCounter = 0;

        if (checkBox1.isChecked()) {
            checkCounter++;
            if (checkCounter > 2) {
                checkCounter--;
                Toast.makeText(this, getString(R.string.toastChooseMaxTwo), Toast.LENGTH_LONG).show();
                checkBox1.setChecked(false);
            } else if (checkCounter == 1) {
                selectedOptions[0] = checkBox1;
            } else if (checkCounter == 2) {
                selectedOptions[1] = checkBox1;
            }
        }
        if (checkBox2.isChecked()) {
            checkCounter++;
            if (checkCounter > 2) {
                checkCounter--;
                Toast.makeText(this, getString(R.string.toastChooseMaxTwo), Toast.LENGTH_LONG).show();
                checkBox2.setChecked(false);
            } else if (checkCounter == 1) {
                selectedOptions[0] = checkBox2;
            } else if (checkCounter == 2) {
                selectedOptions[1] = checkBox2;
            }
        }
        if (checkBox3.isChecked()) {
            checkCounter++;
            if (checkCounter > 2) {
                checkCounter--;
                Toast.makeText(this, getString(R.string.toastChooseMaxTwo), Toast.LENGTH_LONG).show();
                checkBox3.setChecked(false);
            } else if (checkCounter == 1) {
                selectedOptions[0] = checkBox3;
            } else if (checkCounter == 2) {
                selectedOptions[1] = checkBox3;
            }
        }
        if (checkBox4.isChecked()) {
            checkCounter++;
            if (checkCounter > 2) {
                checkCounter--;
                Toast.makeText(this, getString(R.string.toastChooseMaxTwo), Toast.LENGTH_LONG).show();
                checkBox4.setChecked(false);
            } else if (checkCounter == 1) {
                selectedOptions[0] = checkBox4;
            } else if (checkCounter == 2) {
                selectedOptions[1] = checkBox4;
            }
        }
    }
}


