package pat_training;
import java.util.Scanner;

public class HolidaysAcceptance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the values of N and k
        int N = sc.nextInt();
        int k = sc.nextInt();

        // Read the array A
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        // Convert the array A into binary representation with base k
        boolean possible = true;
        for (int i = 0; i < N; i++) {
            int current = A[i];
            while (current > 0) {
                int remainder = current % k;
                if (remainder > 1) {
                    possible = false;
                    break;
                }
                current /= k;
            }
            if (!possible) break;
        }

        // Output the result
        if (possible) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}
