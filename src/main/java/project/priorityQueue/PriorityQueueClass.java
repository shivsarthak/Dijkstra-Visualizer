package project.priorityQueue;

import java.util.PriorityQueue;

import project.graph.Vertex;

public class PriorityQueueClass {
    public class QueueItem implements Comparable<QueueItem> {
        public Vertex vertex;
        public int length;

        QueueItem(Vertex v, int len) {
            this.vertex = v;
            this.length = len;
        }

        @Override
        public int compareTo(QueueItem o) {
            if (o.length > this.length)
                return -1;
            if (o.length < this.length)
                return 1;
            return 0;
        }

    }

    PriorityQueue<QueueItem> queue;

    public PriorityQueueClass() {
        this.queue = new PriorityQueue<QueueItem>();
    }

    public void enQueue(Vertex vertex, int len) {
        this.queue.add(new QueueItem(vertex, len));
    }

    public QueueItem deQueue() {
        return  this.queue.poll();
    }

    public boolean isNotEmpty(){
        return !(this.queue.isEmpty());
    }

}
