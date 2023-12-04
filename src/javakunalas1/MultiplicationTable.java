package javakunalas1;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        System.out.println("Enter number of multiples: ");
        int n = sc.nextInt();
        System.out.println("MULTIPLICATION TABLE FOR " +a);
        for(int i = 1; i <= n; i++){
            System.out.println(a + " x " + i + " = " + (a*i));
        }
    }
}
