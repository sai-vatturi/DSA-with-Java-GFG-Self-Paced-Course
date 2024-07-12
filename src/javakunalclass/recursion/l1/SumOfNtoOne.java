package javakunalclass.recursion.l1;

public class SumOfNtoOne {
    public static void main(String[] args) {
        System.out.println(sumtoN(5));
    }

    private static int sumtoN(int n) {
        if (n == 1){
            return 1;
        }
        return n + sumtoN(n - 1);
    }
}
