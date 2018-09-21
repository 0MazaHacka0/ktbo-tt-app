package com.atom.ktbo_tt.ui.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.atom.ktbo_tt.Preferences;
import com.atom.ktbo_tt.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        tryToLoad();
    }

    private void tryToLoad() {

        // Check if TimeTable exists
        if (Preferences.getTimeTable() == null) {

            // TODO: Get timetable
            // TODO: Save timetable
        } else {

        }
    }
}
