package gfgclass.recursion;
import java.util.Stack;

public class FactorialTailRecursion {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        System.out.println(tailRecursionFactorial(4, 1));
    }

    static int tailRecursionFactorial(int n, int a) {
        if (n == 0) {
            return a;
        }
        return tailRecursionFactorial(n - 1, n * a);
    }
}
