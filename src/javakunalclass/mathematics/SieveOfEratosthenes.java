package javakunalclass.mathematics;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int n = 30;
        boolean[] arr = new boolean[n + 1];
//        System.out.println(arr[0]);
        sieve(n, arr);

    }
    static void sieve(int n, boolean[] primes)  {
        for (int i = 2; i * i <= n; i++) {

        }
    }
}
