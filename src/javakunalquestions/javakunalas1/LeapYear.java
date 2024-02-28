package javakunalquestions.javakunalas1;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check leap year or not?");
        int n = sc.nextInt();
        if(n % 4 == 0 && n % 100 != 0 || n % 400 == 0)
            System.out.println("The year " + n  + " is a leap year");
        else
            System.out.println("The year " + n  + " not a leap year");
    }
}
