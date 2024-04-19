package design_analysis_algorithms;

public class Floyd {
    static final int INF = Integer.MAX_VALUE;
    public static void main(String[] args) {
        int graph[][] =
                {   {0,   3,  INF, 7},
                    {8, 0,   2, INF},
                    {5, INF, 0,   1},
                    {2, INF, INF, 0}
                };
        int V = graph.length;

        floydWarshall(graph, V);
    }

    static void floydWarshall(int[][] graph, int V) {
        int[][] dp =  new int[V][V];
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                dp[i][j] = graph[i][j];
            }
        }
        for (int k = 0; k < V; k++) {
            for (int i = 0; i < V; i++) {
                for (int j = 0; j < V; j++) {
                    if (dp[i][k] != INF && dp[k][j] != INF) {
                        dp[i][j] = Math.min(dp[i][j], dp[i][k] + dp[k][j]);
                        }
                }
            }
        }
        System.out.println("Shortest distances between every pair of vertices:");
        for (int i = 0; i < V; ++i) {
            for (int j = 0; j < V; ++j) {
                if (dp[i][j] == INF)
                    System.out.print("INF ");
                else
                    System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
    }
}
