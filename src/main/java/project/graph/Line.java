package project.graph;

import org.graphstream.graph.Edge;

public class Line {
    public String id;
    public int length;
    public Vertex from, to;
    Edge edge;

    Line(Vertex from, Vertex to, int len) {
        this.id = String.valueOf(from) + String.valueOf(to);
        this.from = from;
        this.to = to;
        this.length = len;
    }
    void addEdge(Edge edge){
        this.edge=edge;
    }
}
