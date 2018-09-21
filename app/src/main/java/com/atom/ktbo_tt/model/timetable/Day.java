package com.atom.ktbo_tt.model.timetable;

import java.util.Date;

public class Day {

    // Date
    private Date mDate;

    // Lessons
    private Lesson[] mLessons;

    public Day(Date date, Lesson[] lessons) {
        mDate = date;
        mLessons = lessons;
    }

}
