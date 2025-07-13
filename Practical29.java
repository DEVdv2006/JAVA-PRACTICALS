import java.util.HashSet;
import java.util.Set;

public class Practical29 {
    public static void main(String[] args) {
        // Create a new HashSet and add colors
        Set<String> colors = new HashSet<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");
        colors.add("Orange");

        // Iterate through all elements using a for-each loop and display the collection
        System.out.println("Colors in the HashSet:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
