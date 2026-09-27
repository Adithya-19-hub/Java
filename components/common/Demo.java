package components.common;

// Our first custom class in java
class Employee {
    // Attribute with static keyword.
    static String empCompany = "Microsoft";
    
    // Attribute without static keyword.
    String empName;
    
    // Method
    static void work(String res){
        System.out.println("Employee's name is " + res + "works at " + empCompany);
    }
}

public class Demo {
    public static void main(String[] args) {
        System.out.println("Custom classes in java");
        // obj1
        Employee obj = new Employee();
        // Modified static member.
        obj.empCompany = "Apple";
        String res = obj.empName = "Adithya";
        obj.work(res);

        // obj2
        Employee obj1 = new Employee();
        String result = obj1.empName = "Subham";
        obj.work(result);
    }
}
