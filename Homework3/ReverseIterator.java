import java.util.Iterator;

public class ReverseIterator implements Iterator<Student> {

    private int index;
    private Group students;

    public ReverseIterator(Group students) {
        this.students = students;
        this.index = students.size() - 1;
    }

    @Override
    public boolean hasNext() {
        return this.index >= 0;
    }

    @Override
    public Student next() {

        return students.get(this.index--);
    }

}
