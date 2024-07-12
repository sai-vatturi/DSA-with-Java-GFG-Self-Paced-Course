package javakunalclass.recursion.l3;

import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSortRecursion {
    public static void main(String[] args) {
        int[] arr = {5, 8 , 3, 4, 1};
        bubbleSortRecursive(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSortRecursive(int[] arr, int i, int j) {
        if (i == 0) {
            return;
        }
        if (j < i) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
            bubbleSortRecursive(arr, i, j + 1);
        }
        else {
            bubbleSortRecursive(arr, i - 1, 0);
        }
    }
}
