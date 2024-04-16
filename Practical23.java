class DivideByZeroException extends Exception {
    public DivideByZeroException(String message) {
        super(message);
    }
}

public class Practical23 {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (DivideByZeroException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static int divide(int dividend, int divisor) throws DivideByZeroException {
        if (divisor == 0) {
            throw new DivideByZeroException("Cannot divide by zero");
        }
        return dividend / divisor;
    }
}
