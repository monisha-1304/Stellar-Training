import java.util.*;

public class queue {
    public static void main (String args[]) {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(40);
        queue.add(54);
        queue.add(10);
        System.out.println("Queue before poll is : " +queue);
        System.out.println("Polled element is : " + queue.poll());
        System.out.println("Queue after poll is : " +queue);
    }
}