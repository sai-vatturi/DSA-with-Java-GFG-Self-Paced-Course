import java.util.*;

public class Mainn {
    static int N;
    static int[][] graph;
    static boolean[] visited;
    static int min_path = Integer.MAX_VALUE;

    static void tsp(int vertex, int count, int cost) {
        if (count == N && graph[vertex][0] > 0) {
            min_path = Math.min(min_path, cost + graph[vertex][0]);
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visited[i] && graph[vertex][i] > 0) {
                visited[i] = true;
                tsp(i, count + 1, cost + graph[vertex][i]);
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of vertices:");
        N = scanner.nextInt();
        graph = new int[N][N];
        visited = new boolean[N];
        System.out.println("Enter the adjacency matrix:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                graph[i][j] = scanner.nextInt();
            }
        }
        visited[0] = true;
        tsp(0, 1, 0);
        System.out.println("The minimum cost is " + min_path);
    }
}