import java.util.*;

public class batch {
    public static void main(String[] args) {
        String[] seats = {"Asha", "Ravi", "Meena"};
        Queue<String> q = new ArrayDeque<>();
        q.offer("Kiran");
        q.offer("Pooja");
        System.out.println("Seats: " + Arrays.toString(seats));
        System.out.println("Waiting: " + q);
        for (int i = 0; i < 3; i++) {
            if (seats[i].equals("Ravi")) {
                seats[i] = q.poll();
                break;
            }
        }
        System.out.println("After Ravi drops out:");
        System.out.println("Seats: " + Arrays.toString(seats));
        System.out.println("Waiting: " + q);
    }
}
