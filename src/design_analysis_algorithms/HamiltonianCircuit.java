package design_analysis_algorithms;

import java.util.Scanner;

class HamiltonianCircuit {
    int V;
    int path[];

    boolean isSafe(int v, int graph[][], int path[], int pos) {
        if (graph[path[pos - 1]][v] == 0)
            return false;

        for (int i = 0; i < pos; i++)
            if (path[i] == v)
                return false;

        return true;
    }

    boolean hamCycleUtil(int graph[][], int path[], int pos) {
        if (pos == V) {
            if (graph[path[pos - 1]][path[0]] == 1)
                return true;
            else
                return false;
        }

        for (int v = 1; v < V; v++) {
            if (isSafe(v, graph, path, pos)) {
                path[pos] = v;

                if (hamCycleUtil(graph, path, pos + 1))
                    return true;

                path[pos] = -1;
            }
        }

        return false;
    }

    int hamCycle(int graph[][]) {
        path = new int[V];
        for (int i = 0; i < V; i++)
            path[i] = -1;

        path[0] = 0;
        if (hamCycleUtil(graph, path, 1) == false) {
            System.out.println("\nSolution does not exist");
            return 0;
        }

        printSolution(path);
        return 1;
    }

    void printSolution(int path[]) {
        System.out.println("Solution Exists: Following" +
                " is one Hamiltonian Cycle");
        for (int i = 0; i < V; i++)
            System.out.print(" " + path[i] + " ");

        System.out.println(" " + path[0] + " ");
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        HamiltonianCircuit hamiltonian = new HamiltonianCircuit();

        System.out.println("Enter the number of vertices:");
        hamiltonian.V = scanner.nextInt();

        int graph[][] = new int[hamiltonian.V][hamiltonian.V];

        System.out.println("Enter the adjacency matrix for the graph:");
        for (int i = 0; i < hamiltonian.V; i++) {
            for (int j = 0; j < hamiltonian.V; j++) {
                graph[i][j] = scanner.nextInt();
            }
        }

        hamiltonian.hamCycle(graph);
    }
}
