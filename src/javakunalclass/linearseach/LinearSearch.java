package javakunalclass.linearseach;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element to find in array: ");
        int a = sc.nextInt();
        int[] nums  = {1,2,3,4,5};
        System.out.println(linearSearch(nums, a));
        System.out.println(linearSearch2(nums, a));
        System.out.println(linearSearch3(nums, a));

    }
    // return -1 if element not found, index if found
    public static int linearSearch(int[] arr, int num){
        if(arr.length == 0){
            return -1;
        }
        for (int i = 0; i <  arr.length; i++){
            if (arr[i] == num){
                return i;
            }
        }
        return -1;
    }
    // Return element itself
    public static int linearSearch2(int[] arr, int num){
        for(int element: arr){
            if (element == num){
                return element;
            }
        }
        return Integer.MAX_VALUE;
    }
    // Return true or false
    public static boolean linearSearch3(int[] arr, int num){
        if(arr.length == 0){
            return false;
        }
        for (int i = 0; i <  arr.length; i++){
            if (arr[i] == num){
                return true;
            }
        }
        return false;
    }
}
