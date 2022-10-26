// (ВАЖНО) Для вывода необходимо использовать логгер(Java.Util.Logging)
// Реализовать алгоритм сортировки слиянием

import java.util.Arrays;
import java.util.Logging.*;

public class Task1 {

    public static void main(String[] args) {
        Logger log = Logger.getAnonymousLogger();
        int[] items = { 42, 34, 85, -8, 0, 301, 1 };
        log.info("Start items: " + Arrays.toString(items));
        int[] sortItems = sort(items);
        log.info("Sorted items: " + Arrays.toString(sortItems));
        log.info("program end");
    }

    private static int[] sort(int[] arr) {
        int[] items = Arrays.copyOf(arr, arr.length);
        doSort(items);
        return items;
    }

    private static void doSort(int[] items) {
        int len = items.length;
        if (len == 1) {
            return;
        }

        int lLeft = len / 2;
        int[] left = Arrays.copyOf(items, lLeft);
        int[] right = Arrays.copyOfRange(items, lLeft, len);

        doSort(left);
        doSort(right);

        merge(left, right, items);
    }

    private static void merge(int[] left, int[] right, int[] result) {
        int l = 0;
        int r = 0;
        int i = 0;

        while (l < left.length && r < right.length) {
            if (left[l] < right[r]) {
                result[i] = left[l];
                l++;
            } else {
                result[i] = right[r];
                r++;
            }
            i++;
        }
        System.arraycopy(left, l, result, i, left.length - l);
        System.arraycopy(right, r, result, i, right.length - r);
    }

}