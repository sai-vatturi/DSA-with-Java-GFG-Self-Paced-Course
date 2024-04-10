package Sorting;

import java.util.Arrays;

public class MaxSelectionSort {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        System.out.println("Original Array: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Sorted Array: ");
        maxSelectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void maxSelectionSort(int[] arr) {
        int n = arr.length;
        for (int i = n - 1; i >= 0; i--) {
            int maxIndex = i;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            swap(arr, i, maxIndex);
        }
    }
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
