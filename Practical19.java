// First interface defining vehicle behavior
interface Vehicle {
    void start();
    void stop();
}

// Second interface defining engine behavior
interface Engine {
    void accelerate();
    void decelerate();
}

// Car class implementing both Vehicle and Engine interfaces
class Car implements Vehicle, Engine {
    @Override
    public void start() {
        System.out.println("Car started");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }

    @Override
    public void accelerate() {
        System.out.println("Car accelerating");
    }

    @Override
    public void decelerate() {
        System.out.println("Car decelerating");
    }
}

public class Practical19 {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();
        myCar.accelerate();
        myCar.decelerate();
        myCar.stop();
    }
}

