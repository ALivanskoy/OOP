import java.util.List;

public class Group {

    private List<Student> students;

    public Group(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Group students = " + students;
    }

    public int size() {
        return students.size();
    }

    public Student get(int index) {
        return students.get(index);

    }

    public void remove(int index) {
        students.remove(students.get(index));
    }

    public void add(int index, Student e) {
        students.add(index, e);

    }

}