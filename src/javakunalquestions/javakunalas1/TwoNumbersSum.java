package javakunalquestions.javakunalas1;

import java.util.Scanner;

public class TwoNumbersSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.println("The sum of two numbers is " + (num1+num2));
    }
}
