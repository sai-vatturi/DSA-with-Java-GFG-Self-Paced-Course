package javakunalas4.intermediate;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find factorial");
        int a = sc.nextInt();
        System.out.println(findFactorial(a));
        System.out.println(getFactorial(a));
    }

    public static int findFactorial(int n){
        if(n<=1){
            return 1;
        }
        return n * findFactorial(n-1);
    }

    public static int getFactorial(int n){
        int factorial = 1;
        while(n > 1){
            factorial *= n;
            n--;
        }
        return factorial;
    }

}
