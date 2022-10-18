// Задание 2 - Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

import java.util.logging.Logger;
import java.util.Arrays;

public class Task2 {

    public static void main(String[] args) {
        int[] nums = new int[] { 11, 3, 14, 16, 7 };
        bubbleSorter(nums);
        
    }

    private static int[] bubbleSorter(int[] numbers) {
        
        Logger bubbleSorterLogger = Logger.getAnonymousLogger();
        boolean isSorted = false;
        int swap;
        
        while (!isSorted) {
            bubbleSorterLogger.info(Arrays.toString(numbers));
            isSorted = true;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    isSorted = false;
                    swap = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = swap;
                }
            }
        }
        bubbleSorterLogger.info(Arrays.toString(numbers));
        return numbers;
    }
}