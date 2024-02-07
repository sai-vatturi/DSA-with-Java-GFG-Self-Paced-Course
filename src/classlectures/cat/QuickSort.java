package classlectures.cat;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {8, 2, 4, 7, 1, 3, 9, 6, 5};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }
    public static void quickSort (int[] array, int start, int end) {
        if (end <= start) {
            return;
        }
        int pivot = partition(array, start, end);
        quickSort(array, start, pivot - 1);
        quickSort(array, pivot + 1, end);
    }

    public static int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int i = start - 1;
        for (int j = start; j <= end - 1; j++) {
            if (array[j] < pivot) {
                i++;
                swap(array, i, j);
            }
        }
        i++;
        swap(array, i, end);
        return i;
    }
    public static void swap (int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
