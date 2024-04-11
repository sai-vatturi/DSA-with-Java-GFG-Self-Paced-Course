package Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        System.out.println("Original Array: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Sorted Array: ");
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static int[] mergeSort(int[] arr) {
        int n = arr.length;
        if (n == 1) {
            return arr;
        }

        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, n));

        return merge(left, right);
    }
    static int[] merge(int[] left, int[] right) {
        int res[] = new int[left.length + right.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                res[k] = left[i];;
                i++;
                k++;
            } else {
                res[k] = right[j];
                j++;
                k++;
            }
        }

        while (i < left.length) {
            res[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            res[k] = right[j];
            j++;
            k++;
        }
        return res;
    }
}
