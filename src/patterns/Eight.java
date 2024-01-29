package patterns;

import java.util.Scanner;

/*
8.      *
       ***
      *****
     *******
    *********
 */
public class Eight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i - 1; j++){
                System.out.print("*");
            }
            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
