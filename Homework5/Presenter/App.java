package Presenter;


import Model.AttendanceService;
import Model.Journal;

import Model.StudentGroupe;
import Viev.AttendanceView;

public class App {

    public static void main(String[] args) {

        Journal journal = new Journal();
        journal.fillJournalRand();

        AttendanceService attendanceService = new AttendanceService(new StudentGroupe(), journal);
  
        AttendanceView attendanceView = new AttendanceView(attendanceService);

        System.out.println(attendanceView);
    }
}
