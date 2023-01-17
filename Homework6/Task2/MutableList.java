package Task2;

public class MutableList<T> extends ImmutableList<T> {

    public MutableList(T[] someData) {
        super(someData);
    }

    @Override
    public int size() {
        // Логика метода
        return 0;
    }

    public boolean add(T e) {
        // Логика метода
        return false;
    }

    public boolean remove(T o) {
        // Логика метода
        return false;
    }

    @Override
    public T get(int index) {
        // Логика метода
        return null;
    }

    public T set(int index, T element) {
        // Логика метода
        return null;
    }
}
