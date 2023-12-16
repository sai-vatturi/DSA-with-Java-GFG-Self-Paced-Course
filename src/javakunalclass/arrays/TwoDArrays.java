package javakunalclass.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrixArray1 = new int[3][3];
        int[][] matrixArray2 = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}
        };
        //  Intialize the 2d arrays
//        for (int i = 0; i<matrixArray1.length; i++){
//            matrixArray1[i] = new int[3];
//        }
        // Adding data to first array
        for(int i = 0; i < matrixArray1.length; i++){
            for(int j =  0; j < matrixArray1[i].length; j++){
                matrixArray1[i][j] = sc.nextInt();
            }
        }

        // Printing the Array
        for(int i = 0; i < matrixArray1.length; i++){
            for(int j =  0; j < 3; j++){
                System.out.print(matrixArray1[i][j] + " ");
            }
            System.out.println();
        }
       for (int[] nums: matrixArray2){
           System.out.println(Arrays.toString(nums));
       }
    }
}
