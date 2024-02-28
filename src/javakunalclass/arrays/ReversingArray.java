package javakunalclass.arrays;

import java.util.Arrays;

public class ReversingArray {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0};
        System.out.println(Arrays.toString(arr));
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void reverseArray(int[] arr){
        int start, end;
        start = 0;
        end =  arr.length-1;
        while(start<end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
