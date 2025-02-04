import java.util.*;
public class Day4_Q2 {
    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        students.put(6139, "Jaitanya");
        students.put(6140, "Aman");
        students.put(6141, "Raj");
        students.put(6142, "Rahul");
        students.put(6138, "Ajay");

        System.out.println("Student name with mentioned roll no. : "+ students.get(6142));       // Display name using roll no.

        students.remove(6141);                                // Remove a student
        System.out.println("List of New Students " + students);

        System.out.println("All student records:");
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
