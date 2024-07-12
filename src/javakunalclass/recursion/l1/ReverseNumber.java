package javakunalclass.recursion.l1;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(reverseNumber(12345, (int) Math.log10(12345) + 1));
        System.out.println(rev2(12345,  0));
    }

    private static int reverseNumber(int n, int base) {
        if (n % 10 == n) {
            return n;
        }
        return (n % 10 * (int) Math.pow(10, base - 1)) + reverseNumber(n / 10, base - 1);
    }

    public static int rev2(int n, int reversed) {
        if (n <= 0) {
            return reversed;
        }
        return rev2(n / 10, reversed * 10 + n % 10);
    }
}
