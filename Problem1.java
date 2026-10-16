import java.util.Stack;

public class Problem1 {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.push("Apple");
        stack.push("Banana");
        stack.push("Orange");
        stack.push("Grape");
        stack.push("Mango");

        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
    }
}
