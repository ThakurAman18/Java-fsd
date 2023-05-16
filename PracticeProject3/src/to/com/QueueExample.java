package to.com;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        
        Queue<String> queue = new LinkedList<>();

        
        queue.offer("Aman");
        queue.offer("Anuj");
        queue.offer("Chetan");
        queue.offer("Deepak");

        System.out.println("Queue after inserting elements: " + queue);

        
        String removedElement = queue.poll();
        System.out.println("Removed element: " + removedElement);

        
        System.out.println("Queue after removing an element: " + queue);
    }
}

