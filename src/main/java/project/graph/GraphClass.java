package project.graph;

import java.util.ArrayList;

import org.graphstream.graph.Graph;
import org.graphstream.graph.implementations.SingleGraph;

public class GraphClass {
    Graph graph = new SingleGraph("Output Graph");
    public ArrayList<Vertex> vertices;

    public GraphClass() {
        System.setProperty("org.graphstream.ui", "swing");
        vertices = new ArrayList<Vertex>();
        graph.setAttribute("ui.stylesheet", "graph { fill-color: black; }");
        graph.setAttribute("ui.quality");
        graph.setAttribute("ui.antialias");
        graph.display();
    }

    public void addVertex(String name) {
        int index = vertices.size();
        Vertex v = new Vertex(name, index, this.graph.addNode(String.valueOf(index)));
        this.vertices.add(v);
    }

    public void addEdge(int from, int to, int len) {
        Line line = new Line(vertices.get(from), vertices.get(to), len);
        line.addEdge(this.graph.addEdge(line.id, String.valueOf(from), String.valueOf(to)));
        vertices.get(from).addEdge(line);
    }
}
