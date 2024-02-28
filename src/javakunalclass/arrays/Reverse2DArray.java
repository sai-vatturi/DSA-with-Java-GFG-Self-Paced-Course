package javakunalclass.arrays;

import java.util.Arrays;

public class Reverse2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 1, 0},
                {1, 0, 1},
                {0, 0, 0}
        };
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[0].length; j++) {
//                arr[i][j] = arr[i][j] ^ 1;
//            }
//        }
        reverseArray(arr);
        System.out.println("reversed: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(Arrays.toString(arr[i]));
            System.out.println();
        }
    }
    static void reverseArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int first = 0;
                int last = arr[i].length - 1;
                while (first <= last) {
                    swap(arr, i, first, last);
                    first++;
                    last--;
                }
            }
        }
    }
    public static void swap(int[][] arr, int row, int a, int b){
        int temp = arr[row][a];
        arr[row][a] = arr[row][b];
        arr[row][b] = temp;
    }
}
