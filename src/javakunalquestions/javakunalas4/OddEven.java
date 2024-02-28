package javakunalquestions.javakunalas4;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to find odd or even");
        int n = sc.nextInt();
        boolean isEven= findOddEven(n);
        if(isEven){
            System.out.println(n  + " is even");
        } else{
            System.out.println(n  + " is odd");
        }

    }
    public static boolean findOddEven(int n){
        return n % 2 == 0;
    }
}
