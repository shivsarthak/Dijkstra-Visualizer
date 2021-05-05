package project.algo;

import java.util.concurrent.TimeUnit;

import project.graph.*;
import project.priorityQueue.PriorityQueueClass;
import project.priorityQueue.PriorityQueueClass.QueueItem;

public class Dijkstra {

    public void run(GraphClass graph, int sourceIndex) throws InterruptedException {
        int vertices = graph.vertices.size();
        int[] distance = new int[vertices];
        boolean[] visited = new boolean[vertices];

        TimeUnit.SECONDS.sleep(1);

        for (int i = 0; i < vertices; i++) {
            distance[i] = Integer.MAX_VALUE;
            visited[i] = false;
        }
        distance[sourceIndex] = 0;
        PriorityQueueClass queue = new PriorityQueueClass();
        queue.enQueue(graph.vertices.get(sourceIndex), 0);
        while (queue.isNotEmpty()) {
            QueueItem v = queue.deQueue();
            v.vertex.node.setAttribute("ui.style", "fill-color: rgb(255,0,0);");
            TimeUnit.SECONDS.sleep(1);
            for (Line line : v.vertex.edges) {
                line.edge.setAttribute("ui.style", "fill-color: rgb(255,255,0);");
                TimeUnit.SECONDS.sleep(1);
                if (!visited[line.from.index] && (distance[line.to.index] > (v.length + line.length))) {
                    distance[line.to.index] = (v.length + line.length);
                    queue.enQueue(line.to, line.length);
                }
                line.edge.setAttribute("ui.style", "fill-color: rgb(0,0,255);");
                TimeUnit.SECONDS.sleep(1);
            }
            v.vertex.node.setAttribute("ui.style", "fill-color: rgb(0,255,0);");
            TimeUnit.SECONDS.sleep(1);
            visited[v.vertex.index] = true;

        }
        int i = 0;
        for (int b : distance) {
            System.out.println("Distance to " + graph.vertices.get(i).node.getId() + ":" + b);
            i++;
        }

    }

}
