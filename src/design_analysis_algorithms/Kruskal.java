package design_analysis_algorithms;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Kruskal {
    static class Edge {
        int source;
        int destination;
        int weight;
        Edge(int source, int destination, int weight) {
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }
    }

    static int findParent(int[] parent, int i) {
        if (parent[i] == i) {
            return i;
        }
        return findParent(parent, parent[i]);
    }

    static void union(int[] parent, int[] rank, int x, int y) {
        int xRoot = findParent(parent, x);
        int yRoot = findParent(parent, y);

        if (rank[xRoot] < rank[yRoot]) {
            parent[xRoot] = yRoot;
        }
        else if (rank[yRoot] < rank[xRoot]) {
            parent[yRoot] = xRoot;
        }
        else {
            parent[yRoot] = xRoot;
            rank[xRoot]++;
        }
    }

    static void kruskalMST(int vertices, ArrayList<Edge> edges) {
        edges.sort(Comparator.comparingInt(a -> a.weight));

        int[] parent = new int[vertices];
        int[] rank = new int[vertices];
        for (int i = 0; i < vertices; i++) {
            parent[i] = i;
            rank[i] = 0;

        }

        List<Edge> mst = new ArrayList<>();
        int edgeCount = 0;
        int i = 0;

        while (edgeCount < vertices - 1) {
            Edge nextEdge = edges.get(i++);
            int x = findParent(parent, nextEdge.source);
            int y = findParent(parent, nextEdge.destination);

            if (x != y) {
                mst.add(nextEdge);
                union(parent, rank, x, y);
                edgeCount++;
            }
        }
        System.out.println("Edge \t Weight");
        for (Edge edge : mst) {
            System.out.println(edge.source + " - " + edge.destination + "\t" + edge.weight);
        }
    }

    public static void main(String[] args) {
        int V = 4; // Number of vertices
        ArrayList<Edge> edges = new ArrayList<>();
        // Adding edges to the graph
        edges.add(new Edge(0, 1, 10));
        edges.add(new Edge(0, 2, 6));
        edges.add(new Edge(0, 3, 5));
        edges.add(new Edge(1, 3, 15));
        edges.add(new Edge(2, 3, 4));

        kruskalMST(V, edges);
    }
}
