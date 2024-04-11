package Sorting;

import java.util.Arrays;

public class MergeSortInPlace {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        System.out.println("Original Array: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Sorted Array: ");
        mergeSortInPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSortInPlace(int[] arr, int start, int end) {
        if (end - start == 1) {
            return;
        }

        int mid = start + (end - start) / 2;
        mergeSortInPlace(arr, start, mid);
        mergeSortInPlace(arr, mid, end);
        mergeInPlace(arr, start, mid,  end);
    }
    private static void mergeInPlace(int[] arr, int start, int mid, int end) {
        int[] res = new int[end - start];

        int i = start;
        int j = mid;
        int k = 0;

        while (i < mid && j < end) {
            if (arr[i] <= arr[j]) {
                res[k] = arr[i];;
                i++;
                k++;
            } else {
                res[k] = arr[j];
                j++;
                k++;
            }
        }

        while (i < mid) {
            res[k] = arr[i];
            i++;
            k++;
        }
        while (j < end) {
            res[k] = arr[j];
            j++;
            k++;
        }
        for (int l = 0; l < res.length; l++) {
            arr[start + l] = res[l];
        }
    }
}
