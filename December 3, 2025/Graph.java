import java.util.LinkedList; 
public class Graph {
    private LinkedList<String>[] adjList;
    private int size;

    @SuppressWarnings("unchecked")
    public Graph(int size) {
        this.size = size;
        adjList = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            adjList[i] = new LinkedList<>(); 
        }
    }

    private int index(char v) {
        return v - 'A';
    }

    public void addEdge(char src, char dest) {
        adjList[index(src)].add(String.valueOf(dest));
        adjList[index(dest)].add(String.valueOf(src)); 
    }

    public void printGraph() {
        for (int i = 0; i < size; i++) {
            char vertex = (char) (i + 'A');
            System.out.print(vertex + ": ");
            
            for (String neighbor : adjList[i]) {
                System.out.print("-> " + neighbor + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph(4); // A, B, C, D

        graph.addEdge('A', 'B');
        graph.addEdge('A', 'C');
        graph.addEdge('B', 'D');
        graph.addEdge('C', 'D');

        graph.printGraph();
    }
}