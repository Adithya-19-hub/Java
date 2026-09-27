class Employee {
    private int empId;
    public String empName;
    public static String empCompany = "Microsoft";

    Employee(String val) {
        empName = val;
        this("Varun");
        System.out.println("Defaadwdwedult conaeihfwsfsfkwehkwruekstructor...");
    }

    // Employee(String val) {
    //     empName = val;
    // }

    // Setter method
    public void initializeId(int id) {
        empId = id;
    }

    public void accessDetails() {
        System.out.println("empId: " + this.empId);
        System.out.println("empName: " + this.empName);
        System.out.println("empCompany: " + empCompany);
    }
}


class Adithya extends Employee {

    Adithya() {
        super("Adithya"); // super() initializes the value for the base class constructor.

        System.out.println("Sub-class constructor.......");
    }
}


public class Session {
    public static void main(String[] args) {
        Adithya obj1 = new Adithya();
        obj1.initializeId(200);

        // Employee emp1 = new Employee();
    
        System.out.println(Employee.empCompany);
    }
}