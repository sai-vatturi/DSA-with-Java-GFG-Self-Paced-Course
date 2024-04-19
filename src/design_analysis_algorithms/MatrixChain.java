package design_analysis_algorithms;

import java.util.Arrays;

public class MatrixChain {
    static int[][] dp = new int[100][100];

    static int matrixChain(int[] p, int i, int j) {
        if (i == j) {
            return 0;
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        dp[i][j] = Integer.MAX_VALUE;
        for (int k = i; k < j; k++) {
            dp[i][j] = Math.min(
                    dp[i][j], matrixChain(p, i, k) + matrixChain(p, k + 1, j) + p[i - 1] * p[k] * p[j]);
        }
        return dp[i][j];
    }

    static int matrixChainOrder(int[] p, int n) {
        int i = 1, j = n - 1;
        return matrixChain(p, i, j);
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 30};
        int n = arr.length;
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        System.out.println("Minimum number of multiplications is " + matrixChainOrder(arr, n));
    }
}
