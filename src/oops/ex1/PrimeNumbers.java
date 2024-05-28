package oops.ex1;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range: ");
        int n = sc.nextInt();
        System.out.println("Using Sieve's Method: ");
        sieve(n);
        System.out.println("\n Using Brute-force Method");
        primes(n);

    }

    // Sieve method
    public static void sieve(int n) {
        boolean[] primes = new boolean[n + 1];
        for (int i = 0; i <= n; i++) {
            primes[i] = true;
        }
        for (int i = 2; i * i <= n; i++) {
            for (int j = i * i; j < n; j += i) {
                primes[j] = false;
            }
        }
        for (int i = 2; i < n; i++) {
            if (primes[i])
                System.out.print(i + " ");
        }
    }

    // Brute-force method
    public static void primes(int n) {
        for (int i = 2; i < n; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}
