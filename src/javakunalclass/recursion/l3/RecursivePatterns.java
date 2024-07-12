package javakunalclass.recursion.l3;

public class RecursivePatterns {
    public static void main(String[] args) {
        upperTriange(5, 0);
        lowerTriangle(5, 0);
    }

    private static void upperTriange(int n, int j) {
        if (n == 0) {
            return;
        }
        if (j < n) {
            System.out.print("* ");
            upperTriange(n, j + 1);
        }
        else {
            System.out.println();
            upperTriange(n - 1, 0);
        }
    }

    private static void lowerTriangle(int n, int j) {
        if (n == 0) {
            return;
        }
        if (j < n) {
            lowerTriangle(n, j + 1);
            System.out.print("* ");
        }
        else {
            lowerTriangle(n - 1, 0);
            System.out.println();
        }
    }
}
