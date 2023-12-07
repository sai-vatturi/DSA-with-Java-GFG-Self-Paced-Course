package javakunalas2;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        getFibonacci(n);
        for (int i = 0; i < n; i++) {

            System.out.print(findFibonacci(i) + " ");
        }
    }
    static void getFibonacci(int n){
        int a = 0;
        int b = 1;
        int c;
        if(n==1){
            System.out.println(0);
        } else if (n==2) {
            System.out.println(0);
            System.out.println(1);
        } else{
            System.out.println(a);
            System.out.println(b);
            for(int i = 3; i <=n; i++){
                c = a + b;
                System.out.println(c);
                a = b;
                b = c;
            }

        }
    }

    static int findFibonacci(int n){
        if(n<=1){
            return n;
        }
        return findFibonacci(n-1) + findFibonacci(n-2);
    }

}
