package Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSortInPlaceOptimized {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        System.out.println("Original Array: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Sorted Array: ");
        long begin = System.nanoTime();
        mergeSortInPlaceOptimized(arr, 0, arr.length);
        long end = System.nanoTime();
        Arrays.sort(arr);
        long time = end-begin;
        System.out.println();
        System.out.println("Elapsed Time: "+time);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSortInPlaceOptimized(int[] arr, int start, int end) {
        if (end - start == 1) {
            return;
        }
        int mid = start + (end - start) / 2;
        mergeSortInPlaceOptimized(arr, start, mid);
        mergeSortInPlaceOptimized(arr, mid, end);

        mergeInPlaceOptimized(arr, start, mid, end);
    }

    private static void mergeInPlaceOptimized(int[] arr, int start, int mid, int end) {
        int i = start;
        int j = mid;

        while (i < mid && j < end) {
            if (arr[i] <= arr[j]) {
                i++;
            }
            else {
                int temp = arr[j];
                for (int k = j; k > i; k--) {
                    arr[k] = arr[k - 1];
                }
                arr[i] = temp;
                i++;
                j++;
                mid++;
            }
        }
    }
}
