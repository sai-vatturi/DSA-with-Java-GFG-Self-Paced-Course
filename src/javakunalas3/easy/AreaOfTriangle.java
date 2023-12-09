package javakunalas3.easy;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height of the triangle in cm: ");
        int height = sc.nextInt();
        System.out.println("Enter breadth of the triangle in cm");
        int breadth = sc.nextInt();
        int area =(height * breadth)/2;
        System.out.println("Area of triangle is " + area + "sqcm");
    }
}
