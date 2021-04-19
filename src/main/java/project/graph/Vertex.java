package project.graph;

import java.util.ArrayList;

import org.graphstream.graph.Node;

public class Vertex {
    public int index;
    public Node node;
    String id;
    public ArrayList<Line> edges;

    public Vertex(String name, int index, Node n) {
        this.node = n;
        this.node.setAttribute("ui.style", "size: 30px; fill-color: white; text-color: white; text-alignment:at-right;text-size:50;");
        this.node.setAttribute("ui.label", name);
        this.id = name;
        this.index = index;
        this.edges = new ArrayList<Line>();
    }

    public void addEdge(Line edge) {
        this.edges.add(edge);
    }

}
