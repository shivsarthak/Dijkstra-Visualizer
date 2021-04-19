package project.graph;

import java.util.ArrayList;

import org.graphstream.graph.Node;

public class Vertex {
    public int index;
    Node node;
    String id;
    public ArrayList<Line> edges;

    public Vertex(String name, int index, Node n) {
        this.node = n;
        this.id = name;
        this.index = index;
        this.edges = new ArrayList<Line>();
    }

    public void addEdge(Line edge) {
        this.edges.add(edge);
    }

}
