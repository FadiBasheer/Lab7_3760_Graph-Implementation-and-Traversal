import java.util.LinkedList;
import java.util.Queue;

public class Graph {
    private final boolean[][] adjMatrix;
    private final int numVertices;
    boolean directed;

    // Initialize the matrix
    public Graph(int numVertices) {
        this.numVertices = numVertices;
        adjMatrix = new boolean[numVertices][numVertices];
    }

    boolean isDirected() {
        return directed;
    }

    // Add edges
    public void addEdge(int i, int j, boolean directed) {
        this.directed = directed;
        if (!directed) {
            adjMatrix[i][j] = true;
            adjMatrix[j][i] = true;
        } else {
            adjMatrix[i][j] = true;
        }
    }

    public int degree(int v) {
        if (directed) {
            return -1;
        }
        int degree = 0;
        for (int i = 0; i < numVertices; i++) {
            if (adjMatrix[v][i]) {
                degree++;
            }
        }
        return degree;
    }

    int inDegree(int v) {
        if (!directed) {
            return -1;
        }
        int degree = 0;
        for (int i = 0; i < numVertices; i++) {
            if (adjMatrix[i][v]) {
                degree++;
            }
        }
        return degree;
    }

    int outDegree(int v) {
        if (!directed) {
            return -1;
        }
        int degree = 0;
        for (int i = 0; i < numVertices; i++) {
            if (adjMatrix[v][i]) {
                degree++;
            }
        }
        return degree;
    }

    void Depth_First_Search() {
        boolean[] visited = new boolean[numVertices];
        for (int i = 0; i < numVertices; ++i) {
            if (!visited[i])
                dfs_helper(i, visited);
        }
    }

    void dfs_helper(int v, boolean[] visited) {
        visited[v] = true;
        System.out.println("visiting vertex " + v);

        for (int i = 0; i < numVertices; ++i) {
            if (!visited[i] && adjMatrix[v][i]) {
                dfs_helper(i, visited);
            }
        }
    }

    void Breadth_First_Search() {
        boolean[] visited = new boolean[numVertices];

        for (int i = 0; i < numVertices; ++i) {
            if (!visited[i])
                bfs_helper(i, visited);
        }
    }

    void bfs_helper(int v, boolean[] visited) {
        visited[v] = true;
        System.out.println("visiting vertex " + v);

        Queue<Integer> q = new LinkedList<>();
        q.add(v);
        while (!q.isEmpty()) {
            for (int i = 0; i < numVertices; ++i) {
                if (!visited[i] && adjMatrix[q.peek()][i]) {
                    visited[i] = true;
                    q.add(i);
                    System.out.println("visiting vertex " + i);
                }
            }
            q.remove();
        }
    }

    // Print the matrix
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < numVertices; i++) {
            s.append(i).append(": ");
            for (boolean j : adjMatrix[i]) {
                s.append(j ? 1 : 0).append(" ");
            }
            s.append("\n");
        }
        return s.toString();
    }
}