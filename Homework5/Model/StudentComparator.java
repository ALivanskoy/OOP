package Model;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return ((Integer) o1.getAttendancePercentage()).compareTo((Integer) o2.getAttendancePercentage());
    }

}
