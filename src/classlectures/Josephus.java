package classlectures;

import java.util.Scanner;

public class Josephus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value: " );
        int n = sc.nextInt();
        System.out.println("Enter k value: ");
        int k = sc.nextInt();
        System.out.println("The safe position is " + getPosition(n, k));

    }
    public static int getPosition(int n, int k) {
        int res = n;
        int ans = 0;
        while (k < n) {
            ans = ans + k;
        }
        return ans + 1;
    }
}
