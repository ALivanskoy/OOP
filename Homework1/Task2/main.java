// Вывести все простые числа от 1 до 1000


public class main {

    public static int PrimeNum(int num) {
        if (num == 0)
            return 0;

        if (num == 1)
            return 1;

        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                return -1;
        }

        return num;
    }

    public static void main(String[] args) {

        for (int i = 1; i < 1000; i++) {

            if (i == PrimeNum(i))
                System.out.println(i);

        }

    }

}
