import java.util.ArrayDeque;
import java.util.Deque;

public class Problem2 {
    public static void main(String[] args) {

        Deque<String> queue = new ArrayDeque<>();

        queue.add("Apple");
        queue.add("Banana");
        queue.add("Orange");
        queue.add("Grape");
        queue.add("Mango");

        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }
}
