package gfgclass.recursion;

public class FactorialTailRecursion {
    public static void main(String[] args) {
        System.out.println(tailRecursionFactorial(4, 1));
    }

    static int tailRecursionFactorial(int n, int a) {
        if (n == 0) {
            return a;
        }
        return tailRecursionFactorial(n - 1, n * a);
    }
}
