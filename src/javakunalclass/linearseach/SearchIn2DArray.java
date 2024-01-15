package javakunalclass.linearseach;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] nums = {
                {212,2,3},
                {4,5,6},
                {7,11,9}
        };
        int target = 8;
        int[] ans = linear2DSearch(nums, target);
        System.out.println(Arrays.toString(ans));
        System.out.println("Maximum value is " + max(nums));
        System.out.println("Minimum value is " + min(nums));

    }
    // find and return the position in a 2d array
    public static int[] linear2DSearch(int[][]  arr, int target){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
    // Max in a 2D Array
    public static int max(int[][]  arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
    // Min in a 2D Array
    public static int min(int[][]  arr){
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] < min){
                    min = arr[i][j];
                }
            }
        }
        return min;
    }
}
