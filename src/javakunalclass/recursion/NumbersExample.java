package javakunalclass.recursion;

public class NumbersExample {
    public static void main(String[] args) {
        print1(1);
    }

    private static void print1(int n) {
        System.out.println(1);
        print2(2);
    }

    private static void print2(int n) {
        System.out.println(2);
        print3(3);
    }

    private static void print3(int n) {
        System.out.println(3);
        print4(4);
    }

    private static void print4(int n) {
        System.out.println(4);
        print5(5);
    }

    private static void print5(int n) {
        System.out.println(5);
    }
}
