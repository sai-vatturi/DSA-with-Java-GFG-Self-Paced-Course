package javakunalas1;

import java.util.Scanner;

public class Hcf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2 ");
        int num2 = sc.nextInt();
        System.out.println(highestCommonFactor(num1, num2));
        System.out.println(gcdEuclid(num1, num2));
        System.out.println(getGabriel(num1, num2));
        System.out.println(euclidOptimized(num1, num2));

    }
    // Bruteforce Solutions O(min(a,b))
    static int highestCommonFactor(int num1, int num2){
        int min = Math.min(num1, num2);
        while(min>0){
            if(num1 % min == 0   && num2 % min == 0){
                return min;
            } else{
                min--;
            }
        }
        return 1;
    }
    // Euclid's Algorithm  O(max(a,b))
    /*
    Find the larger number
    replace larger number by diff bw larger and smaller number
    repeat step1 & step2 until both numbers become equal
    return any one number
     */
    static int gcdEuclid(int a, int b){
        while(a!=b){
            if(a>b){
                a = a-b;
            } else{
                b = b - a;
            }
        }
        return a;
    }
    /*
    Gabriel Lame's Algorithm (Optimized Euclid's) O(log(min(a,b)))
     Extension of Euclid's algorithm
     Instead of subtracting, divide and put the remainder with larger number
     The moment one of the number becomes zero, stop
     return the larger number
     */
     static int getGabriel(int a, int b){
         while(a!=0 & b!= 0){
             if(a>b){
                 a = a % b;
             }
             else{
                 b = b % a;
             }
         }
         return Math.max(a,b);
     }
     //
    // Gabriel Lame's
    static int euclidOptimized(int a, int b){
         if(b==0)
             return a;
         else
             return euclidOptimized(b, a%b);
    }
}
