package javakunalquestions.javakunalas2;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int num2 = sc.nextInt();
        System.out.println("Max of two numbers: ");
        System.out.println(Math.max(num1,num2));
        if(num1>num2)
            System.out.println(num1);
        else
            System.out.println(num2);
    }

}
