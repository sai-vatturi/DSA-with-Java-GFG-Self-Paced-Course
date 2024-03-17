package gfgclass.recursion;

public class PrintNtoOne {
    public static void main(String[] args) {
        printNums(10);
    }

    static void printNums(int n) {
        if (n == 0) {
            System.out.println();
            return;
        }
        System.out.print(n + " ");
        printNums(n - 1);
    }
}
