package javakunalclass.recursion.l3;

import java.util.Arrays;

public class SelectionSortRecursion {
    public static void main(String[] args) {
        int[] arr = {4, 1, 8, 12, 6};
        selectionSortRecursive(arr, arr.length - 1, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSortRecursive(int[] arr, int i, int j, int max) {
        if (i == 0) {
            return;
        }
        if (j <= i) {
            if (arr[j] > arr[max]) {
                selectionSortRecursive(arr, i, j + 1, j);
            }
            else {
                selectionSortRecursive(arr, i, j + 1, max);
            }
        }
        else {
            int temp = arr[max];
            arr[max] = arr[i];
            arr[i] = temp;
            selectionSortRecursive(arr, i - 1, 0, 0);
        }
    }
}
