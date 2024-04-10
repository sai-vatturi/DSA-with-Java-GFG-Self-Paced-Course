package javakunalclass.recursion;

import java.util.Arrays;

public class BubbleSortRecursion {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};
        bubbleSortRecursion(arr, 0, 1);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSortRecursion(int[] arr, int i, int j) {
        if (i == 0) {
            return;
        }
        if (j < i) {
            
        }
    }
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
