package project;

import org.graphstream.graph.*;
import org.graphstream.graph.implementations.*;

public class App {
    public static void main(String[] args) {
        System.setProperty("org.graphstream.ui", "swing");
        Graph g = new SingleGraph("Tutorial 1", false, true);
        g.setAttribute("ui.quality");
        g.setAttribute("ui.antialias");
        g.addNode("A").setAttribute("xy", 0, 1);
        g.addNode("B").setAttribute("xy", 1, 2);
        g.addNode("C").setAttribute("xy", 1, 1);
        g.addNode("D").setAttribute("xy", 1, 0);
        g.addNode("E").setAttribute("xy", 2, 2);
        g.addNode("F").setAttribute("xy", 2, 1);
        g.addNode("G").setAttribute("xy", 0, 0);
        g.addEdge("AB", "A", "B").setAttribute("length", 14);
        g.addEdge("AC", "A", "C").setAttribute("length", 9);
        g.addEdge("AD", "A", "D").setAttribute("length", 7);
        g.addEdge("BC", "B", "C").setAttribute("length", 2);
        g.addEdge("CD", "C", "D").setAttribute("length", 10);
        g.addEdge("BE", "B", "E").setAttribute("length", 9);
        g.addEdge("CF", "C", "F").setAttribute("length", 11);
        g.addEdge("DF", "D", "F").setAttribute("length", 15);
        g.addEdge("EF", "E", "F").setAttribute("length", 6);
        
        g.display();

    }
}
