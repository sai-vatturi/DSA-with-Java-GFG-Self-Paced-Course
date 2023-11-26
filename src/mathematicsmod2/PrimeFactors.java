package mathematicsmod2;
import java.util.Scanner;
public class PrimeFactors {

    public static void primeFactors(int n) {
        if (n == 1) {
            System.out.println("There are no prime factors in 1.");
        } else {
            for (int i = 2; i*i < n; i++) {
                while(n%i == 0){
                    System.out.println(i);
                    n = n/i;
                }
            }
            System.out.println(n);

    }}


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value: ");
        int n  = sc.nextInt();
        primeFactors(n);
    }
}
