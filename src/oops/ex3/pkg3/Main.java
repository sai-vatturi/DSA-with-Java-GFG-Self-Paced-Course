package oops.ex3.pkg3;

// Importing Packages
import oops.ex3.pkg1.Class1;
import oops.ex3.pkg2.Class2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Creating objects for both classes
        Class1 a = new Class1();
        Class2 b = new Class2();

        // Testing package 1
        int[] arr = {4, 6, 2, 5, 7, 0, 9};
        a.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(a.search(arr, 5));

        // Testing package 2
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        b.primeNumbers(50);
        b.oddAndEven(arr2);
        b.FiboUptoN(15);
    }
}
