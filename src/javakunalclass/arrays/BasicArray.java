package javakunalclass.arrays;

import java.util.Arrays;

public class BasicArray {
    public static void main(String[] args) {
        // Creating an array

        // Method 1
        int[] arr1 = new int[5];

        // Method 2
        int[] arr2 = {1, 2, 3, 4, 5};

        // Printing an array

        //  Method 1
        for(int i = 0; i < arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        // Method 2
        for(int nums : arr2){
            System.out.print(nums + " ");
        }
        System.out.println();
        // Method 3
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        // Updating element in an array
        arr2[3] = 5;
        System.out.println(Arrays.toString(arr2));

    }
}
