abstract class Vehicle {
    abstract void startEngine();

    void stopEngine() {
        System.out.println("Engine stopped");
    }
}

class Car extends Vehicle {
    void startEngine() {
        System.out.println("Car engine started");
    }
}

public class Abs2 {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.startEngine();
        c1.stopEngine();
    }
}
