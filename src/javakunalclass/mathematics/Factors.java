package javakunalclass.mathematics;

import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
        int n = 36;
        factors(n);
        factors2(n);
        factors3(n);
    }

    // O(n)
    static void factors(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    // O(sqrt(n))
    static void factors2(int n) {
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i + " " + (n/i));
            }
        }
        System.out.println();
    }
    // O(sqrt(n) Time & space
    static void factors3(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (n/i == i) {
                    System.out.print(i + " ");
                } else {
                    System.out.print(i + " ");
                    list.add(n/i);
                }
            }
        }
        for (int j = list.size() - 1; j >= 0; j--) {
            System.out.print(list.get(j) + " ");
        }
        System.out.println();
    }

}
