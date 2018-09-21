package com.atom.ktbo_tt.model.timetable;

import java.util.List;

public class Week {

    // Number of week
    private Integer mWeekNumber;

    // Days
    private List<Day> mDays;

    public Week(Integer weekNumber, List<Day> days) {
        mWeekNumber = weekNumber;
        mDays = days;
    }

}
