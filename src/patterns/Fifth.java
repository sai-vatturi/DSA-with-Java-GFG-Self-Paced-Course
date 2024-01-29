package patterns;

/*
5.  *
    **
    ***
    ****
    *****
    ****
    ***
    **
    *

 */

import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i= 1; i <= 2 * n; i++) {
            int totalColInRow = i > n ? 2 * n - i: i;
            for (int j= 0; j < totalColInRow; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
