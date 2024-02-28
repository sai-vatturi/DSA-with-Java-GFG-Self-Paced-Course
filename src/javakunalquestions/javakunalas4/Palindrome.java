package javakunalquestions.javakunalas4;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(isPalindrome(num));
    }
    public static boolean isPalindrome(int number){
        int originalNumber = number;
        int reversedNumber = 0;
        while(number > 0){
            int digit = number % 10;
            reversedNumber = reversedNumber*10 + digit;
            number = number / 10;
        }
        return originalNumber == reversedNumber;
    }
}
