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
            sb.append("Студент ").append(note.getKey()).append("посетил следующие уроки:\n")
                    .append(note.getValue().toString())
                    .append("\n");

        }
        System.out.println(sb.toString());
    }

    public void printAttendancePercentage(AttendanceService attendanceService) {

        for (Student student : attendanceService.getStudentGroupe()) {

            System.out.printf("Студент %s\t Посещаемость:%d %\n", student, student.getAttendancePercentage());

        }

    }

    public void printBiggestAttendance(List<Student> students) {

        System.out.println("Сортировка в порядке посещаемости: " + students);

    }

    public void printAttendanceMoreThat(List<Student> students, int percent) {

        System.out.printf("Студенты с посещаемостью больше %d: %s", percent, students.toString());

    }

}
