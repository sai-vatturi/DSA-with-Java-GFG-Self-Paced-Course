package oops.ex5;

import java.util.ArrayList;
import java.util.Scanner;

public class Test3 {
    // check even numbers

    static void printEven(Integer[] arr) {
        int n = arr.length;
        System.out.println("Even Numbers: ");
        for (int num : arr) {
            if (num % 2 == 0)
                System.out.print(num + " ");
        }
        System.out.println();
    }

    static void printOdd(Integer[] arr) {
        int n = arr.length;
        System.out.println("Odd Numbers: ");
        for (int num : arr) {
            if (num % 2 != 0)
                System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
        System.out.println("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++) {
            list.add(sc.nextInt());
        }

        //convert list to array
        Integer[] arr = list.toArray(new Integer[list.size()]);

        printEven(arr);
        printOdd(arr);
    }
}
