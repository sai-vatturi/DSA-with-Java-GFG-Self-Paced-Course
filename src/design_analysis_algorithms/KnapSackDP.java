package design_analysis_algorithms;

public class KnapSackDP {
    public static void main(String[] args) {
        int[] weights = {11, 12, 13};
        int[] values = {70, 20, 50};
        int maxWeight = 30;
        int n = values.length;
        knapsackDP(maxWeight, weights, values, n);
    }

    static int findMax(int n1, int n2) {
        if (n1 > n2) {
            return n1;
        }
        return n2;
    }

    static void knapsackDP(int maxWeight, int[] weights, int[] values, int n) {
        int[][] dp = new int[n + 1][maxWeight + 1];
        for (int i = 0; i <= n; i++) {
            for (int w = 0; w <= maxWeight; w++) {
                if (i == 0 || w == 0) {
                    dp[i][w] = 0;
                }
                else if (weights[i - 1] <= w) {
                    dp[i][w] = findMax(values[i-1] + dp[i-1][w-weights[i-1]], dp[i-1][w]);
                }
                else {
                    dp[i][w] = dp[i-1][w];
                }
            }
        }
        System.out.println("Maximum weight of knapsack is " + dp[n][maxWeight]);
    }
}
