package javakunalclass.mathematics;

public class Prime {
    public static void main(String[] args) {
        int n = 102;
        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
    static boolean isPrime(int n) {
        if  (n <=  1) {
            return false;
        }
        int c = 2;
        while (c * c <= n) {
            if (n  % 2 == 0) {
                return false;
            }
            c++;
        }
        return true;
    }
}
