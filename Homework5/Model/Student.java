
package Model;

public class Student {

    protected String firstName;
    protected String secondName;
    private int attendancePercentage;

    public Student(String firstName, String secondName) {

        this.firstName = firstName;
        this.secondName = secondName;
        this.attendancePercentage = 0;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getAttendancePercentage() {
        return attendancePercentage;
    }

    public void setAttendancePercentage(int attendancePercentage) {
        this.attendancePercentage = attendancePercentage;
    }

    public String fullName() {
        return String.format("%s %s", firstName, secondName);
    }

    @Override
    public String toString() {
        return String.format("%s", fullName());
    }

}