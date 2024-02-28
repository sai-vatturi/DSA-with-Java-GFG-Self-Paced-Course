package gfgclass.mathematicsmod2;

import java.util.Scanner;

public class Factorial {

    public static int calculateFactorial(int n){
        if(n==1 || n==0)
            return 1;
        return n*calculateFactorial(n-1);
    }

    public static  int calcFactorial(int n){
        int res=1;
        for(int i=2; i<=n; i++){
            res = res*i;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = 1.8_2_3;
        System.out.println(num);
        int n = sc.nextInt();
        System.out.println("Factorial is: " +calculateFactorial(n));
        System.out.println("Factorial is: " +calcFactorial(n));

    }
}
