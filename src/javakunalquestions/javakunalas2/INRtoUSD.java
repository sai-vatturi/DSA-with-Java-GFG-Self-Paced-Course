package javakunalquestions.javakunalas2;

import java.util.Scanner;

public class INRtoUSD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount in INR: ");
        double inr = sc.nextDouble();
        double usd = inr*83.35;
        System.out.println("Amount in USD is: " +  usd);
    }
}
