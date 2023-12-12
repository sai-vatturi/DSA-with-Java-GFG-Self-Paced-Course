package javakunalas32.intermediate;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String reversedName = "";
        int nameLength = name.length();
        for(int i = 0; i < nameLength; i++){
            reversedName += name.charAt(nameLength-(i+1));
        }
        System.out.println(reversedName);
    }

}
