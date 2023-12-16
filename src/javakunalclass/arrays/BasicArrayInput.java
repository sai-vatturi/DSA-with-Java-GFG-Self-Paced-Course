package javakunalclass.arrays;

import java.util.Scanner;

public class BasicArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Taking input
        System.out.println("Enter the elements in array with spaces between the: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        // Print the array
        for(int num: arr){
            System.out.print(num + " ");
        }
    }
}
