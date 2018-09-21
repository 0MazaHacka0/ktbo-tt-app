package com.atom.ktbo_tt.model.timetable.exceptions;

public class ParseException extends Exception {

    // KEYS
    public static final String TIME_PARSER_ERROR = "There is an error while parsing number of lesson";

    public ParseException(String errorMessage) {
        super(errorMessage);
    }

}
