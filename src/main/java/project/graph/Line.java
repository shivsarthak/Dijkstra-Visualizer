package project.graph;

import org.graphstream.graph.Edge;

public class Line {
    public String id;
    public int length;
    public Vertex from, to;
    public Edge edge;

    Line(Vertex from, Vertex to, int len) {
        this.id = String.valueOf(from) + String.valueOf(to);
        this.from = from;
        this.to = to;
        this.length = len;
    }

    void addEdge(Edge edge) {
        this.edge = edge;
        this.edge.setAttribute("ui.style", "size: 5px; fill-color: grey;text-alignment: under;text-size: 50;text-background-mode:none;text-color: white;");
        this.edge.setAttribute("ui.label", String.valueOf(length));
    }
}
