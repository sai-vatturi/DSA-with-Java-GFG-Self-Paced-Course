package javakunalas3.easy;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius of the Circle: ");
        double r = sc.nextInt();
        double pi = 3.141;
        double area = pi * (r*r);
        System.out.println("Area of circle is : " + area);

    }
}
