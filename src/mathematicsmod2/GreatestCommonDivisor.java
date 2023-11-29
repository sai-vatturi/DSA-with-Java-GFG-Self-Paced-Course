package mathematicsmod2;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st value: ");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd value: ");
        int num2 = sc.nextInt();
        System.out.println("GCD is: " + getGCD(num1, num2));
        System.out.println("GCD is: " + greatestCommon(num1, num2));
        System.out.println("GCD is: " + getGreatestCD(num1, num2));

    }
    // My Approach & GFG Approach
    static int getGCD(int num1, int num2){
        int temp = Math.min(num1, num2);
//        if(num1>num2){
//            temp = num2;
//        } else {
//            temp = num1;
//        }
        while (temp>0){
            if(num1 % temp == 0 && num2 % temp == 0){
                break;
            } else {
                temp--;
            }
        }
        return temp;
    }

    // Basic Euclidean

    static int greatestCommon(int a, int b){
        while (a!=b){
            if(a>b){
                a =  a - b;
            }
            else {
                b = b - a;
            }
        }
        return a;
    }

    // Optimized Solution

    static int getGreatestCD(int a, int b){
        if(b==0){
            return a;
        }
        else{
            return getGreatestCD(b, a%b);
        }
    }

}
