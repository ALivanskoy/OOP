package Model;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.Map.Entry;

public class AttendanceService implements Iterable<Entry<Student, Journal>> {

    private StudentGroupe studentGroupe;
    private Journal groupeJournal;
    private LinkedHashMap<Student, Journal> attendanceJournal;

    public AttendanceService(StudentGroupe studentGroupe, Journal groupeJournal) {
        this.studentGroupe = studentGroupe;
        this.groupeJournal = groupeJournal;
        this.attendanceJournal = new LinkedHashMap<>();
        fillAttendanceJournal();
        makeTheyLearn();
    }

    private void fillAttendanceJournal() {

        for (Student student : studentGroupe) {

            attendanceJournal.put(student, new Journal());
        }

    }

    private void makeTheyLearn() {

        Random rnd = new Random();

        for (Map.Entry<Student, Journal> note : attendanceJournal.entrySet()) {

            for (Lesson lesson : groupeJournal) {

                if (rnd.nextInt(2) == 1) {
                    note.getValue().add(lesson);
                }

            }
        }

    }

    public StudentGroupe getStudentGroupe() {
        return studentGroupe;
    }

    public Journal getGroupeJournal() {
        return groupeJournal;
    }

    public LinkedHashMap<Student, Journal> getAttendanceJournal() {
        return attendanceJournal;
    }

    @Override
    public Iterator<Entry<Student, Journal>> iterator() {

        return attendanceJournal.entrySet().iterator();
    }

}
