package gfgclass.arrays;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 40, 40, 40, 200};
        removeDuplicates(arr, 7);
        System.out.println(Arrays.toString(arr));
    }
    static int removeDuplicates(int[] arr, int n) {
        int res = 1;
        for (int i = 0; i < n; i++) {
            if (arr[i] != arr[res - 1]) {
                arr[res] = arr[i];
                res++;
            }
        }
        return res;
    }
}
