package javakunalas3;


import java.util.Scanner;

//Take integer inputs till the user enters 0 and print the largest number from all.
public class LargestTillX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, max = 0;
        while (true){
            System.out.println("Enter number: ");
            num = sc.nextInt();
            if(num != 0){
                if(num > max){
                    max = num;
                }
            } else if(num == 0){
                System.out.println("Maximum number is: " + max);
                break;
            } else{
                System.out.println("Invalid Input");
            }
        }
    }
}
