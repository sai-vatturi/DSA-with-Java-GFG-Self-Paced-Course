package patterns;

import java.util.Scanner;

/*
7.   *****
      ****
       ***
        **
         *
 */
public class Seventh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= 5; i++) {
            for (int j = i - 1; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = n - (i - 1); j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
