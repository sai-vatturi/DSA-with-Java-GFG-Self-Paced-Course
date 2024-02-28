package gfgclass.mathematicsmod2;

import java.util.Scanner;

public class LeastCommonMultiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st value: ");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd value: ");
        int num2 = sc.nextInt();
        System.out.println("LCM is: " + getLCM(num1, num2));
        System.out.println("LCM is: " + lcm(num1, num2));

    }

    //My Approach
    static int getLCM(int a, int b) {
        int temp = Math.max(a, b);
        while (temp>0){
            if(temp % a == 0 && temp % b == 0){
                break;
            }
            else{
                temp++;
            }
        }
        return temp;
    }

    //TC: O(a*b-max(a,b)

    // Optimized Solution based on Euclid's Algo
    static int gcd(int a, int b){
        if(b==0){
            return a;
        }
        else{
            return gcd(b, a%b);
        }
    }

    static  int lcm(int a, int b){
        return (a*b)/gcd(a, b);
    }

    // Tc : log(min(a,b))

}



