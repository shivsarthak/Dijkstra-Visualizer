package project.algo;

import project.graph.*;
import project.priorityQueue.PriorityQueueClass;
import project.priorityQueue.PriorityQueueClass.QueueItem;

public class Dijkstra {
    public static void dijkstra(GraphClass graph, int sourceIndex) {
        int vertices = graph.vertices.size();
        int[] distance = new int[vertices];
        boolean[] visited = new boolean[vertices];
        for (int i = 0; i < vertices; i++) {
            distance[i] = Integer.MAX_VALUE;
            visited[i] = false;
        }
        distance[sourceIndex] = 0;
        PriorityQueueClass queue = new PriorityQueueClass();
        queue.enQueue(graph.vertices.get(sourceIndex), 0);
        while (queue.isNotEmpty()) {
            QueueItem v = queue.deQueue();
            for (Line line : v.vertex.edges) {
                if (!visited[line.from.index] && (distance[line.to.index] > (v.length + line.length))) {
                    distance[line.to.index] = (v.length + line.length);
                    queue.enQueue(line.to, line.length);
                }
            }
            visited[v.vertex.index] = true;

        }
        int i = 0;
        for (int b : distance) {
            System.out.println("Distance to " + i + ":" + b);
            i++;
        }

    }
    public static void main(String[] args) {
        GraphClass graph = new GraphClass();
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
        dijkstra(graph, 0);
    }
}
