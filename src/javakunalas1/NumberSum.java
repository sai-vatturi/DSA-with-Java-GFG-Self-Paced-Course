package javakunalas1;

import java.util.Scanner;

public class NumberSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        while (true){
            System.out.println("Enter a number to add or 'x' to print sum and exit");
            String input = sc.next();
            if(input.equals("x")){
                break;
            } else{
                int inputNumber = Integer.parseInt(input);
                num += inputNumber;
            }
        }
        System.out.println("Sum of numbers are");
        System.out.println(num);
    }
}