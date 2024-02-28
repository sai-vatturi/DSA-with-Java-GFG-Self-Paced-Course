package javakunalquestions.intermediate;

import java.util.Scanner;

public class NCRnpr {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        System.out.println("Enter r");
        int r =  sc.nextInt();
        int ncr = getFact(n)/(getFact(n-r)*getFact(r));
        int npr = getFact(n)/getFact(n-r);
        System.out.println("Ncr is " +  ncr);
        System.out.println("Npr is " + npr);
    }
    public static int getFact(int n){
        if(n<=0){
            return 0;
        }
        int fact = 1;
        for(int i = 2; i <= n; i++){
            fact = fact * i;
        }
        return fact;
    }
}
