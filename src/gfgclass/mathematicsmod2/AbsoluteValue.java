package gfgclass.mathematicsmod2;

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        // Basically converting a negative value to positive value

        if(num < 0){
            System.out.println(num * -1);
        }
        else{
            System.out.println(num);
        }
    }
}
