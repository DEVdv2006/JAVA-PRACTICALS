class Rectangle {
    double length;
    double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate the area of the rectangle
    public double calculateArea() {
        return length * width;
    }
}
class RectangleCalculator {
    // Method to calculate the area of the rectangle and return the result
    public double calculateRectangleArea(Rectangle rectangle) {
        return rectangle.calculateArea();
    }
}


public class ObjectPassingReturningExample {
    public static void main(String[] args) {
        // Creating a Rectangle object
        Rectangle myRectangle = new Rectangle(5.0, 3.0);

        // Creating an instance of RectangleCalculator
        RectangleCalculator calculator = new RectangleCalculator();

        // Calculating and displaying the area using the method in RectangleCalculator
        double area = calculator.calculateRectangleArea(myRectangle);
        System.out.println("Area of the rectangle: " + area);
    }
}
