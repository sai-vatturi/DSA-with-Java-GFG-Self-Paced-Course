package javakunalas3.easy;

import java.util.Scanner;

public class PerimeterOfEquilateralTri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side: ");
        int side = sc.nextInt();
        int per = 3 * side;
        System.out.println("Perimeter of triangle is: " +  per);

    }
}
