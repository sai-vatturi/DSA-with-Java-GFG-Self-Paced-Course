package classlectures.daa;
import java.util.ArrayList;
import java.util.Scanner;

public class BruteTSP {
    static int N;
    static int[][] graph;
    static boolean[] visited;
    static int min_path = Integer.MAX_VALUE;
    static ArrayList<Integer> min_path_nodes = new ArrayList<>();

    static void tsp(int vertex, int count, int cost, ArrayList<Integer> path) {
        if (count == N && graph[vertex][0] > 0) {
            if (cost + graph[vertex][0] < min_path) {
                min_path = cost + graph[vertex][0];
                min_path_nodes = new ArrayList<>(path);
            }
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visited[i] && graph[vertex][i] > 0) {
                visited[i] = true;
                path.add(i);
                tsp(i, count + 1, cost + graph[vertex][i], path);
                path.remove(path.size() - 1);
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Directed Weighted Graph,");
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
        ArrayList<Integer> initialPath = new ArrayList<>();
        initialPath.add(0);
        tsp(0, 1, 0, initialPath);

        System.out.println("The minimum cost is " + min_path);
        System.out.println("The path is: ");
        for (int node : min_path_nodes) {
            System.out.print(node + " ");
        }
        System.out.println(0);
    }
}
