package Assignment;

class Employee {
    // Non - static variable which needs seperate copy for an object.
    long salary;
    String name;

    public void getSalary() {
        System.out.println("Employee's salary is: " + salary);
    }

    public void getName() {
        System.out.println("Employee name is:" + name);
    }

    public void setName(String newName) {
        System.out.println("Employee name is:" + newName);
    }
}

class CellPhone {
    public static void ringing() {
        System.out.println("Phone is ringing....");
    }


    public static void vibrating() {
        System.out.println("Phone is vibrating....");
    }
}


public class Exam {
    public static void main(String[] args) {
        Employee obj1 = new Employee(); // Object - 1
        obj1.salary = 100000L;
        obj1.name = "Adithya";

        obj1.getSalary();
        obj1.getName();
        obj1.setName("Harsha");

        CellPhone obj2 = new CellPhone();
        obj2.ringing();
        obj2.vibrating();
    }
}