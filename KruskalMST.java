import java.util.*;
class Edge implements Comparable<Edge> {
    int src, dest, weight;

    public Edge(int src, int dest, int weight) {
        this.src = src;
        this.dest = dest;
        this.weight = weight;
    }
    @Override
    public int compareTo(Edge other) {
        return this.weight - other.weight;
    }
}

class Subset {
    int parent, rank;
}

public class KruskalMST {
    int find(Subset[] subsets, int i) {
        if (subsets[i].parent != i)
            subsets[i].parent = find(subsets, subsets[i].parent);
        return subsets[i].parent;
    }

    void union(Subset[] subsets, int x, int y) {
        int rootX = find(subsets, x);
        int rootY = find(subsets, y);

        if (subsets[rootX].rank < subsets[rootY].rank)
            subsets[rootX].parent = rootY;
        else if (subsets[rootX].rank > subsets[rootY].rank)
            subsets[rootY].parent = rootX;
        else {
            subsets[rootY].parent = rootX;
            subsets[rootX].rank++;
        }
    }

    void mstKruskal(int vertices, List<Edge> edges) {
        Collections.sort(edges);

        Subset[] subsets = new Subset[vertices];
        for (int i = 0; i < vertices; i++) {
            subsets[i] = new Subset();
            subsets[i].parent = i;
            subsets[i].rank = 0;
        }

        List<Edge> mst = new ArrayList<>();
        int totalCost = 0;

        for (Edge edge : edges) {
            int root1 = find(subsets, edge.src);
            int root2 = find(subsets, edge.dest);

            if (root1 != root2) {
                mst.add(edge);
                totalCost += edge.weight;
                union(subsets, root1, root2);
            }
        }

        System.out.println("Minimum Spanning Tree (Kruskal):");
        for (Edge e : mst) {
            System.out.println(e.src + " -- " + e.dest + "  | weight = " + e.weight);
        }
        System.out.println("Total Cost = " + totalCost);
    }

    public static void main(String[] args) {
        int vertices = 4;

        List<Edge> edges = Arrays.asList(
            new Edge(0, 1, 10),
            new Edge(0, 2, 6),
            new Edge(0, 3, 5),
            new Edge(1, 3, 15),
            new Edge(2, 3, 4)
        );

        new KruskalMST().mstKruskal(vertices, edges);
    }
}
