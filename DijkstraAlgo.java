import java.util.*;
public class DijkstraAlgo {

    // Find vertex with minimum distance value
    private static int minDistance(int[] dist, boolean[] visited, int V) {
        int min = Integer.MAX_VALUE, minIndex = -1;

        for (int v = 0; v < V; v++) {
            if (!visited[v] && dist[v] < min) {
                min = dist[v];
                minIndex = v;
            }
        }
        return minIndex;
    }

    // Print result
    private static void printSolution(int[] dist, int V) {
        System.out.println("Vertex \t Distance from Source");
        for (int i = 0; i < V; i++) {
            System.out.println(i + "\t\t" + dist[i]);
        }
    }

    // Dijkstra’s Algorithm
    public static void dijkstra(int[][] graph, int src, int V) {
        int[] dist = new int[V];           // shortest distance from src
        boolean[] visited = new boolean[V]; // visited nodes

        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        for (int count = 0; count < V - 1; count++) {
            int u = minDistance(dist, visited, V);
            visited[u] = true;

            for (int v = 0; v < V; v++) {
                if (!visited[v] && graph[u][v] != 0 &&
                    dist[u] != Integer.MAX_VALUE &&
                    dist[u] + graph[u][v] < dist[v]) {

                    dist[v] = dist[u] + graph[u][v];
                }
            }
        }

        printSolution(dist, V);
    }

    public static void main(String[] args) {
        int V = 6;

        int[][] graph = {
            {0, 4, 0, 0, 0, 0},
            {4, 0, 8, 0, 0, 0},
            {0, 8, 0, 7, 0, 4},
            {0, 0, 7, 0, 9, 14},
            {0, 0, 0, 9, 0, 10},
            {0, 0, 4, 14, 10, 0}
        };

        int source = 0;
        dijkstra(graph, source, V);
    }
}