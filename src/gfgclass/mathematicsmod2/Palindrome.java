package gfgclass.mathematicsmod2;

import java.util.Scanner;

public class Palindrome {
    // Iterative Solution
    public static void calculatePalindrome(int n) {
        int rev = 0, temp = n;
        while (n > 0) {
            rev = rev * 10 + (n % 10);
            n /= 10;
        }
        if (rev == temp)
            System.out.println("It is Palindrome");
        else
            System.out.println("Not a Palindrome");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        calculatePalindrome(n);

    }
}
