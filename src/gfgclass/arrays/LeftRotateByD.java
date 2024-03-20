package gfgclass.arrays;

import java.util.Arrays;

public class LeftRotateByD {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        leftRotateByD(arr, 2);
        System.out.println(Arrays.toString(arr));
    }
    static void leftRotateByD(int[] arr, int d) {
        int n = arr.length;
        reverseArray(arr, 0, d - 1);
        reverseArray(arr, d, n - 1);
        reverseArray(arr, 0, n - 1);
    }
    static void reverseArray(int[] arr, int low, int high) {
        while (low < high) {
            swap(arr, low, high);
            low++;
            high--;
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
