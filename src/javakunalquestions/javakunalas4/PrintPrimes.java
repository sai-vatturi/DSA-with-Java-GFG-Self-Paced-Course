package javakunalquestions.javakunalas4;

import java.util.Scanner;

import static javakunalquestions.javakunalas4.OptimizedPrime.isPrime;

public class PrintPrimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range to print primes with space-seperated: ");
        int lowerBound = sc.nextInt();
        int upperBound = sc.nextInt();
        for(int i = lowerBound; i <=upperBound; i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
}
