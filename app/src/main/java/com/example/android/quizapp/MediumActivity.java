package com.example.android.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MediumActivity extends AppCompatActivity {

    // Declares total score and selected answers as global constants, initializes total score as variable.

    static final String TOTALSCORE = "totalScore";
    static final String MEDIUM_Q1_OP1 = "mediumQ1op1String";
    static final String MEDIUM_Q1_OP2 = "mediumQ1op2String";
    static final String MEDIUM_Q1_OP3 = "mediumQ1op3String";
    static final String MEDIUM_Q1_OP4 = "mediumQ1op4String";
    static final String MEDIUM_Q2_OP1 = "mediumQ2op1String";
    static final String MEDIUM_Q2_OP2 = "mediumQ2op2String";
    static final String MEDIUM_Q2_OP3 = "mediumQ2op3String";
    static final String MEDIUM_Q2_OP4 = "mediumQ2op4String";
    static final String MEDIUM_Q3_OP1 = "mediumQ3op1String";
    static final String MEDIUM_Q3_OP2 = "mediumQ3op2String";
    static final String MEDIUM_Q3_OP3 = "mediumQ3op3String";
    static final String MEDIUM_Q3_OP4 = "mediumQ3op4String";
    static final String MEDIUM_Q4_OP1 = "mediumQ4op1String";
    static final String MEDIUM_Q4_OP2 = "mediumQ4op2String";
    static final String MEDIUM_Q4_OP3 = "mediumQ4op3String";
    static final String MEDIUM_Q4_OP4 = "mediumQ4op4String";
    static final String MEDIUM_Q5_OP1 = "mediumQ5op1String";
    static final String MEDIUM_Q5_OP2 = "mediumQ5op2String";
    static final String MEDIUM_Q5_OP3 = "mediumQ5op3String";
    static final String MEDIUM_Q5_OP4 = "mediumQ5op4String";
    static final String MEDIUM_Q6_OP1 = "mediumQ6op1String";
    static final String MEDIUM_Q6_OP2 = "mediumQ6op2String";
    static final String MEDIUM_Q6_OP3 = "mediumQ6op3String";
    static final String MEDIUM_Q6_OP4 = "mediumQ6op4String";
    static final String MEDIUM_Q7_OP1 = "mediumQ7op1String";
    static final String MEDIUM_Q7_OP2 = "mediumQ7op2String";
    static final String MEDIUM_Q7_OP3 = "mediumQ7op3String";
    static final String MEDIUM_Q7_OP4 = "mediumQ7op4String";
    static final String MEDIUM_Q8_OP1 = "mediumQ8op1String";
    static final String MEDIUM_Q8_OP2 = "mediumQ8op2String";
    static final String MEDIUM_Q8_OP3 = "mediumQ8op3String";
    static final String MEDIUM_Q8_OP4 = "mediumQ8op4String";
    static final String MEDIUM_Q9_OP1 = "mediumQ9op1String";
    static final String MEDIUM_Q9_OP2 = "mediumQ9op2String";
    static final String MEDIUM_Q9_OP3 = "mediumQ9op3String";
    static final String MEDIUM_Q9_OP4 = "mediumQ9op4String";
    static final String MEDIUM_Q10_OP1 = "mediumQ10op1String";
    static final String MEDIUM_Q10_OP2 = "mediumQ10op2String";
    static final String MEDIUM_Q10_OP3 = "mediumQ10op3String";
    static final String MEDIUM_Q10_OP4 = "mediumQ10op4String";
    double totalScore;


    // Pulls out the value of the total score and the selected answers.

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        // Saves user's current scores.

        RadioButton mediumQ1op1 = (RadioButton) findViewById(R.id.mediumQ1op1);
        String mediumQ1op1String = mediumQ1op1.getText().toString();
        RadioButton mediumQ1op2 = (RadioButton) findViewById(R.id.mediumQ1op2);
        String mediumQ1op2String = mediumQ1op2.getText().toString();
        RadioButton mediumQ1op3 = (RadioButton) findViewById(R.id.mediumQ1op3);
        String mediumQ1op3String = mediumQ1op3.getText().toString();
        RadioButton mediumQ1op4 = (RadioButton) findViewById(R.id.mediumQ1op4);
        String mediumQ1op4String = mediumQ1op4.getText().toString();
        RadioButton mediumQ2op1 = (RadioButton) findViewById(R.id.mediumQ2op1);
        String mediumQ2op1String = mediumQ2op1.getText().toString();
        RadioButton mediumQ2op2 = (RadioButton) findViewById(R.id.mediumQ2op2);
        String mediumQ2op2String = mediumQ2op2.getText().toString();
        RadioButton mediumQ2op3 = (RadioButton) findViewById(R.id.mediumQ2op3);
        String mediumQ2op3String = mediumQ2op3.getText().toString();
        RadioButton mediumQ2op4 = (RadioButton) findViewById(R.id.mediumQ2op4);
        String mediumQ2op4String = mediumQ2op4.getText().toString();
        RadioButton mediumQ3op1 = (RadioButton) findViewById(R.id.mediumQ3op1);
        String mediumQ3op1String = mediumQ3op1.getText().toString();
        RadioButton mediumQ3op2 = (RadioButton) findViewById(R.id.mediumQ3op2);
        String mediumQ3op2String = mediumQ3op2.getText().toString();
        RadioButton mediumQ3op3 = (RadioButton) findViewById(R.id.mediumQ3op3);
        String mediumQ3op3String = mediumQ3op3.getText().toString();
        RadioButton mediumQ3op4 = (RadioButton) findViewById(R.id.mediumQ3op4);
        String mediumQ3op4String = mediumQ3op4.getText().toString();
        RadioButton mediumQ4op1 = (RadioButton) findViewById(R.id.mediumQ4op1);
        String mediumQ4op1String = mediumQ4op1.getText().toString();
        RadioButton mediumQ4op2 = (RadioButton) findViewById(R.id.mediumQ4op2);
        String mediumQ4op2String = mediumQ4op2.getText().toString();
        RadioButton mediumQ4op3 = (RadioButton) findViewById(R.id.mediumQ4op3);
        String mediumQ4op3String = mediumQ4op3.getText().toString();
        RadioButton mediumQ4op4 = (RadioButton) findViewById(R.id.mediumQ4op4);
        String mediumQ4op4String = mediumQ4op4.getText().toString();
        RadioButton mediumQ5op1 = (RadioButton) findViewById(R.id.mediumQ5op1);
        String mediumQ5op1String = mediumQ5op1.getText().toString();
        RadioButton mediumQ5op2 = (RadioButton) findViewById(R.id.mediumQ5op2);
        String mediumQ5op2String = mediumQ5op2.getText().toString();
        RadioButton mediumQ5op3 = (RadioButton) findViewById(R.id.mediumQ5op3);
        String mediumQ5op3String = mediumQ5op3.getText().toString();
        RadioButton mediumQ5op4 = (RadioButton) findViewById(R.id.mediumQ5op4);
        String mediumQ5op4String = mediumQ5op4.getText().toString();

        CheckBox mediumQ6op1 = (CheckBox) findViewById(R.id.mediumQ6op1);
        String mediumQ6op1String = mediumQ6op1.getText().toString();
        CheckBox mediumQ6op2 = (CheckBox) findViewById(R.id.mediumQ6op2);
        String mediumQ6op2String = mediumQ6op2.getText().toString();
        CheckBox mediumQ6op3 = (CheckBox) findViewById(R.id.mediumQ6op3);
        String mediumQ6op3String = mediumQ6op3.getText().toString();
        CheckBox mediumQ6op4 = (CheckBox) findViewById(R.id.mediumQ6op4);
        String mediumQ6op4String = mediumQ6op4.getText().toString();
        CheckBox mediumQ7op1 = (CheckBox) findViewById(R.id.mediumQ7op1);
        String mediumQ7op1String = mediumQ7op1.getText().toString();
        CheckBox mediumQ7op2 = (CheckBox) findViewById(R.id.mediumQ7op2);
        String mediumQ7op2String = mediumQ7op2.getText().toString();
        CheckBox mediumQ7op3 = (CheckBox) findViewById(R.id.mediumQ7op3);
        String mediumQ7op3String = mediumQ7op3.getText().toString();
        CheckBox mediumQ7op4 = (CheckBox) findViewById(R.id.mediumQ7op4);
        String mediumQ7op4String = mediumQ7op4.getText().toString();
        CheckBox mediumQ8op1 = (CheckBox) findViewById(R.id.mediumQ8op1);
        String mediumQ8op1String = mediumQ8op1.getText().toString();
        CheckBox mediumQ8op2 = (CheckBox) findViewById(R.id.mediumQ8op2);
        String mediumQ8op2String = mediumQ8op2.getText().toString();
        CheckBox mediumQ8op3 = (CheckBox) findViewById(R.id.mediumQ8op3);
        String mediumQ8op3String = mediumQ8op3.getText().toString();
        CheckBox mediumQ8op4 = (CheckBox) findViewById(R.id.mediumQ8op4);
        String mediumQ8op4String = mediumQ8op4.getText().toString();
        CheckBox mediumQ9op1 = (CheckBox) findViewById(R.id.mediumQ9op1);
        String mediumQ9op1String = mediumQ9op1.getText().toString();
        CheckBox mediumQ9op2 = (CheckBox) findViewById(R.id.mediumQ9op2);
        String mediumQ9op2String = mediumQ9op2.getText().toString();
        CheckBox mediumQ9op3 = (CheckBox) findViewById(R.id.mediumQ9op3);
        String mediumQ9op3String = mediumQ9op3.getText().toString();
        CheckBox mediumQ9op4 = (CheckBox) findViewById(R.id.mediumQ9op4);
        String mediumQ9op4String = mediumQ9op4.getText().toString();
        CheckBox mediumQ10op1 = (CheckBox) findViewById(R.id.mediumQ10op1);
        String mediumQ10op1String = mediumQ10op1.getText().toString();
        CheckBox mediumQ10op2 = (CheckBox) findViewById(R.id.mediumQ10op2);
        String mediumQ10op2String = mediumQ10op2.getText().toString();
        CheckBox mediumQ10op3 = (CheckBox) findViewById(R.id.mediumQ10op3);
        String mediumQ10op3String = mediumQ10op3.getText().toString();
        CheckBox mediumQ10op4 = (CheckBox) findViewById(R.id.mediumQ10op4);
        String mediumQ10op4String = mediumQ10op4.getText().toString();

        savedInstanceState.putDouble(TOTALSCORE, totalScore);

        savedInstanceState.putString(MEDIUM_Q1_OP1, mediumQ1op1String);
        savedInstanceState.putString(MEDIUM_Q1_OP2, mediumQ1op2String);
        savedInstanceState.putString(MEDIUM_Q1_OP3, mediumQ1op3String);
        savedInstanceState.putString(MEDIUM_Q1_OP4, mediumQ1op4String);
        savedInstanceState.putString(MEDIUM_Q2_OP1, mediumQ2op1String);
        savedInstanceState.putString(MEDIUM_Q2_OP2, mediumQ2op2String);
        savedInstanceState.putString(MEDIUM_Q2_OP3, mediumQ2op3String);
        savedInstanceState.putString(MEDIUM_Q2_OP4, mediumQ2op4String);
        savedInstanceState.putString(MEDIUM_Q3_OP1, mediumQ3op1String);
        savedInstanceState.putString(MEDIUM_Q3_OP2, mediumQ3op2String);
        savedInstanceState.putString(MEDIUM_Q3_OP3, mediumQ3op3String);
        savedInstanceState.putString(MEDIUM_Q3_OP4, mediumQ3op4String);
        savedInstanceState.putString(MEDIUM_Q4_OP1, mediumQ4op1String);
        savedInstanceState.putString(MEDIUM_Q4_OP2, mediumQ4op2String);
        savedInstanceState.putString(MEDIUM_Q4_OP3, mediumQ4op3String);
        savedInstanceState.putString(MEDIUM_Q4_OP4, mediumQ4op4String);
        savedInstanceState.putString(MEDIUM_Q5_OP1, mediumQ5op1String);
        savedInstanceState.putString(MEDIUM_Q5_OP2, mediumQ5op2String);
        savedInstanceState.putString(MEDIUM_Q5_OP3, mediumQ5op3String);
        savedInstanceState.putString(MEDIUM_Q5_OP4, mediumQ5op4String);
        savedInstanceState.putString(MEDIUM_Q6_OP1, mediumQ6op1String);
        savedInstanceState.putString(MEDIUM_Q6_OP2, mediumQ6op2String);
        savedInstanceState.putString(MEDIUM_Q6_OP3, mediumQ6op3String);
        savedInstanceState.putString(MEDIUM_Q6_OP4, mediumQ6op4String);
        savedInstanceState.putString(MEDIUM_Q7_OP1, mediumQ7op1String);
        savedInstanceState.putString(MEDIUM_Q7_OP2, mediumQ7op2String);
        savedInstanceState.putString(MEDIUM_Q7_OP3, mediumQ7op3String);
        savedInstanceState.putString(MEDIUM_Q7_OP4, mediumQ7op4String);
        savedInstanceState.putString(MEDIUM_Q8_OP1, mediumQ8op1String);
        savedInstanceState.putString(MEDIUM_Q8_OP2, mediumQ8op2String);
        savedInstanceState.putString(MEDIUM_Q8_OP3, mediumQ8op3String);
        savedInstanceState.putString(MEDIUM_Q8_OP4, mediumQ8op4String);
        savedInstanceState.putString(MEDIUM_Q9_OP1, mediumQ9op1String);
        savedInstanceState.putString(MEDIUM_Q9_OP2, mediumQ9op2String);
        savedInstanceState.putString(MEDIUM_Q9_OP3, mediumQ9op3String);
        savedInstanceState.putString(MEDIUM_Q9_OP4, mediumQ9op4String);
        savedInstanceState.putString(MEDIUM_Q10_OP1, mediumQ10op1String);
        savedInstanceState.putString(MEDIUM_Q10_OP2, mediumQ10op2String);
        savedInstanceState.putString(MEDIUM_Q10_OP3, mediumQ10op3String);
        savedInstanceState.putString(MEDIUM_Q10_OP4, mediumQ10op4String);

        // Calls on the superclass to save the view hierarchy state.
        super.onSaveInstanceState(savedInstanceState);
    }

    // Continues or starts activity after checking if there is a previous saved activity to reload or not.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (savedInstanceState != null) {
            setContentView(R.layout.activity_medium);
            totalScore = savedInstanceState.getInt(TOTALSCORE);
        } else
            setContentView(R.layout.activity_medium);
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
        RadioButton correctQ1 = findViewById(R.id.mediumQ1op4);
        if (correctQ1.isChecked()) {
            totalScore++;
        }
        RadioButton correctQ2 = findViewById(R.id.mediumQ2op3);
        if (correctQ2.isChecked()) {
            totalScore++;
        }
        RadioButton correctQ3 = findViewById(R.id.mediumQ3op3);
        if (correctQ3.isChecked()) {
            totalScore++;
        }
        RadioButton correctQ4 = findViewById(R.id.mediumQ4op1);
        if (correctQ4.isChecked()) {
            totalScore++;
        }
        RadioButton correctQ5 = findViewById(R.id.mediumQ5op2);
        if (correctQ5.isChecked()) {
            totalScore++;
        }

        // Calls on five methods below which score Question 6-10 (all CheckBox-based) and make sure no more than 2 answers are checked.

        checkBox6(v);
        checkBox7(v);
        checkBox8(v);
        checkBox9(v);
        checkBox10(v);

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
        String toastMedium1 = getString(R.string.toastMedium1);
        String toastMedium2 = getString(R.string.toastMedium2);
        String toastMedium3 = getString(R.string.toastMedium3);
        String toastMedium4 = getString(R.string.toastMedium4);
        if (totalScore < 4) {
            Toast.makeText(getApplicationContext(), toastMedium1, Toast.LENGTH_LONG).show();
        } else if (totalScore >= 3 && totalScore <= 6) {
            Toast.makeText(getApplicationContext(), toastMedium2, Toast.LENGTH_LONG).show();
        } else if (totalScore > 6 && totalScore < 9) {
            Toast.makeText(getApplicationContext(), toastMedium3, Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(getApplicationContext(), toastMedium4, Toast.LENGTH_LONG).show();
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


    //Displays a warning toast message when user tries to tick more than two CheckBoxes.//

    private void toastWarning() {
        String toastChooseMaxTwo = getString(R.string.toastChooseMaxTwo);
        Toast.makeText(getApplicationContext(), toastChooseMaxTwo, Toast.LENGTH_LONG).show();
    }

    /**
     * Methods checkbox6-10 score Questions 6-10 (all CheckBox-based with 4 answer choices), and make sure no more than 2 answers
     * are checked per question.
     */

    public void checkBox6(View view) {
        String toastChooseMaxTwo = getString(R.string.toastChooseMaxTwo);
        CheckBox correctQ6_1 = findViewById(R.id.mediumQ6op1);
        CheckBox correctQ6_4 = findViewById(R.id.mediumQ6op4);
        CheckBox incorrectQ6_2 = findViewById(R.id.mediumQ6op2);
        CheckBox incorrectQ6_3 = findViewById(R.id.mediumQ6op3);
        int checkCounter = 0;

        if (correctQ6_1.isChecked()) {
            checkCounter++;
            totalScore += 0.5;
            if (checkCounter > 2) {
                correctQ6_1.setChecked(false);
                checkCounter--;
                totalScore -= 0.5;
                Toast.makeText(getApplicationContext(), toastChooseMaxTwo, Toast.LENGTH_LONG).show();
            }
        }

        if (correctQ6_4.isChecked()) {
            checkCounter++;
            totalScore += 0.5;
            if (checkCounter > 2) {
                correctQ6_4.setChecked(false);
                checkCounter--;
                totalScore -= 0.5;
                Toast.makeText(getApplicationContext(), toastChooseMaxTwo, Toast.LENGTH_LONG).show();
            }
        }

        if (incorrectQ6_2.isChecked()) {
            checkCounter++;
            if (checkCounter > 2) {
                incorrectQ6_2.setChecked(false);
                checkCounter--;
                Toast.makeText(getApplicationContext(), toastChooseMaxTwo, Toast.LENGTH_LONG).show();
            } else {
                totalScore = totalScore;
            }
        }

        if (incorrectQ6_3.isChecked()) {
            checkCounter++;
            if (checkCounter > 2) {
                incorrectQ6_3.setChecked(false);
                checkCounter--;
                Toast.makeText(getApplicationContext(), toastChooseMaxTwo, Toast.LENGTH_LONG).show();
            } else {
                totalScore = totalScore;
            }
        }
    }

    public void checkBox7(View view) {
        String toastChooseMaxTwo = getString(R.string.toastChooseMaxTwo);
        CheckBox correctQ7_2 = findViewById(R.id.mediumQ7op2);
        CheckBox correctQ7_4 = findViewById(R.id.mediumQ7op4);
        CheckBox incorrectQ7_1 = findViewById(R.id.mediumQ7op1);
        CheckBox incorrectQ7_3 = findViewById(R.id.mediumQ7op3);
        int checkCounter = 0;

        if (correctQ7_2.isChecked()) {
            checkCounter++;
            totalScore += 0.5;
            if (checkCounter > 2) {
                correctQ7_2.setChecked(false);
                checkCounter--;
                totalScore -= 0.5;
                Toast.makeText(getApplicationContext(), toastChooseMaxTwo, Toast.LENGTH_LONG).show();
            }
        }

        if (correctQ7_4.isChecked()) {
            checkCounter++;
            totalScore += 0.5;
            if (checkCounter > 2) {
                correctQ7_4.setChecked(false);
                checkCounter--;
                totalScore -= 0.5;
                Toast.makeText(getApplicationContext(), toastChooseMaxTwo, Toast.LENGTH_LONG).show();
            }
        }

        if (incorrectQ7_1.isChecked()) {
            checkCounter++;
            if (checkCounter > 2) {
                incorrectQ7_1.setChecked(false);
                checkCounter--;
                Toast.makeText(getApplicationContext(), toastChooseMaxTwo, Toast.LENGTH_LONG).show();
            } else {
                totalScore = totalScore;
            }
        }

        if (incorrectQ7_3.isChecked()) {
            checkCounter++;
            if (checkCounter > 2) {
                incorrectQ7_3.setChecked(false);
                checkCounter--;
                Toast.makeText(getApplicationContext(), toastChooseMaxTwo, Toast.LENGTH_LONG).show();
            } else {
                totalScore = totalScore;
            }
        }
    }

    public void checkBox8(View view) {
        String toastChooseMaxTwo = getString(R.string.toastChooseMaxTwo);
        CheckBox correctQ8_1 = findViewById(R.id.mediumQ8op1);
        CheckBox correctQ8_3 = findViewById(R.id.mediumQ8op3);
        CheckBox incorrectQ8_2 = findViewById(R.id.mediumQ8op2);
        CheckBox incorrectQ8_4 = findViewById(R.id.mediumQ8op4);
        int checkCounter = 0;

        if (correctQ8_1.isChecked()) {
            checkCounter++;
            totalScore += 0.5;
            if (checkCounter > 2) {
                correctQ8_1.setChecked(false);
                checkCounter--;
                totalScore -= 0.5;
                Toast.makeText(getApplicationContext(), toastChooseMaxTwo, Toast.LENGTH_LONG).show();
            }
        }

        if (correctQ8_3.isChecked()) {
            checkCounter++;
            totalScore += 0.5;
            if (checkCounter > 2) {
                correctQ8_3.setChecked(false);
                checkCounter--;
                totalScore -= 0.5;
                Toast.makeText(getApplicationContext(), toastChooseMaxTwo, Toast.LENGTH_LONG).show();
            }
        }

        if (incorrectQ8_2.isChecked()) {
            checkCounter++;
            if (checkCounter > 2) {
                incorrectQ8_2.setChecked(false);
                checkCounter--;
                Toast.makeText(getApplicationContext(), toastChooseMaxTwo, Toast.LENGTH_LONG).show();
            } else {
                totalScore = totalScore;
            }
        }

        if (incorrectQ8_4.isChecked()) {
            checkCounter++;
            if (checkCounter > 2) {
                incorrectQ8_4.setChecked(false);
                checkCounter--;
                Toast.makeText(getApplicationContext(), toastChooseMaxTwo, Toast.LENGTH_LONG).show();
            } else {
                totalScore = totalScore;
            }
        }
    }

    public void checkBox9(View view) {
        String toastChooseMaxTwo = getString(R.string.toastChooseMaxTwo);
        CheckBox correctQ9_1 = findViewById(R.id.mediumQ9op1);
        CheckBox correctQ9_2 = findViewById(R.id.mediumQ9op2);
        CheckBox incorrectQ9_3 = findViewById(R.id.mediumQ9op3);
        CheckBox incorrectQ9_4 = findViewById(R.id.mediumQ9op4);
        int checkCounter = 0;

        if (correctQ9_1.isChecked()) {
            checkCounter++;
            totalScore += 0.5;
            if (checkCounter > 2) {
                correctQ9_1.setChecked(false);
                checkCounter--;
                totalScore -= 0.5;
                Toast.makeText(getApplicationContext(), toastChooseMaxTwo, Toast.LENGTH_LONG).show();
            }
        }

        if (correctQ9_2.isChecked()) {
            checkCounter++;
            totalScore += 0.5;
            if (checkCounter > 2) {
                correctQ9_2.setChecked(false);
                checkCounter--;
                totalScore -= 0.5;
                Toast.makeText(getApplicationContext(), toastChooseMaxTwo, Toast.LENGTH_LONG).show();
            }
        }

        if (incorrectQ9_3.isChecked()) {
            checkCounter++;
            if (checkCounter > 2) {
                incorrectQ9_3.setChecked(false);
                checkCounter--;
                Toast.makeText(getApplicationContext(), toastChooseMaxTwo, Toast.LENGTH_LONG).show();
            } else {
                totalScore = totalScore;
            }
        }

        if (incorrectQ9_4.isChecked()) {
            checkCounter++;
            if (checkCounter > 2) {
                incorrectQ9_4.setChecked(false);
                checkCounter--;
                Toast.makeText(getApplicationContext(), toastChooseMaxTwo, Toast.LENGTH_LONG).show();
            } else {
                totalScore = totalScore;
            }
        }
    }

    public void checkBox10(View view) {
        String toastChooseMaxTwo = getString(R.string.toastChooseMaxTwo);
        CheckBox correctQ10_2 = findViewById(R.id.mediumQ10op2);
        CheckBox correctQ10_3 = findViewById(R.id.mediumQ10op3);
        CheckBox incorrectQ10_1 = findViewById(R.id.mediumQ10op1);
        CheckBox incorrectQ10_4 = findViewById(R.id.mediumQ10op4);
        int checkCounter = 0;

        if (correctQ10_2.isChecked()) {
            checkCounter++;
            totalScore += 0.5;
            if (checkCounter > 2) {
                correctQ10_2.setChecked(false);
                checkCounter--;
                totalScore -= 0.5;
                Toast.makeText(getApplicationContext(), toastChooseMaxTwo, Toast.LENGTH_LONG).show();
            }
        }

        if (correctQ10_3.isChecked()) {
            checkCounter++;
            totalScore += 0.5;
            if (checkCounter > 2) {
                correctQ10_3.setChecked(false);
                checkCounter--;
                totalScore -= 0.5;
                Toast.makeText(getApplicationContext(), toastChooseMaxTwo, Toast.LENGTH_LONG).show();
            }
        }

        if (incorrectQ10_1.isChecked()) {
            checkCounter++;
            if (checkCounter > 2) {
                incorrectQ10_1.setChecked(false);
                checkCounter--;
                Toast.makeText(getApplicationContext(), toastChooseMaxTwo, Toast.LENGTH_LONG).show();
            } else {
                totalScore = totalScore;
            }
        }

        if (incorrectQ10_4.isChecked()) {
            checkCounter++;
            if (checkCounter > 2) {
                incorrectQ10_4.setChecked(false);
                checkCounter--;
                Toast.makeText(getApplicationContext(), toastChooseMaxTwo, Toast.LENGTH_LONG).show();
            } else {
                totalScore = totalScore;
            }
        }
    }
}


