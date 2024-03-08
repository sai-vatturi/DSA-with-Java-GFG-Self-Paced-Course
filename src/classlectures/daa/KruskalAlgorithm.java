package classlectures.daa;

import java.util.*;

class KruskalAlgorithm {

    static int V;
    static int[] parent;
    static int INF = Integer.MAX_VALUE;

    // Find set of vertex i
    static int find(int i) {
        while (parent[i] != i)
            i = parent[i];
        return i;
    }

    // Does union of i and j. It returns
    // false if i and j are already in same
    // set.
    static void union1(int i, int j) {
        int a = find(i);
        int b = find(j);
        parent[a] = b;
    }

    // Finds MST using Kruskal's algorithm
    static void kruskalMST(int cost[][]) {
        int mincost = 0; // Cost of min MST.

        // Initialize sets of disjoint sets.
        for (int i = 0; i < V; i++)
            parent[i] = i;

        // Include minimum weight edges one by one
        int edge_count = 0;
        while (edge_count < V - 1) {
            int min = INF, a = -1, b = -1;
            for (int i = 0; i < V; i++) {
                for (int j = 0; j < V; j++) {
                    if (find(i) != find(j) && cost[i][j] < min) {
                        min = cost[i][j];
                        a = i;
                        b = j;
                    }
                }
            }

            union1(a, b);
            System.out.printf("Edge %d:(%d, %d) cost:%d \n", edge_count++, a, b, min);
            mincost += min;
        }
        System.out.printf("\n Minimum cost= %d \n", mincost);
    }

    // Driver code
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of vertices in the graph: ");
        V = scanner.nextInt();

        parent = new int[V];
        int[][] cost = new int[V][V];

        System.out.println("Enter the adjacency matrix (use 0 for INF):");
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                cost[i][j] = scanner.nextInt();
                if (cost[i][j] == 0) {
                    cost[i][j] = INF;
                }
            }
        }

        // Print the solution
        kruskalMST(cost);

        scanner.close();
    }
}

