package classlectures.daa;
import java.util.Scanner;

class FloydWarshall {
    final static int INF = 9999;

    void floydWarshall(int graph[][]) {
        int nV = graph.length;
        int dp[][] = new int[nV][nV];
        int i, j, k;

        for (i = 0; i < nV; i++)
            for (j = 0; j < nV; j++)
                dp[i][j] = graph[i][j];

        for (k = 0; k < nV; k++) {
            for (i = 0; i < nV; i++) {
                for (j = 0; j < nV; j++) {
                    if (dp[i][k] + dp[k][j] < dp[i][j])
                        dp[i][j] = dp[i][k] + dp[k][j];
                }
            }
        }
        printMatrix(dp);
    }

    void printMatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[i].length; ++j) {
                if (matrix[i][j] == INF)
                    System.out.print("INF ");
                else
                    System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of vertices: ");
        int nV = scanner.nextInt();

        int graph[][] = new int[nV][nV];

        System.out.println("Enter the adjacency matrix (row-wise) (Enter 9999 inplace of INF):");
        for (int i = 0; i < nV; i++) {
            for (int j = 0; j < nV; j++) {
                graph[i][j] = scanner.nextInt();
            }
        }

        FloydWarshall a = new FloydWarshall();
        System.out.println("Shortest distances between all pairs of vertices:\n");
        a.floydWarshall(graph);
        scanner.close();
    }
}
