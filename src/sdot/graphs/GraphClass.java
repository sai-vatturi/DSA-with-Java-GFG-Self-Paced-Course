package sdot.graphs;

import java.util.*;

class Graph {
    int V;
    ArrayList<List<Integer>> adj;

    Graph(int v) {
        this.V = v;
        adj = new ArrayList<>();

        for (int i = 0; i < v; i++) {
            adj.add(i, new LinkedList<Integer>());
        }
    }

    void addEdge(int v, int u) {
        adj.get(v).add(u);
        adj.get(u).add(v);
    }

    void dfs() {
        boolean[] visited = new boolean[V];
        dfsUtil(0, visited);
    }

    void dfsUtil(int vertex, boolean[] visited) {
        visited[vertex] = true;
        System.out.print(vertex + " ");
        int neghbourVertex = 0;
        for (int i = 0; i < adj.get(vertex).size(); i++) {
            neghbourVertex = adj.get(vertex).get(i);
            if (!visited[neghbourVertex]) {
                dfsUtil(neghbourVertex, visited);
            }
        }
    }
}

class GraphClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of vertices");
        int n = sc.nextInt();
        System.out.println("Enter number of edges: ");
        int m = sc.nextInt();

        Graph g = new Graph(n);

        for (int i = 0; i < m; i++) {
            int source = sc.nextInt();
            int destination = sc.nextInt();
            g.addEdge(source, destination);
        }

        System.out.println("Adjacency List representation:");
        for (int i = 0; i < n; i++) {
            System.out.print("Vertex " + i + ": ");
            for (int neighbor : g.adj.get(i)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }

        g.dfs();
    }
}
