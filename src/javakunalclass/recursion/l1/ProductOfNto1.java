package javakunalclass.recursion.l1;

public class ProductOfNto1 {
    public static void main(String[] args) {
        System.out.println(productOfNto1(5));
    }

    private static int productOfNto1(int n) {
        if (n == 1) return 1;
        return productOfNto1(n - 1) * n;
    }
}
