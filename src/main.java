public class main {
    public static void main(String args[]) {
        Graph graph1 = new Graph(5);
        graph1.addEdge(0, 1, false);
        graph1.addEdge(0, 3, false);
        graph1.addEdge(0, 4, false);
        graph1.addEdge(1, 2, false);
        graph1.addEdge(1, 4, false);
        graph1.addEdge(2, 3, false);
        graph1.addEdge(3, 4, false);
        System.out.println(graph1.toString());

        Graph graph2 = new Graph(4);
        graph2.addEdge(0, 1, false);
        graph2.addEdge(1, 2, false);
        graph2.addEdge(2, 3, false);
        System.out.println(graph2.toString());

        Graph graph3 = new Graph(6);
        graph3.addEdge(0, 2, false);
        graph3.addEdge(0, 4, false);
        graph3.addEdge(1, 3, false);
        graph3.addEdge(1, 5, false);
        graph3.addEdge(2, 4, false);
        graph3.addEdge(3, 1, false);
        graph3.addEdge(3, 5, false);
        System.out.println(graph3.toString());

        System.out.println("graph1.inDegree(2): " + graph1.inDegree(2) + "\n");
        System.out.println("graph1.degree(2): " + graph1.degree(2));
        System.out.println("graph2.degree(0): " + graph2.degree(0));

        System.out.println("\nDirected graph");
        Graph Dgraph = new Graph(5);
        Dgraph.addEdge(0, 0, true);
        Dgraph.addEdge(0, 4, true);
        Dgraph.addEdge(1, 2, true);
        Dgraph.addEdge(1, 4, true);
        Dgraph.addEdge(2, 0, true);
        Dgraph.addEdge(2, 3, true);
        Dgraph.addEdge(3, 0, true);
        Dgraph.addEdge(3, 1, true);
        Dgraph.addEdge(3, 2, true);
        Dgraph.addEdge(4, 3, true);
        System.out.println(Dgraph.toString());

        System.out.println("out degree (3): " + Dgraph.outDegree(3));
        System.out.println("In degree(3): " + Dgraph.inDegree(3));

        System.out.println("\nDgraph.degree(2): " + Dgraph.degree(2) + "\n");

        System.out.println("out degree (1): " + Dgraph.outDegree(1));
        System.out.println("In degree(1): " + Dgraph.inDegree(1));

        Graph g2 = new Graph(8);
        g2.addEdge(0, 1, false);
        g2.addEdge(0, 2, false);
        g2.addEdge(0, 4, false);
        g2.addEdge(1, 3, false);
        g2.addEdge(1, 5, false);
        g2.addEdge(2, 3, false);
        g2.addEdge(2, 6, false);
        g2.addEdge(3, 7, false);
        g2.addEdge(4, 5, false);
        g2.addEdge(4, 6, false);
        g2.addEdge(5, 4, false);
        g2.addEdge(5, 7, false);
        g2.addEdge(6, 7, false);

        System.out.println("\n G2");
        System.out.println(g2.toString());

        System.out.println("Depth_First_Search");
        g2.Depth_First_Search();
        System.out.println("\nBreadth_First_Search");
        g2.Breadth_First_Search();
    }
}
