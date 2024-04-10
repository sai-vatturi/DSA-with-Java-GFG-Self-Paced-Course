package javakunalclass.recursion;

public class RecursionPatterns {
    public static void main(String[] args) {
        recursionTriangle(4, 0);
        recursionTriangle2(4, 0);

    }
    static void recursionTriangle(int n, int i) {
        if (n == 0) {
            return;
        }
        if (n == i) {
            System.out.println();
            recursionTriangle(n - 1, 0);
        } else {
            System.out.print("* ");
            recursionTriangle(n, i + 1);
        }
    }
    static void recursionTriangle2(int n, int i) {
        if (n == 0) {
            return;
        }
        if (n == i) {
            recursionTriangle2(n - 1, 0);
            System.out.println();
        } else {
            recursionTriangle2(n, i + 1);
            System.out.print("* ");

        }
    }
}
