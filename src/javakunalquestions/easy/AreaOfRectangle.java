package javakunalquestions.easy;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height of the rectangle in cm: ");
        int h = sc.nextInt();
        System.out.println("Enter breadth of the rectangle in cm: ");
        int b = sc.nextInt();
        int area  = b*h;
        System.out.println("Area of the rectangle is " + area + "sqcm");

    }
}
