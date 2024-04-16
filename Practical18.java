class Car {
    private String name;
    private double topSpeed;

    public Car(String name, double topSpeed) {
        this.name = name;
        this.topSpeed = topSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", topSpeed=" + topSpeed +
                '}';
    }
}

public class Practical18 {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", 180.5);
        Car car2 = new Car("BMW", 220.0);
        Car car3 = new Car("Honda", 170.0);
        Car car4 = new Car("Ford", 200.0);
        Car car5 = new Car("Chevrolet", 190.0);

        System.out.println("Car 1: " + car1);
        System.out.println("Car 2: " + car2);
        System.out.println("Car 3: " + car3);
        System.out.println("Car 4: " + car4);
        System.out.println("Car 5: " + car5);
    }
}

