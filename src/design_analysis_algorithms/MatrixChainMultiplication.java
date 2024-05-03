package design_analysis_algorithms;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class MatrixChainMultiplication {
    static int[][] dp;
    static int[][] brackets;

    static int matrixChainOrder(int[] p, int i, int j) {
        if (i == j)
            return 0;

        if (dp[i][j] != -1)
            return dp[i][j];

        int min = Integer.MAX_VALUE;
        int bracket = 0;

        for (int k = i; k < j; k++) {
            int temp = matrixChainOrder(p, i, k) + matrixChainOrder(p, k + 1, j) + p[i] * p[k + 1] * p[j + 1];
            if (temp < min) {
                min = temp;
                bracket = k;
            }
        }

        dp[i][j] = min;
        brackets[i][j] = bracket;
        return min;
    }

    static void printOptimalOrder(int[] p, int i, int j) {
        if (i == j) {
            System.out.print("A" + i);
            return;
        }

        System.out.print("(");
        printOptimalOrder(p, i, brackets[i][j]);
        printOptimalOrder(p, brackets[i][j] + 1, j);
        System.out.print(")");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of matrices: ");
        int n = scanner.nextInt();

        int[] p = new int[n + 1];
        System.out.println("Enter the dimensions of the matrices:");
        for (int i = 0; i <= n; i++) {
            p[i] = scanner.nextInt();
        }

        dp = new int[n][n];
        brackets = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }

        System.out.println("Minimum number of scalar multiplications required: " + matrixChainOrder(p, 0, n - 1));
        System.out.print("Optimal order: ");
        printOptimalOrder(p, 0, n - 1);
        System.out.println();
    }
}