// Base class
class Vehicle {
    private String registrationId;
    protected String modelName;
    public static int totalVehicles;

    // Constrcutor
    Vehicle(String name) {
        modelName = name;
        totalVehicles += 1;
    }

    public void validateId(String id) throws IllegalArgumentException {
        registrationId = id;
        if (registrationId.startsWith("REG-")) {
            System.out.println("Dear User, your registered number has been succesufully entered");
        }
        else {
            throw new IllegalArgumentException("Your vehicle registration number should start with prefix REG-");
        }
    }

    public void displayDetails() {
        System.out.println("Vehicle's registration number is: " + registrationId + " modalName is: " + modelName);
    }
}


// Child class.
class Truck extends Vehicle {
    private double payloadCapacity;

    Truck() {
        super("Ashok Leyland");
    }

    public void setCapacity(double capacity) throws IllegalArgumentException {
        if (capacity == 0 || capacity < 0) {
            throw new IllegalArgumentException("Dear User, payloadCapacity should not be negative or equals to zero");
        }
        else {
            payloadCapacity = capacity;
        }
    }

    @Override // annotation to check or double confirm with the compiler weather a method can be override or not
    public void displayDetails() {
        super.displayDetails(); // Parent version will get printed first.
        System.out.println("Vehciles payload capacity is: " + payloadCapacity);
    }
}


public class Exam {
    public static void main(String[] args) {
        Truck obj = new Truck();

        try {
            obj.validateId("REG-KA02MK9000");
        }
        catch (IllegalArgumentException e) {
            System.out.println("Error: " + e);
        }

        try {
            obj.setCapacity(1.7);
        }
        catch (IllegalArgumentException a) {
            System.out.println("Error: " + a);
        }

        obj.displayDetails();

        System.out.println("Code is completed.......");
        System.out.println("Majeeee karoooo");
    }
}