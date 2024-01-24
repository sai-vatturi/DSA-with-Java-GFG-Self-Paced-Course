package javakunalclass.binarysearch;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDBinary {
    public static void main(String[] args) {
        int[][] arr = {
                        {10, 20, 30, 40},
                        {15, 25, 35, 45},
                        {28, 29, 37, 49},
                        {33, 34, 38, 50}
        };
        System.out.println("Original Array: ");
        for (int[] num: arr) {
            System.out.println(Arrays.toString(num));
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a target value to find using Binary Search: ");
        int target = sc.nextInt();
        System.out.println("Position of the target value is ");
        System.out.println(Arrays.toString(binary2D(arr, target)));
    }
    private static int[] binary2D(int[][] nums, int target) {
        int row = 0;
        int column = nums.length - 1;
        while (row < nums.length && column >= 0) {
            if (nums[row][column] == target) {
                return new int[]{row, column};
            }
            if (nums[row][column] > target) {
                column--;
            } else {
                row++;
            }
        }
        return new int[]{-1, -1};
    }

}
