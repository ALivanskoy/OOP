package Controller;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import Model.*;

public class Controller {

    AttendanceService attendanceService;

    public Controller(AttendanceService attendanceService) {
        this.attendanceService = attendanceService;
        calculatePercentage();
    }

    public void calculatePercentage() {

        Journal groupeJournal = attendanceService.getGroupeJournal();
        LinkedHashMap<Student, Journal> attendanceJournal = attendanceService.getAttendanceJournal();
        StudentGroupe studentGroupe = attendanceService.getStudentGroupe();

        for (Student student : studentGroupe) {
            student.setAttendancePercentage(attendanceJournal.get(student).size() / groupeJournal.size());
        }
    }

    public List<Student> groupeAttendanceSort() {

        Set<Student> sortedSet = new TreeSet<Student>(new StudentComparator());
        sortedSet.addAll(attendanceService.getStudentGroupe().getStudentGroupe());

        return new LinkedList<>(sortedSet);

    }

    public List<Student> sortBiggerThan(int percent) {

        List<Student> sortedList = new LinkedList<>();

        for (Student student : attendanceService.getStudentGroupe().getStudentGroupe()) {

            if (student.getAttendancePercentage() >= percent) {
                sortedList.add(student);
            }

        }
        return sortedList;

    }

}
