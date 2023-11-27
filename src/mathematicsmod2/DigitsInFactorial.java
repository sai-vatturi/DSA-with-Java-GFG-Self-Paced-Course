package mathematicsmod2;
import java.util.Scanner;


public class DigitsInFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. to calculate Factorial: ");
        int fact = sc.nextInt();
        System.out.println(digitsInFactorial(fact));
    }

    public static int digitsInFactorial(int n){
        if(n==0){
            return 0;
        }
        if(n<=1){
            return 1;
        }
            double digits = 0;
            for (int i = 2; i <= n; i++)
                digits += Math.log10(i);

            return (int)(Math.floor(digits)) + 1;
        }
    }

