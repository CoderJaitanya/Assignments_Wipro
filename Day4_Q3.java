import java.util.ArrayList;

public class Day4_Q3 {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        nums.add(50);

        nums.remove(2);                                   // Removes the element at index 2
        System.out.println("After removing the third element: " + nums);
        
        nums.set(1, 25);                         // Updates the element at index 1
        System.out.println("After updating the second element: " + nums);
        
        for (int i:nums){
            System.out.println(i);
        }

    }
}