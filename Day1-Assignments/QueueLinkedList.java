import java.util.*;

public class QueueLinkedList {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("One");
        queue.offer("Two");
        queue.offer("Three");
        System.out.println(queue);
        System.out.println("Front: " + queue.peek());
        queue.poll();
        System.out.println("After Poll:" + queue);
    }
}
