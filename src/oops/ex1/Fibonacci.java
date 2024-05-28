package oops.ex1;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range: ");
        int n = sc.nextInt();
        System.out.println("Fibonacci using Iterative Method: ");
        printFibonacci(n);
        System.out.println("\nFibonacci using Recursive Method: ");
        printFibonacciIterative(n);
    }

    // Iterative Method
    public static void printFibonacci(int n) {
        if (n == 1) {
            System.out.println(n);
        } else if (n == 2) {
            System.out.println(0 + " " + 1);
        } else {
            int a = 0;
            int b = 1;
            int c;
            System.out.print(0 + " " + 1 + " ");
            for (int i = 3; i <= n; i++) {
                c = a + b;
                System.out.print(c + " ");
                a = b;
                b = c;
            }
        }
    }

    // Recursive Method
    public static void printFibonacciIterative(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(fibo(i) + " ");
        }
    }

    public static int fibo(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibo(n - 1) + fibo(n - 2);
    }
}
