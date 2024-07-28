import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedListQueue {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        queue.offer(12);  //adjacent method add() --> can throw an exception upon false whereas offer() doesn't
        queue.offer(24);
        queue.offer(36);

        System.out.println(queue);

        System.out.println(queue.poll());  //adjacent method remove()

        System.out.println(queue);

        System.out.println(queue.peek());  //adjacent method element()

    }
}
