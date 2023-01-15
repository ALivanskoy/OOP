package Model;

import java.util.Calendar;

public class Lesson {

    private Calendar date;
    private String lesson;

    public Lesson(Calendar date, String lesson) {
        this.date = date;
        this.lesson = lesson;
    }

    public Calendar getDate() {
        return date;
    }

    public String getLesson() {
        return lesson;
    }

    @Override
    public String toString() {
        return "Дата: " + date.get(Calendar.DAY_OF_MONTH) + "." + (date.get(Calendar.MONTH) + 1)
                + "." + date.get(Calendar.YEAR) + "\tУрок: " + lesson;
    }

}
