package javakunalclass.sorting;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(arr));
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void cyclicSort(int[] arr) {
        int n = arr.length;
        int start = 0;
        while (start < n ) {
            int correctIndex = arr[start] - 1;
            if (arr[start] != arr[correctIndex]) {
                swapArray(arr, start, correctIndex);
            }
            else {
                start++;
            }
        }
    }
    static void swapArray(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
