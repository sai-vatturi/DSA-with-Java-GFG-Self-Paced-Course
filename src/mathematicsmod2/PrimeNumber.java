package mathematicsmod2;
import java.util.Scanner;

import static mathematicsmod2.PrimeFactors.primeFactors;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find if it is prime or not? ");
        int a = sc.nextInt();
        System.out.println(isPrime(a));
        System.out.println(isPrimeNumber(a));
        System.out.println(isPrimeNum(a));
        primeFactors(5);
    }

    // Naive Method
    public static boolean isPrime(int n){
        if(n==1){
            return false;
        }
        for(int i = 2; i<n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;

    }

    // Efficient Method
    public static boolean isPrimeNumber(int n){
        if(n==1){
            return false;
        }
        for(int i = 2; i*i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    // More Efficient Method
    public static boolean isPrimeNum(int n){
        if(n==1){
            return false;
        }
        if(n==2 || n ==3){
            return true;
        }
        if(n%2==0 || n%3==0){
            return false;
        }
        for(int i = 5; i * i <= n ; i = i + 6){
            if(n%i == 0 || n %(i+2)==0){
                return false;
            }
        }
        return true;
    }
}
