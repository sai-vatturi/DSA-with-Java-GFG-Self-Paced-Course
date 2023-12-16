package javakunalclass.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class BasicArrayStringInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of names: ");
        int n =  sc.nextInt();
        String[] names = new String[n];
        //Take Input from user
        for(int i = 0; i < names.length; i++){
            System.out.println("Enter name of Persons " + (i+1));
            names[i]  = sc.next();
        }

        System.out.println(Arrays.toString(names));
    }
}
