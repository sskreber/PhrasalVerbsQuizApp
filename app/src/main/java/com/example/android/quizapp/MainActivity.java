package com.example.android.quizapp;

import android.content.Intent;
import android.view.View;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Declares global constants and variables.

    static final String NAME = "name";
    static final String DIFFICULTY_CHOSEN = "modeChosen";
    String name;
    int modeChosen;
    RadioButton modeHard;
    RadioButton modeMedium;
    RadioButton modeEasy;

    /**
     * Pulls out the value of the entered user name and the chosen difficulty level,
     * saves their values.
     */

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        // Saves user's name and the chosen difficulty level.
        savedInstanceState.putString(NAME, name);
        savedInstanceState.putInt(DIFFICULTY_CHOSEN, modeChosen);

        // Calls on the superclass to save the view hierarchy state.
        super.onSaveInstanceState(savedInstanceState);
    }

    // Continues or starts activity after checking if there is a saved previous activity to reload or not.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (savedInstanceState != null) {
            setContentView(R.layout.activity_main);
            name = savedInstanceState.getString(NAME);
            modeChosen = savedInstanceState.getInt(DIFFICULTY_CHOSEN);
        } else
            setContentView(R.layout.activity_main);
    }

    // Gets the value of the entered user name and the chosen difficulty level instead of the default value.

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        name = savedInstanceState.getString(NAME);
        modeChosen = savedInstanceState.getInt(DIFFICULTY_CHOSEN);
    }

    public void displayName(View v) {
        TextView name = (TextView) findViewById(R.id.name_box);
        name.setText(String.valueOf(name));
    }

    // If user clicks on the Start Quiz button, the app loads the activity belonging to the chosen difficulty level.

    public void startQuiz(View v) {
        modeEasy = findViewById(R.id.difficultyEasyButton);
        modeMedium = findViewById(R.id.difficultyMediumButton);
        modeHard = findViewById(R.id.difficultyHardButton);
        EditText nameField = (EditText) findViewById(R.id.name_box);
        String name = nameField.getText().toString();

        if (modeEasy.isChecked()) {
            modeChosen = 1;
            Intent easyIntent = new Intent(MainActivity.this, EasyActivity.class);
            // Start the new activity
            easyIntent.putExtra("name", name);
            startActivity(easyIntent);
        }
        if (modeMedium.isChecked()) {
            modeChosen = 2;
            Intent mediumIntent = new Intent(MainActivity.this, MediumActivity.class);
            // Start the new activity
            mediumIntent.putExtra("name", name);
            startActivity(mediumIntent);
        }
        if (modeHard.isChecked()) {
            modeChosen = 3;
            Intent hardIntent = new Intent(MainActivity.this, HardActivity.class);
            // Start the new activity
            hardIntent.putExtra("name", name);
            startActivity(hardIntent);
        }
    }
}

