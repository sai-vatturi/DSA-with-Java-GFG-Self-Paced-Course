package javakunalclass.bitwise;

public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 16;
        if (n == 0) {
            System.out.println(false);
        } else {
            System.out.println((n & (n-1)) == 0);
        }
    }
}
