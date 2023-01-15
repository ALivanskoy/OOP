package Controller;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import Model.*;

public class Controller {

    public void calculatePercentage(AttendanceService attendanceService) {

        Journal groupeJournal = attendanceService.getGroupeJournal();
        LinkedHashMap<Student, Journal> attendanceJournal = attendanceService.getAttendanceJournal();
        StudentGroupe studentGroupe = attendanceService.getStudentGroupe();

        for (Student student : studentGroupe) {
            int percent = (int) (((double) attendanceJournal.get(student).size() / (double) (groupeJournal.size()))
                    * 100);
            student.setAttendancePercentage(percent);
        }
    }

    public List<Student> groupeAttendanceSort(AttendanceService attendanceService) {

        Set<Student> sortedSet = new TreeSet<Student>(new StudentComparator());
        sortedSet.addAll(attendanceService.getStudentGroupe().getStudentGroupe());

        return new LinkedList<>(sortedSet);

    }

    public List<Student> sortBiggerThan(AttendanceService attendanceService, int percent) {

        List<Student> sortedList = new LinkedList<>();

        for (Student student : attendanceService.getStudentGroupe().getStudentGroupe()) {

            if (student.getAttendancePercentage() >= percent) {
                sortedList.add(student);
            }

        }
        return sortedList;

    }

}
