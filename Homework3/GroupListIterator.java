import java.util.List;
import java.util.ListIterator;

public class GroupListIterator implements ListIterator<Student> {

    private int index;
    private Group students;
    private boolean isRemovable;

    public GroupListIterator(Group students) {
        this.students = students;
        this.index = 0;
        isRemovable = false;
    }

    @Override
    public boolean hasNext() {

        return this.index < students.size();
    }

    @Override
    public Student next() {
        isRemovable = true;
        return students.get(this.index++);
    }

    @Override
    public boolean hasPrevious() {
        return this.index > 0;
    }

    @Override
    public Student previous() {
        isRemovable = true;
        return students.get(this.index--);
    }

    @Override
    public int nextIndex() {
        return this.index + 1;
    }

    @Override
    public int previousIndex() {
        return this.index - 1;
    }

    @Override
    public void remove() {
        if (isRemovable) {
            students.remove(index);
            isRemovable = false;
        }
    }

    @Override
    public void add(Student e) {
        students.add(index, e);

    }

    @Override
    public void set(Student e) {

    }

}
