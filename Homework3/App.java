import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class App {

    public static void main(String[] args) {


        Group studentGroupe = new Group(Arrays.asList(
            new Student("Василий", "Петров", 25),
            new Student("Николай", "Васильев", 22),
            new Student("Пётр", "Николаев", 28)
        ));

        System.out.println("Подзадача 1:");

        System.out.println(studentGroupe);

        System.out.println();

        System.out.println("Подзадача 2:");

        ListIterator groupeIterator = studentGroupe.listIterator();

        while (groupeIterator.hasNext()) {
            System.out.println(groupeIterator.next());
        }

        System.out.println();

        System.out.println("Подзадача 3:");

        Iterator groupeReverseIterator = studentGroupe.iterator();

        while (groupeReverseIterator.hasNext()) {
            System.out.println(groupeReverseIterator.next());
        }

    }
}