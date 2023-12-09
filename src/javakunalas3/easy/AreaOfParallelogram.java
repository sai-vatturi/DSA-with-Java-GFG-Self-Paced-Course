package javakunalas3.easy;

import java.util.Scanner;

public class AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height of the parallelogram in cm: ");
        int h = sc.nextInt();
        System.out.println("Enter breadth of the parallelogram in cm: ");
        int b = sc.nextInt();
        int area  = b*h;
        System.out.println("Area of the parallelogram is " + area + "sqcm");

    }
}
