import java.util.*;

public class Day4_Q1 {
    public static void main(String[] args) {

        HashSet<String> c = new HashSet<>();

        c.add("Solan");
        c.add("Shimla");
        c.add("Una");
        c.add("kangra");
        c.add("Shimla");                                      

        System.out.println("Cities name: " + c);

        String check = "Chandigarh";                                         // Check if city is in the set
        if (c.contains(check)) {
            System.out.println(check + " is in the set.");
        } 
        else {
            System.out.println(check + " is not in the set.");
        }

        c.remove("Una");                       // Remove a city
        System.out.println("Updated cities name: " + c);
    }
}
