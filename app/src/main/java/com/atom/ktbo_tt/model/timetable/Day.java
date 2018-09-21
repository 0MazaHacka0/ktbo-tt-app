package com.atom.ktbo_tt.model.timetable;

import java.util.Date;
import java.util.List;

public class Day {

    // Date
    private Date mDate;

    // Lessons
    private List<Lesson> mLessons;

    public Day(Date date, List<Lesson> lessons) {
        mDate = date;
        mLessons = lessons;
    }

}
