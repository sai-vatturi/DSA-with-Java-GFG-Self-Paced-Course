package oops.ex1;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(n+ " is " + (isArmstrong(n) ? "an Armstrong Number" : "not an Armstrong Number")); ;

    }

    public static boolean isArmstrong(int n) {
        int digits = (int) (Math.floor(Math.log10(n)) + 1);
        int result = 0;
        int N = n;
        while (N > 0) {
            int digit = N % 10;
            result += Math.pow(digit, digits);
            N /= 10;
        }
        return result == n;
    }
}
