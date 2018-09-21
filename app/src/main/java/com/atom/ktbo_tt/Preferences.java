package com.atom.ktbo_tt;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.atom.ktbo_tt.model.timetable.TimeTable;
import com.google.gson.Gson;

import java.io.Serializable;
import java.sql.Time;

/**
 * Class for working with settings
 */
public class Preferences {

    private static Context sContext;
    private static SharedPreferences sPreferences;

    /**
     * **************
     * KEYS CONSTANTS
     * **************
     */

    // TimeTable
    private static final String KEY_TIMETABLE = "timetable";

    /**
     * ****************
     * IN RAM variables
     * ****************
     */

    // TimeTable
    private static TimeTable sTimeTable;

    /**
     * *********************************************
     * Getters and setters for preferences variables
     * *********************************************
     */

    public static TimeTable getTimeTable() {
        Gson gson = new Gson();
        String json = getString(KEY_TIMETABLE, "");
        TimeTable timeTable = gson.fromJson(json, TimeTable.class);
        return timeTable;
    }

    public static void setTimeTable(TimeTable timeTable) {
        Gson gson = new Gson();
        String json = gson.toJson(timeTable);
        setString(KEY_TIMETABLE, json);
        sTimeTable = timeTable;
    }

    /**
     * ****************************************************
     * Getters and setters for work with Shared Preferences
     * ****************************************************
     */

    public static Context getContext() {
        return sContext;
    }

    public static void setContext(Context context) {
        sContext = context;
    }

    public static SharedPreferences getPrefs() {
        if (sPreferences == null)
            sPreferences = PreferenceManager.getDefaultSharedPreferences(sContext);
        return sPreferences;
    }

    private static void setString(String key, String value) {
        try {
            getPrefs().edit().putString(key, value).apply();
        } catch (Exception e) {
        }
    }

    private static String getString(String key, String defValue) {
        try {
            return getPrefs().getString(key, defValue);
        } catch (Exception e) {
            return defValue;
        }
    }

}
