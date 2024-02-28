package gfgclass.mathematicsmod2;

import java.util.Scanner;

public class ComputePower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int x  = sc.nextInt();
        System.out.println("Enter power");
        int n = sc.nextInt();
        System.out.println(getPower(x, n));
        System.out.println(fetchPower(x, n));

    }

    // Naive Solution
    public static int getPower(int x, int n){
        int a = x;
        while (n > 1) {
            x = x * a;
            n--;
        }
        return x;
    }


    //Efficient Solution
    public static int fetchPower(int x , int n){
        if(n == 0){
            return 1;
        }
        int temp = fetchPower(x, n/2);
        temp = temp * temp;
        if(n%2 == 0)
            return temp;
        else
            return temp*x; // Time Complexity - O(log n)
    }
}
