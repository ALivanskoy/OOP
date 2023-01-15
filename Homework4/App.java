import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        /* Первая часть задания */

        {
            System.out.println("Первая часть задания");

            int dig = 2;
            IsGood isEven = new IsEven();
            System.out.printf("Digit \"%d\" is Even: %s\n", dig, isEven.IsGood(dig));
            dig += 1;
            System.out.printf("Digit \"%d\" is Even: %s\n", dig, isEven.IsGood(dig));
            System.out.println();

            IsGood isPositive = new IsPositive();
            System.out.printf("Digit \"%d\" is Positive: %s\n", dig, isPositive.IsGood(dig));
            dig *= -1;
            System.out.printf("Digit \"%d\" is Positive: %s\n", dig, isPositive.IsGood(dig));
            System.out.println();

            String str = "Algebra";
            IsGood beginWithA = new BeginsWithA();
            System.out.printf("String \"%s\" begins with letter \"A\": %s\n", str, beginWithA.IsGood(str));
            str = "Biology";
            System.out.printf("String \"%s\" begins with letter \"A\": %s\n", str, beginWithA.IsGood(str));
            System.out.println();

            String strToRemember = "Alg";
            str = "Algebra";
            IsGood beginWith = new BeginsWith(strToRemember);
            System.out.printf("String \"%s\" begins with letters \"%s\": %s\n", str, strToRemember,
                    beginWith.IsGood(str));
            str = "Biology";
            System.out.printf("String \"%s\" begins with letters \"%s\": %s\n", str, strToRemember,
                    beginWith.IsGood(str));
            System.out.println();
        }

        /* Вторая часть задания */

        {
            System.out.println("Вторая часть задания");

            List<Integer> list = new LinkedList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
            List<Integer> filtredList = new LinkedList<Integer>();

            System.out.println("Неотфильтрованный список:\n" + list);

            Filter<List<Integer>, Integer> filterIsEven = new Filter<>(list, filtredList, new IsEven());
            filterIsEven.filter();
            System.out.println("Отфильтрованный список:\n" + filtredList);
        }
    }
}