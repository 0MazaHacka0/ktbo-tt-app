package com.atom.ktbo_tt.model.timetable;

public class Week {

    // Number of week
    private Integer mWeekNumber;

    // Days
    private Day[] mDays;

    public Week(Integer weekNumber, Day[] days) {
        mWeekNumber = weekNumber;
        mDays = days;
    }

}
