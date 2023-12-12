package javakunalas4;

import java.util.Scanner;

public class MaxMinTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers with spaces");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        findMinMax(a, b, c);
        findMinMax1(a, b, c);
        findMinMax2(a, b, c);
    }

    // Using If-else
    public static void findMinMax(int a, int b, int c){
        int min, max;
        if (a > b){
            min = b;
            if (a > c){
                max = a;
                if (b > c){
                    min = c;
                }
            }
            else{
                max = c;
            }
        }
        else{
            min = a;
            if(b > c){
                max = b;
                if(c < a){
                    min = c;
                }
            }
            else{
                max = c;
            }
        }
        System.out.println("Maximum number is " + max);
        System.out.println("Minimum number is " +min);
    }
    // Using Ternary
    public static void findMinMax1(int a, int b, int c) {
        int min, max;
        // Finding maximum
        if (a > b) {
            if (a > c) {
                max = a;
                min = (b > c) ? c : b;
            } else {
                max = c;
                min = b;
            }
        } else {
            if (b > c) {
                max = b;
                min = (a > c) ? c : a;
            } else {
                max = c;
                min = a;
            }
        }
        System.out.println("Maximum number is " + max);
        System.out.println("Minimum number is " + min);
    }
    // Using Libraries
    public static void findMinMax2(int a, int b, int c) {
        int min = Math.min(Math.min(a, b), c);
        int max = Math.max(Math.max(a, b), c);

        System.out.println("Maximum number is " + max);
        System.out.println("Minimum number is " + min);
    }
}
