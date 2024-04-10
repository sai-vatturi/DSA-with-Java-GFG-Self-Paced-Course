package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        System.out.println("Original Array: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Sorted Array: ");
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertionSort(int[] arr) {
        int n  = arr.length;
        for (int i = 1; i < n; i++) {
            int curr = arr[i];
            int j =  i - 1;

            while (j >= 0 && arr[j] > curr) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = curr;
        }
    }
}
