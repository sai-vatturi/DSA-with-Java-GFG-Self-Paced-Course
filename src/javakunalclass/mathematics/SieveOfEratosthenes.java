package javakunalclass.mathematics;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int n = 100;
        boolean[] arr = new boolean[n + 1];
        sieve(n, arr);

    }
    static void sieve(int n, boolean[] primes)  {
        for (int i = 2; i * i <= n; i++) {
            if (!primes[i]) {
                for (int j = i*2; j <= n; j=j+i) {
                    primes[j] = true;
                }
            }
        }
        for (int i = 2; i <=n; i++) {
            if (!primes[i]) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
