package project;

import project.algo.Dijkstra;
import project.graph.GraphClass;

public class App {
    public static void main(String[] args) {
        GraphClass graph = new GraphClass();
        Dijkstra dijkstra = new Dijkstra();
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");
        graph.addEdge(0, 1, 6);
        graph.addEdge(2, 1, 3);
        graph.addEdge(0, 2, 2);
        graph.addEdge(2, 3, 1);
        graph.addEdge(0, 4, 3);
        graph.addEdge(4, 1, 1);
        try {
            dijkstra.run(graph, 0);
        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}
