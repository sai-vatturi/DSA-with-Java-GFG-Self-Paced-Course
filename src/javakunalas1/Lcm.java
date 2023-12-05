package javakunalas1;

import java.util.Scanner;

public class Lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2 ");
        int num2 = sc.nextInt();
        System.out.println(leastCommonMultiple(num1, num2));
        System.out.println(euclidLCM(num1, num2));

    }
    // Brute Force Solution O(a*b-max(a,b))
    static int leastCommonMultiple(int a, int b){
        int max = Math.max(a, b);
        while (max % a != 0 || max % b != 0) {
            max++;
        }
        return max;
    }
    // Euclid's Solution
    // LCM(a,b) * GCD(a,b) = a * b
    /*
    Find Euclid's GCD
    return LCM from the above formula
     */
    static int euclidLCM(int a, int b){
        return (a*b)/euclidGCD(a,b);
    }
    static int euclidGCD(int a, int b){
        if(b == 0) {
            return a;
        }else{
            return euclidGCD(b, a%b);
        }
    }
}
