package classlectures.daa;

import java.util.Arrays;
import java.util.Scanner;

public class DpTSP {
    static int N;
    static int[][] graph;
    static int[][] dp;
    static int[][] path;
    static int final_mask;

    static int tsp(int mask, int pos) {
        if (mask == final_mask) {
            return graph[pos][0];
        }

        if (dp[mask][pos] != -1) {
            return dp[mask][pos];
        }

        int ans = Integer.MAX_VALUE;
        int nextNode = -1;

        for (int i = 0; i < N; i++) {
            if ((mask & (1 << i)) == 0) {
                int newAns = graph[pos][i] + tsp(mask | (1 << i), i);

                if (newAns < ans) {
                    ans = newAns;
                    nextNode = i;
                }
            }
        }
        path[mask][pos] = nextNode;
        return dp[mask][pos] = ans;
    }

    static void printPath(int mask, int pos) {
        int nextNode = path[mask][pos];

        if (nextNode == 0) {
            System.out.print(" -> 0");
            return;
        }

        System.out.print(" -> " + nextNode);
        printPath(mask | (1 << nextNode), nextNode);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of vertices:");
        N = scanner.nextInt();
        graph = new int[N][N];
        dp = new int[1 << N][N + 1];
        path = new int[1 << N][N + 1];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        final_mask = (1 << N) - 1;

        System.out.println("Enter the adjacency matrix:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                graph[i][j] = scanner.nextInt();
            }
        }

        int minCost = tsp(1, 0);

        System.out.println("The minimum cost is " + minCost);
        System.out.print("The path is: 0");
        printPath(1, 0);
        System.out.println();
    }
}
