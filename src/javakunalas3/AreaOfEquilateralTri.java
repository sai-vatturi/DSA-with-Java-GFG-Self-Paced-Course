package javakunalas3;

import java.util.Scanner;

public class AreaOfEquilateralTri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side of equilateral triangle: ");
        int a = sc.nextInt();
        double area = Math.sqrt(3)/4 * a * a;
        System.out.println("Area of equilateral triangle is  " +  area);
    }
}
