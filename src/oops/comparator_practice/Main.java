package oops.comparator_practice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class DoubleArray {
    int a;
    int b;

    @Override
    public String toString() {
        return (this.a + " " + this.b);
    }
}

public class Main {
    public static void main(String[] args) {
        Integer[] start = {0, 3, 1, 5, 5, 8};
        int[] end = {5, 4, 2, 9, 7, 9};

        DoubleArray[] arr = new DoubleArray[start.length];

        for (int i = 0; i < start.length; i++) {
            arr[i] = new DoubleArray();
            arr[i].a = start[i];
            arr[i].b = end[i];
        }

        // Sort based on the 'b' field
        Arrays.sort(start, Comparator.reverseOrder());
        System.out.println(Arrays.toString(start));
        // Print the sorted array
        for (DoubleArray d : arr) {
            System.out.println(d);
        }
    }
}
