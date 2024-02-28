package javakunalquestions.javakunalas2;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find armstrong or not: ");
        int n = sc.nextInt();
        System.out.println("Number of digits are: ");
        System.out.println(getDigits(n));
        int armstrong = findArmstrong(n);
        System.out.println("Sum is " + armstrong);
        if(n==armstrong){
            System.out.println("Hence, it is armstrong number");
        } else{
            System.out.println("It is not an armstrong number");
        }

    }

    public static int findArmstrong(int n){
        int count = getDigits(n);
        int sum = 0;
        while(n>0){
            sum = (int) (sum + Math.pow(n%10, count));
            n = n/10;
        }
        return sum;
    }

    public static int findDigits(int n){
        int count = 0;
        while(n>0){
            n = n/10;
            count++;
        }
        return count;
    }

    public static int getDigits(int n){
        return (int) Math.log10(n) + 1;
    }
}
