import java.util.*;
public class PrimsMST {

    // Find the vertex with the minimum key value
    private static int minKey(int[] key, boolean[] mstSet, int V) {
        int min = Integer.MAX_VALUE, minIndex = -1;

        for (int v = 0; v < V; v++) {
            if (!mstSet[v] && key[v] < min) {
                min = key[v];
                minIndex = v;
            }
        }
        return minIndex;
    }

    // Print MST
    private static void printMST(int[] parent, int[][] graph, int V) {
        int total = 0;
        System.out.println("Minimum Spanning Tree (Prim):");
        System.out.println("Edge   Weight");

        for (int i = 1; i < V; i++) {
            System.out.println(parent[i] + " - " + i + "    " + graph[i][parent[i]]);
            total += graph[i][parent[i]];
        }

        System.out.println("Total Cost: " + total);
    }

    // Prim’s algorithm
    public static void primMST(int[][] graph, int V) {
        int[] parent = new int[V];   // Tree structure
        int[] key = new int[V];      // Minimum weights
        boolean[] mstSet = new boolean[V]; // Included in MST?

        Arrays.fill(key, Integer.MAX_VALUE);
        key[0] = 0;
        parent[0] = -1;  // First node is root

        for (int count = 0; count < V - 1; count++) {
            int u = minKey(key, mstSet, V);
            mstSet[u] = true;

            for (int v = 0; v < V; v++) {
                if (graph[u][v] != 0 && !mstSet[v] && graph[u][v] < key[v]) {
                    parent[v] = u;
                    key[v] = graph[u][v];
                }
            }
        }

        printMST(parent, graph, V);
    }

    public static void main(String[] args) {
        int V = 5; // number of vertices

        int[][] graph = {
            {0, 2, 0, 6, 0},
            {2, 0, 3, 8, 5},
            {0, 3, 0, 0, 7},
            {6, 8, 0, 0, 9},
            {0, 5, 7, 9, 0}
        };

        primMST(graph, V);
    }
}