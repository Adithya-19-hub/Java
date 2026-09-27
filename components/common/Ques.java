package components.common;

// Question - 1
class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    void accessName() {
        System.out.println("Name " + name);
    }
}

class Student extends Person {
    String name;
    int roll;

    Student(String name, int roll) {
        super("Adithya");
        this.name = name;
        this.roll = roll;
    }

    void displayDetails() {
        System.out.println("Name is: " + this.name + " roll is " + this.roll);
    }
}

// Question - 2
class Employee {
}

class Developer extends Employee {
    String name;
    float salary;

    Developer(String name, float salary) {
        this.name = name;
        this.salary = salary;
    }

    // Default constructor
    Developer(String name) {
        this(name,10000);
    }

    void developerDetails() {
        System.out.println("Name: " + name + " salary " + salary);
    }
}




// Question - 3
class Vehicle {
    public String vehicleType;
    protected String regNo;
    private String vehicledetails;
    String vehicleCapacity;

    Vehicle(String vehicleType,String regNo,String vehicleCapacity) {
        this.vehicleType = vehicleType;
        this.regNo = regNo;
        this.vehicleCapacity = vehicleCapacity;
    }

    // Setter
    public void setNumber(String vehicledetails) {
        this.vehicledetails = vehicledetails;
    }
}



class Car extends Vehicle {
    Car() {
        super("Car","KA012002","5");
    }

    void vehicleInfo() {
        System.out.println("Vehicle Type is " + vehicleType + " regNo is " + regNo + " vehicle capacity is " + vehicleCapacity);
    }
}



// Question - 4
class Company {
    public static String companyName;

    Company(String companyName) {
        this.companyName = companyName;
    }

    public static void displayCompany() {
        System.out.println(companyName);
    }
}

class Employeee extends Company {
    String empName;

    Employeee() {
        super(Company.companyName);
    }

    void showCompanyName() {
        System.out.println(companyName);
    }
}


public class Ques {
    public static void main(String[] args) {
        Student s1 = new Student("John", 20);
        s1.displayDetails();
        s1.accessName();

        Developer obj1 = new Developer("Subham");
        obj1.developerDetails();

        Car audi = new Car();
        audi.vehicleInfo();

        
        Company.companyName = "Microsoft";

        Employeee adi = new Employeee();
        adi.showCompanyName();
        
    }
}