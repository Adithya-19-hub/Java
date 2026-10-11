// Base class.
class Vehicle {
    String regNo;

    // Default constructor.
    Vehicle() {
    }

    Vehicle(String a) {
        regNo = a;
        System.out.println("I am basqadqqdwasfasfewee class constructor");
    }

    // Method's
    public void start() {
        System.out.println("Vehicle is started");
    }

    public void stop() {
        System.out.println("Vehicle is stopped");
    }
}

// child class
class Bus extends Vehicle {
    // After class Vehicle got inherited into sub-class Bus, All the properties and
    // method's from base class will get inherit into the sub-class.

    int capacity;
    String busColor;

    Bus(int a, String b) {
        System.out.println("Hello");
        // super("KA023197");
        capacity = a;
        busColor = b;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Bus obj = new Bus(100, "Blue");
        obj.start();
        Vehicle b = new Vehicle();
    }
}