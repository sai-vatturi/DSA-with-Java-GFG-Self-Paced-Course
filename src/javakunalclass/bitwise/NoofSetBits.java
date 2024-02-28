package javakunalclass.bitwise;

public class NoofSetBits {
    public static void main(String[] args) {
        int n = 29;
        System.out.println(Integer.toBinaryString(n));
        int count = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n = n >> 1;
        }
        System.out.println(count);
        count = 0;
        n = 29;
        while (n > 0) {
            count++;
            n = n - (n & -n);
        }
        System.out.println(count);
    }

}
