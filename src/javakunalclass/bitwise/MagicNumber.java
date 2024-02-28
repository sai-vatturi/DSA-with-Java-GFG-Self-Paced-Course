package javakunalclass.bitwise;

public class MagicNumber {
    public static void main(String[] args) {
        int n = 2;
        int ans = 0;
        int base = 5;
        while (n > 0) {
            int digit = n & 1;
            ans += base * digit;
            base = base * 5;
            n = n >> 1;

        }

        System.out.println(ans);
    }
}
