package Model;

import java.util.Random;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Journal implements Iterable<Lesson> {

    private LinkedList<Lesson> lessons;

    public Journal() {
        this.lessons = new LinkedList<Lesson>();
    }

    public void fillJournalRand() {
        Random rand = new Random();

        for (int i = 1; i <= 10; i++) {

            switch (rand.nextInt(1, 7)) {
                case 1:
                    lessons.add(new Lesson(new GregorianCalendar(2022, Calendar.MARCH, i), "Физика"));
                    break;
                case 2:
                    lessons.add(new Lesson(new GregorianCalendar(2022, Calendar.MARCH, i), "Химия"));
                    break;
                case 3:
                    lessons.add(new Lesson(new GregorianCalendar(2022, Calendar.MARCH, i), "Биология"));
                    break;
                case 4:
                    lessons.add(new Lesson(new GregorianCalendar(2022, Calendar.MARCH, i), "История"));
                    break;
                case 5:
                    lessons.add(new Lesson(new GregorianCalendar(2022, Calendar.MARCH, i), "Математика"));
                    break;
                case 6:
                    lessons.add(new Lesson(new GregorianCalendar(2022, Calendar.MARCH, i), "География"));
                    break;

                default:
                    break;
            }

        }
    }

    public void add(Lesson lesson) {
        lessons.addLast(lesson);
    }

    public void remove(Lesson lesson) {
        lessons.removeLast();
    }

    public int size() {
        return lessons.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Lesson lesson : this.lessons) {
            sb.append(lesson.toString()).append("\n");
        }
        return sb.toString();
    }

    @Override
    public Iterator<Lesson> iterator() {
        return lessons.iterator();
    }

}
