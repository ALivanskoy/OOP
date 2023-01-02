
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Group implements Iterable {

    private List<Student> students;

    public Group(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Группа: " + students;
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

    public ListIterator<Student> listIterator() {
        return new GroupListIterator(this);
    }

    @Override
    public Iterator<Student> iterator() {
        return new ReverseIterator(this);
    }

}
