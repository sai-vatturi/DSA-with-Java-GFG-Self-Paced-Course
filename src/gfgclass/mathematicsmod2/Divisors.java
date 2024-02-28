package gfgclass.mathematicsmod2;

import java.util.Scanner;

public class Divisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER N VALUE: ");
        int n = sc.nextInt();
        printDivisors(n);
        printAllDivisors(n);
    }

    // Naive Solution
    public static void printDivisors(int n){
        for(int i =1 ; i <= n; i ++){
            if(n%i==0){
                System.out.println(i);
            }
        }
    }

    // Effecient Soultion
    public static void printAllDivisors(int n) {
        int i;
        for (i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
        for (; i >= 1; i--) {
            if(n%i == 0){
                System.out.println(n/i);
            }
        }
    }
}
