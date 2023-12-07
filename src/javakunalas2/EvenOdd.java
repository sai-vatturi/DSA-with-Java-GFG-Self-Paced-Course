package javakunalas2;


import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find Even or Odd: ");
        int n = sc.nextInt();
        if(n % 2 == 0){
            System.out.println(n+ " is an Even Number");
        } else{
            System.out.println(n + " is an Odd Number");
        }
    }
}
