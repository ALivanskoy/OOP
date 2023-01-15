package Presenter;

import Controller.Controller;
import Model.AttendanceService;
import Model.Journal;

import Model.StudentGroupe;
import Viev.AttendanceView;

public class App {

    public static void main(String[] args) {

        Journal journal = new Journal();
        journal.fillJournalRand();

        AttendanceService attendanceService = new AttendanceService(new StudentGroupe(), journal);

        AttendanceView attendanceView = new AttendanceView();
        Controller controller = new Controller();

        controller.calculatePercentage(attendanceService);

        System.out.println("--------------------------------------------------------");
        attendanceView.printAttendance(attendanceService);
        System.out.println("--------------------------------------------------------");
        attendanceView.printAttendancePercentage(attendanceService);
        System.out.println("--------------------------------------------------------");
        attendanceView.printBiggestAttendance(controller.groupeAttendanceSort(attendanceService));
        System.out.println("--------------------------------------------------------");
        attendanceView.printAttendanceMoreThat(controller.sortBiggerThan(attendanceService, 60), 60);
        System.out.println("--------------------------------------------------------");

    }
}
