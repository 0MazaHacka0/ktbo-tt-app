package com.atom.ktbo_tt.model.timetable;

import com.atom.ktbo_tt.model.timetable.exceptions.ParseException;

public class Lesson {

    // Time
    private String mTime;

    // Teacher's name with lecture hall number
    private String mContent;

    public Lesson(String content, Integer lessonNumber) throws ParseException {
        mContent = content;
        mTime = getTimeByLessonCount(lessonNumber);
    }

    private String getTimeByLessonCount(Integer lessonNumber) throws ParseException {
        String time;
        switch (lessonNumber) {
            case 1:
                time = "08:00-09:35";
                break;
            case 2:
                time = "09:50-11:25";
                break;
            case 3:
                time = "11:55-13:30";
                break;
            case 4:
                time = "13:45-15:20";
                break;
            case 5:
                time = "15:50-17:25";
                break;
            case 6:
                time = "17:40-19:15";
                break;
            case 7:
                time = "19:30-21:05";
                break;
            default:
                throw new ParseException(ParseException.TIME_PARSER_ERROR);
        }

        return time;
    }

}
