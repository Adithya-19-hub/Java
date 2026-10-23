package components.common;
import java.util.Scanner;


// Defining custom exception
class InvalidWithdrawAmount extends RuntimeException {
    // public InvalidWithdrawAmount(String message) {
    //     super(message);
    // }

    public InvalidWithdrawAmount() {} // no-arg constructor
}


class Vehicle {
    public String vehicleName;
}

public class TypeCasting {
    public static void takeInputs(int currentBalance, int withdrawAmount) throws IllegalArgumentException, InvalidWithdrawAmount {
        if (currentBalance < 0 || withdrawAmount < 0) {
            throw new IllegalArgumentException("Negative nums are not allowed");
        }
        else if(withdrawAmount > currentBalance) {
            throw new InvalidWithdrawAmount();
        }
        else {
            System.out.println("Dear User, Your requested withdraw amount has been successuful");
        }
    }

    public static void main(String[] args) {
        // Type casting in java

        // Implicit typecasting in java
        int a = 10; // takes 4 bytes which is equal to 32 bit
        double b;
        b = a; // Here java implicitly converts from int datatype to double datatype. 
        System.out.println(b); // 10.0

        // Explicit Typecasting in java
        double c = 20.3;
        // int d = c; // Here javac will not compile the code because int container cant hold the double data.
        // solution --> I need to explicitly tell java to convert the double datatype into an int using parenthesis.
        int res = (int) c; // Here java will convert the double datatype to whole number. but the data which is after the decimal point number will get loose.
        System.out.println(res); // 20


        // Scanner object
        Scanner obj = new Scanner(System.in);
        System.out.println("Dear User, please enter your current balance: ");
        int currentBalance = obj.nextInt();
        System.out.println("Dear User, please enter your withdraw balance: ");
        int withdrawBalance = obj.nextInt();

        try {
            takeInputs(currentBalance, withdrawBalance);
        }
        catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        catch(InvalidWithdrawAmount err) {
            System.out.println(err.getMessage());
        }
        finally {
            obj.close(); // Closing the scanner object.
        }

        System.out.println("Code completed");
        System.out.println("ThankYou");

        Vehicle a1 = new Vehicle();
        a1.vehicleName = null;
    }
}