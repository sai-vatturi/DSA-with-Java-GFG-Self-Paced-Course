package javakunalas3.easy;

import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length");
        int len = sc.nextInt();
        System.out.println("Enter breadth: ");
        int bre = sc.nextInt();
        int perimeter = 2 * (len + bre);
        System.out.println("Perimeter of rectangle is: " +  perimeter);
    }
}
