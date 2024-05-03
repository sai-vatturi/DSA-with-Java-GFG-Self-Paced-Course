package design_analysis_algorithms;

import java.util.Scanner;

public class GraphColoring {
    private static int V; // Number of vertices
    private static int[][] graph; // Adjacency matrix
    private static int[] colorAssigned; // Array to store assigned colors

    // Function to check if assigning a color to a vertex is safe
    private static boolean isSafe(int v, int color) {
        for (int i = 0; i < V; i++) {
            if (graph[v][i] == 1 && color == colorAssigned[i]) {
                return false;
            }
        }
        return true;
    }

    // Backtracking function to solve the Graph Coloring Problem
    private static boolean graphColoringUtil(int v) {
        if (v == V) {
            return true;
        }

        // Try assigning all colors to the current vertex
        for (int color = 1; color <= V; color++) {
            if (isSafe(v, color)) {
                colorAssigned[v] = color;

                // Recurse for the next vertex
                if (graphColoringUtil(v + 1)) {
                    return true;
                }

                // If the assigned color doesn't lead to a solution, backtrack
                colorAssigned[v] = 0;
            }
        }

        return false;
    }

    // Main function to solve the Graph Coloring Problem
    private static boolean graphColoring() {
        // Initialize all vertices as unassigned
        for (int i = 0; i < V; i++) {
            colorAssigned[i] = 0;
        }

        // Call the backtracking function to find a solution
        if (!graphColoringUtil(0)) {
            System.out.println("Solution does not exist");
            return false;
        }

        // Print the assigned colors
        printSolution();
        return true;
    }

    // Function to print the assigned colors
    private static void printSolution() {
        System.out.println("Solution exists, and the assigned colors are:");
        for (int i = 0; i < V; i++) {
            System.out.printf("Vertex %d: Color %d\n", i + 1, colorAssigned[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of vertices: ");
        V = scanner.nextInt();

        graph = new int[V][V];
        colorAssigned = new int[V];

        System.out.println("Enter the adjacency matrix:");
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                graph[i][j] = scanner.nextInt();
            }
        }

        scanner.close();

        graphColoring();
    }
}