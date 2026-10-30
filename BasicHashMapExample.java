import java.util.HashMap;

public class BasicHashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();

        // Insert students
        students.put(101, "Alice");
        students.put(102, "Bob");
        students.put(103, "Charlie");

        // Retrieve a student
        System.out.println("Student 101: " + students.get(101));

        // Update a student
        students.put(102, "Robert");

        System.out.println("Updated Student 102: " + students.get(102));

        // Remove a student
        students.remove(103);

        // Display the remaining students
        System.out.println("Final Student Map: " + students);
    }
}
