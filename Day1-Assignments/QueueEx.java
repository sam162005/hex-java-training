import java.util.Queue;
import java.util.ArrayDeque;

public class QueueEx {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();
        queue.offer("10");
        queue.offer("20");
        queue.offer("30");
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
    }
}