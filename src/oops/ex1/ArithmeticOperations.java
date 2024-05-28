package oops.ex1;

import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        int add = a + b;
        System.out.println("Addition of " + a + " and " + b + " is " + add);
        int sub = a - b;
        System.out.println("Subtraction of " + a + " and " + b + " is " + sub);
        int mul = a * b;
        System.out.println("Multiplication of " + a + " and " + b + " is " + mul);
        int div = a / b;
        System.out.println("Division of " + a + " and " + b + " is " + div);
        int mod = a % b;
        System.out.println("Modulus of " + a + " and " + b + " is " + mod);
    }
}
