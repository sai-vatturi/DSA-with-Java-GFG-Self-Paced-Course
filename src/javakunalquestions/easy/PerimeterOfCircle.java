package javakunalquestions.easy;

import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of circle:  ");
        int r = sc.nextInt();
        double pi = 3.14;
        System.out.println("Perimeter of Circle is " + (2*pi*r));
    }
}
