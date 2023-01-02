import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class App {

    public static void main(String[] args) {

        List<Student> studentsList = new LinkedList();
        studentsList.add(new Student("Василий", "Петров", 25));
        studentsList.add(new Student("Николай", "Васильев", 22));
        studentsList.add(new Student("Пётр", "Николаев", 28));

        Group studentGroupe = new Group(studentsList);

        System.out.println("Подзадача 1:");

        System.out.println(studentGroupe);

        System.out.println();

        System.out.println("Подзадача 2:");

        ListIterator groupeIterator = studentGroupe.listIterator();

        while (groupeIterator.hasNext()) {
            System.out.println(groupeIterator.next());
        }

        System.out.println();
    }
}