package javakunalclass.arrays;

import java.util.Arrays;

public class SwappingValuesInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
        swap(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
