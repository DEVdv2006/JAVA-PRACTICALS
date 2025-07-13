 public class test {
    public static void main(String args[]) {
        
        // try {
        //     int result = 10 / 0; // This will cause an ArithmeticException
        //     System.out.println("Result: " + result);
        // } catch (Throwable e) {
        //     System.out.println("Error: Cannot divide by zero.");
        // }
        
        //1)
        // try {
        //     int[] arr = {1, 2, 3};
        //     System.out.println(arr[3]); // Accessing out of bound index
        // } catch (ArrayIndexOutOfBoundsException e) {
        //     System.out.println("Exception caught: " + e);
        // }
        

        //2)
        // int age = 17;
        // try {
        //     if (age < 18) {
        //         throw new ArithmeticException("Underage not allowed!");
        //     }
        //     System.out.println("You are eligible to vote.");
        // } catch (ArithmeticException e) {
        //     System.out.println("Exception caught: " + e);
        // }


        //3)
        try {
            int result = 10 / 0; // Division by zero
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e);
        } finally {
            System.out.println("Finally block executed.");
        }

    }
}