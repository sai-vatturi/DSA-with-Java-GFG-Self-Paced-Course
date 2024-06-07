package oops.ex3.pkg2;

import java.util.Arrays;

public class Class2 {
    public void primeNumbers(int n) {
        boolean[] primes = new boolean[n + 1];
        for (int i = 0; i <= n; i++) {
            primes[i] = true;
        }
        for (int i = 2; i * i <= n; i++) {
            if (primes[i]) {
                for (int p = i * i; p <= n; p += i) {
                    primes[p] = false;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (primes[i]) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public void oddAndEven(int[] arr){
        int n = arr.length;
        int noOfOdd = 0;
        int noOfEven = 0;
        // calculate no of odd and even
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0)
                noOfEven++;
            else
                noOfOdd++;
        }
        // create resultant arrays
        int[] odd = new int[noOfOdd];
        int[] even = new int[noOfEven];
        int oddIndex = 0;
        int evenIndex = 0;
        for (int i : arr) {
            if (i % 2 == 0) {
                even[evenIndex] = i;
                evenIndex++;
            }
            else {
                odd[oddIndex] = i;
                oddIndex++;
            }
        }
        System.out.println(Arrays.toString(odd));
        System.out.println(Arrays.toString(even));
    }

    public void FiboUptoN (int n) {
        if (n == 1) {
            System.out.println(0);
            return;
        }
        if (n == 2) {
            System.out.println(0 + " " + 1);
            return;
        }
        System.out.print(0 + " " + 1 + " ");
        int a = 0;
        int b = 1;
        int c;
        for (int i = 3; i <= n; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
