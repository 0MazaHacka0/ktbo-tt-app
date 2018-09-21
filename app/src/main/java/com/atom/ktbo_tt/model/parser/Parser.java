package com.atom.ktbo_tt.model.parser;

import com.atom.ktbo_tt.model.timetable.Day;
import com.atom.ktbo_tt.model.timetable.Lesson;
import com.atom.ktbo_tt.model.timetable.TimeTable;
import com.atom.ktbo_tt.model.timetable.Week;
import com.atom.ktbo_tt.model.timetable.exceptions.ParseException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;


public class Parser {

    // HTML
    private String mHtml;

    // Document
    private Document mDocument;

    // TimeTable
    private TimeTable mTimeTable;

    public Parser(String html) throws ParseException {
        mHtml = html;
        parse(html);
    }

    private TimeTable parse(String html) throws ParseException{

        // Get document
        mDocument = Jsoup.parse(html);

        // Get tables
        Elements tables = mDocument.select("table");
        List<Week> weeks = new ArrayList<>();

        for (Element table : tables) {

            Elements lines;

            // Find out lines for table
            lines = table.select("tr");
            List<Day> days = new ArrayList<>();

            // For every line get column
            for (int i = 2; i < lines.size(); ++i) {

                Elements columns = lines.get(i).select("td");
                List<Lesson> lessons = new ArrayList<>();

                // For every column, find out create object
                for (int j = 1; j < columns.size(); ++j) {
                    lessons.add(new Lesson(columns.get(j).text(), j));
                }

                days.add(new Day(null, lessons));
            }

            weeks.add(new Week(-1, days));
        }

        mTimeTable = new TimeTable(weeks);

        return mTimeTable;
    }

}
