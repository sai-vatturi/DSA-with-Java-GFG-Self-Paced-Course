package javakunalquestions.javakunalas2;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String val = sc.next();
        System.out.println(findPalindrome(val));

    }

    public static boolean findPalindrome(String name){
        int nameLength = name.length();
        for(int i = 0; i<nameLength-1; i++){
            if(name.charAt(i) != name.charAt(nameLength-(i+1))){
                return false;
            }
        }
        return true;
    }
}
