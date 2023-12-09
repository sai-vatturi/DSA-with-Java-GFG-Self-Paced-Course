package javakunalas3;

import java.util.Scanner;

public class SunTillX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        while (true){
            System.out.println(n);
            System.out.println("Enter another number to add or press 0 to exit: ");
            int val = sc.nextInt();
            if(val==0){
                System.out.println("last total: " + n);
                break;
            } else{
                n += val;
            }
        }
    }
}
