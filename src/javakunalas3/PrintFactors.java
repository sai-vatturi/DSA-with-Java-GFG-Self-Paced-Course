package javakunalas3;

import java.util.Scanner;

public class PrintFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print factors: ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            if(n%i == 0){
                System.out.print(i + " ");
            }
        }
    }

}
