package pat_training;
import java.util.Scanner;

public class FindFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while (n != 0) {
            int factor = 0;
            for (int i = n - 1 ; i >= 1; i--) {
                if (n % i == 0) {
                    factor = i;
                    break;
                }
            }
            if (n == 1) {
                n = 0;
            }
            else {
                n = n - factor;

            }
            count += 1;
        }
        System.out.println(count);
    }
}