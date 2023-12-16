package javakunalclass.linearseach;

import java.util.Scanner;

public class LinearSearchInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {456,46,5674545,657,6,56,6,6,6,457,7,6,6,6,75,8};
        System.out.println("Enter target variable: ");
        int target = sc.nextInt();
        System.out.println("Enter start index: ");
        int start = sc.nextInt();
        System.out.println("Enter end index: ");
        int end = sc.nextInt();
        System.out.println(linearSearchRange(arr, target, start, end));
    }

    private static boolean linearSearchRange(int[] arr, int target, int start, int end) {
        if(arr.length == 0 || end > arr.length){
            return false;
        }
        for(int i = start; i < end; i++){
            if(target == arr[i]){
                return true;
            }
        }
        return false;
    }
}
