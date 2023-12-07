package javakunalas2;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter operation(+, -, *, /");
        String op = sc.next();
        System.out.println("Enter 1st number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter  2nd number");
        int num2 = sc.nextInt();
        System.out.println("Output: " + simpleCalc(op, num1, num2));

    }
    static int simpleCalc(String operator, int a, int b){
        return switch (operator) {
            case "+" -> (a + b);
            case "-" -> (a - b);
            case "*" -> (a * b);
            case "/" -> (a / b);
            default -> 0;
        };
    }
}
