package gfgclass.mathematicsmod2;
import java.util.Scanner;


public class SieveOfErasthonesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value for printing Prime Factors: " );
        int a = sc.nextInt();
        primeNums(a);

    }
    public static void primeNums(int n){
        for(int i = 2; i<=n; i++){
            if(primeCheck(i)){
                System.out.println(i); // TimeComplexity - O(n^2) or O(n*sqrt(n))
        }
    }}
    public static boolean primeCheck(int n){
        for(int  i = 2; i* i <= n; i++){
            if(n%i==0) {
                return false;
            }
        }
        return true;
    }
}
