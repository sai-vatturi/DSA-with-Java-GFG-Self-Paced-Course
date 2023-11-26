package mathematicsmod2;

import java.util.Scanner;
// Naive Method

public class TrailingZeroesFactorial {
    // Naive Method

    public static void trailingZeroes(long n){
        long fact=1;
        for(long i = 2; i <= n; i++)
            fact = fact * i;
        System.out.println(fact);
        long res = 0;
        while(fact%10 == 0){
            res++;
            fact /= 10;
        }
        System.out.println(res);
    }
    // Optimized While Loop
    public static long getTrailingZeroes(long n){
        long res = 0, pow = 5;
        while(n>=pow){
            res = res + (n/pow);
            pow = pow*5;
        }
        return res;
    }
    // Optimized While Loop 2
    public static long trailing(long N)
    {
        long result =0;

        while(N>0){
            result = result+ N/5;
            N = N/5;

        }
        return result;
    }
    // GFG Solution
    public static long trailZeroes(long n){
        long res = 0;
        for(long i = 5; i<=n; i=i*5){
            res = res + (n/i);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        long n = sc.nextLong();
        trailingZeroes(n);
        System.out.println(getTrailingZeroes(n));
        System.out.println(trailing(n));
        System.out.println(trailZeroes(n));
    }
}
