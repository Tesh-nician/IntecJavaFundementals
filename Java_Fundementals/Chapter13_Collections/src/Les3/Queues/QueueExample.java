package Les3.Queues;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Alice");
        queue.offer("Bob");
        queue.offer("Charlie");
        queue.offer("Deepika");

        System.out.println("Queue: "+queue);

        String frontElement = queue.peek();
        System.out.println("Front element: "+frontElement);

        String removedElement = queue.poll();
        System.out.println("Removed element: "+removedElement);
        System.out.println("Update Queue: "+ queue);

        boolean isEmpty = queue.isEmpty();
        System.out.println("Is Queue empty?" + isEmpty);


        int size = queue.size();
        System.out.println("Size of Queue: "+ size);


    }
}
