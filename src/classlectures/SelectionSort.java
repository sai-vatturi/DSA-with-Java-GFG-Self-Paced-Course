package classlectures;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {353,12,2411,3,12,1,123,44,145,54};
        System.out.println("Original Array");
        System.out.println(Arrays.toString(arr));
        System.out.println("Sorted Array using Selection Sort");
        selectionSort(arr);
    }
    static void selectionSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if (arr[j] < arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
