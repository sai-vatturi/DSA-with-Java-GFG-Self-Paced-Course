//import java.util.*;
//
//class Edge {
//    int destination;
//    int weight;
//
//    public Edge(int destination, int weight) {
//        this.destination = destination;
//        this.weight = weight;
//    }
//}
//
//class Graph {
//    int V;
//
//    ArrayList<LinkedList<Edge>> adj;
//
//    public Graph(int v) {
//        this.V = v;
//        adj = new ArrayList<>();
//        for (int i = 0; i < v; i++) {
//            adj.add(new LinkedList<>());
//        }
//    }
//
//    public void addEdge(int v, int u, int weight) {
//        adj.get(v).add(new Edge(u, weight));
//        adj.get(u).add(new Edge(v, weight));
//    }
//}
//
//public class Main {
////
////    public static List<Edge> primMST(Graph graph, int start) {
////        List<Edge> mstSet = new ArrayList<Edge>();
////
////        boolean visited = new boolean[graph.V];
////
////        PriorityQueue pq = new PriorityQueue(Comparator.comparingInt(e -> e.weight));
////
////        pq.offer(new Edge(start, 0));
////        int totalWeight = 0;
////
////        while (!pq.isEmpty()) {
////            Edge minEdge = pq.poll();
////
////            int curVertex = minEdge.destination;
////
////            if (!visited[curVertex]) {
////                visited[curVertex] = true;
////                totalWeight += minEdge.weight;
////                mst.addEdge(minEdge);
////
////                for (Edge neighbour : graph.adj.get.(curVertex)) {
////                    if (!visited[neighbour.destination]) {
////                        pq.offer(neighbour);
////                    }
////                }
////            }
////        }
////        System.out.println(totalWeight);
////        return mst;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int vertices = sc.nextInt();
//        int edges = sc.nextInt();
//
////        Graph g = new Graph(vertices);
//
//        for (int i = 0; i < edges; i++) {
//            int start = sc.nextInt();
//            int destination = sc.nextInt();
//            int weight = sc.nextInt();
//
////            g.addEdge(start, destination, weight);
//        }
//
//        int startVertex = 0;
//
//
////        List<Edge> result = primMST(g, startVertex);
//
//
//    }
//}
