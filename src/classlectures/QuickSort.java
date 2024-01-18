package classlectures;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {353,12,2411,3,12,1,123,44,145,54};
        System.out.println("Original Array: ");
        System.out.println(Arrays.toString(arr));
        quickSort(arr, 0, arr.length-1);
        System.out.println("Sorted Array using Quick Sort: ");
        System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int[] arr, int low, int high)
    {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    static int partition(int[] arr, int low, int high)
    {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }
    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
