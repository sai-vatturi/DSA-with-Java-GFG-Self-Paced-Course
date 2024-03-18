package gfgclass.arrays;

import java.util.Arrays;

public class MoveAllZeroesToEnd {
    public static void main(String[] args) {
        int[] arr = {3, 5, 0, 0, 4};
        moveToEnd2(arr);
    }

    static void moveToEnd2 (int[] arr) {
        int n = arr.length;
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[j] = arr[i];
                j++;
            }
            if (i > j) {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }


    static void moveToEnd(int[] arr, int n) {
        int[] temp = new int[n];
        int currentIndex = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                temp[currentIndex] = arr[i];
                currentIndex++;
            }
        }
        System.out.println(Arrays.toString(temp));
    }
}
