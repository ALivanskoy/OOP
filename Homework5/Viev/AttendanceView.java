package Viev;

import java.util.List;
import java.util.Map;

import Model.AttendanceService;
import Model.Journal;
import Model.Student;

public class AttendanceView {

    public void printAttendance(AttendanceService attendanceService) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Student, Journal> note : attendanceService.getAttendanceJournal().entrySet()) {
            sb.append("Студент ").append(note.getKey()).append(" посетил следующие уроки:\n")
                    .append(note.getValue().toString())
                    .append("\n");

        }
        System.out.println(sb.toString());
    }

    public void printAttendancePercentage(AttendanceService attendanceService) {

        System.out.println("Посещаемость:");

        for (Student student : attendanceService.getStudentGroupe()) {

            System.out.println(student.toString() + " : " +
                    student.getAttendancePercentage() + "%");

        }

    }

    public void printBiggestAttendance(List<Student> students) {

        System.out.println("Студенты, отсортированные в порядке наименьшей посещаемости: " + students);

    }

    public void printAttendanceMoreThat(List<Student> students, int percent) {

        System.out.println("Студенты с посещаемостью больше "+percent+"% : "+students.toString());

    }

}
