package pat_training;

import java.util.Scanner;

// Given a number N, the task is to split the Num into multiple parts in such a fashion as to find the highest product.
public class MaxMulProd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Ip 6, Op 9
        int maxProd = 1;
        if (n == 2) {
            System.out.println(2);
        }
        else if (n == 3) {
            System.out.println(2);
        }
        else if (n == 4) {
            System.out.println(4);
        }
        else {
            while (n > 4) {
                maxProd *= 3;
                n -= 3;
            }
            System.out.println(maxProd * n);
        }
    }
}
