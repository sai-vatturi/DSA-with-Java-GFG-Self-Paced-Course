package javakunalas4;

import java.util.Scanner;

public class VoteVerify {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  your age: ");
        int a = sc.nextInt();
        boolean result = isVoterEligible(a);
        if(result){
            System.out.println("Voter is Eligible");
        }else{
            System.out.println("Sorry, unable to eligible! ");
        }
    }
    public static boolean isVoterEligible(int age){
        return age >= 18;
    }
}
