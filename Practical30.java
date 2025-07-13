import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Practical30 {
    public static void main(String[] args) {
        // Create a new HashMap to store students' data
        Map<String, String> students = new HashMap<>();
        
        // Add 5 students' data to the HashMap
        students.put("EN001", "Alice Johnson");
        students.put("EN002", "Bob Smith");
        students.put("EN003", "Charlie Brown");
        students.put("EN004", "David Wilson");
        students.put("EN005", "Eva Green");

        // Display all students' data
        System.out.println("Students' data in the HashMap:");
        for (Map.Entry<String, String> entry : students.entrySet()) {
            System.out.println("Enrollment No: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        // Retrieve and display a student's name using their enrollment number
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter enrollment number to retrieve student's name:");
        String enrollmentNo = scanner.nextLine();
        
        String studentName = students.get(enrollmentNo);
        if (studentName != null) {
            System.out.println("Student's name for enrollment number " + enrollmentNo + ": " + studentName);
        } else {
            System.out.println("No student found with enrollment number " + enrollmentNo);
        }
        
        scanner.close();
    }
}
