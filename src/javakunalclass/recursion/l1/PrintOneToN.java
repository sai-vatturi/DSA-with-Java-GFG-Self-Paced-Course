package javakunalclass.recursion.l1;

public class PrintOneToN {
    public static void main(String[] args) {
        printOneToN(5);
        printNtoOne(5);
    }

    private static void printOneToN(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printOneToN(n - 1);
        System.out.print(n +  " ");
    }

    private static void printNtoOne(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        System.out.print(n +  " ");
        printNtoOne(n - 1);

    }
}
