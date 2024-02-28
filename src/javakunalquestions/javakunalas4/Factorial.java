package javakunalquestions.javakunalas4;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printFactorial(n);
    }
    public static void printFactorial(int n){
        int result = 1;
        for(int i = 2; i <= n; i++){
            result =  result * i;
        }
        System.out.println(result);
    }
}
