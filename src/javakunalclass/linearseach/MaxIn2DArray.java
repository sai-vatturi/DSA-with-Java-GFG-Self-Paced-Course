package javakunalclass.linearseach;

public class MaxIn2DArray {
    public static void main(String[] args) {
        int[][] nums = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(maxIn2DArray(nums));
        System.out.println(maxIn2DArray2(nums));

    }
    public static int maxIn2DArray(int[][] arr){
        int  max = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
    public static int maxIn2DArray2(int[][] arr){
        int  max = Integer.MIN_VALUE;
        for (int[] array : arr) {
            for (int element : array) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }
}
