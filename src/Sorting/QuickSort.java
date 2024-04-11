package Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        System.out.println("Original Array: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Sorted Array: ");
        quickSort(arr, 0, arr.length - 1);
        quickSortMidPivot(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int pivot = partition(arr, start, end);

            quickSort(arr, start, pivot - 1);
            quickSort(arr, pivot + 1, end);
        }
    }
    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int i = start -  1;
        for (int j = start; j < end; j++) {
            if (arr[j] < pivot) {
                 i++;
                 swap(arr, i, j);
            }
        }
        i++;
        swap(arr, i, end);
        return i;
    }
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void quickSortMidPivot(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int start = low;
        int end = high;
        int mid = start + (end - start) / 2;
        int pivot = arr[mid];

        while (start <= end) {
            while (arr[start] < pivot) {
                start++;
            }
            while (arr[end] > pivot) {
                end--;
            }
            if (start <= end) {
                swap(arr, start, end);
                start++;
                end--;
            }
        }

        quickSortMidPivot(arr, low, end);
        quickSortMidPivot(arr, start, high);
    }
}
