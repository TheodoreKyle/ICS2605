/* 
Choa, Theodore Kyle Q.
2ITB   |   ICS 2605
*/

import java.util.LinkedList;
public class Graph2 {
    private LinkedList<String>[] adjList;
    private int size;

    @SuppressWarnings("unchecked") 
    public Graph2(int size) {
        this.size = size;
        adjList = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    // convert vertex name to array index
    private int index(String v) {
        switch (v) {
            case "BN": return 0;
            case "MY": return 1;
            case "ID": return 2;
            case "SG": return 3;
            case "TH": return 4;
            case "MM": return 5;
            case "LA": return 6;
            case "KH": return 7;
            case "VN": return 8;
            case "PH": return 9;
            default: return -1; 
        }
    }

    // convert index back to vertex name
    private String name(int i) {
        switch (i) {
            case 0: return "BN";
            case 1: return "MY";
            case 2: return "ID";
            case 3: return "SG";
            case 4: return "TH"; 
            case 5: return "MM";
            case 6: return "LA";
            case 7: return "KH";
            case 8: return "VN";
            case 9: return "PH";
            default: return "?";
        }
    }

    public void addEdge(String src, String dest) {
        int srcIndex = index(src);
        int destIndex = index(dest);
        if (srcIndex != -1 && destIndex != -1) {
            adjList[srcIndex].add(dest);
            adjList[destIndex].add(src); // undirected graph 
        }
    }

    public void printGraph() {
        for (int i = 0; i < size; i++) {
            System.out.print(name(i) + ": ");
            for (String neighbor : adjList[i]) {
                System.out.print("-> " + neighbor + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Graph2 graph = new Graph2(10);

        graph.addEdge("BN", "MY");
        graph.addEdge("MY", "SG");
        graph.addEdge("MY", "ID");
        graph.addEdge("MY", "TH");
        graph.addEdge("TH", "MM");
        graph.addEdge("TH", "LA");
        graph.addEdge("TH", "KH");
        graph.addEdge("MM", "LA");
        graph.addEdge("KH", "LA");
        graph.addEdge("KH", "VN");
        graph.addEdge("LA", "VN");

        graph.printGraph();
    }
}