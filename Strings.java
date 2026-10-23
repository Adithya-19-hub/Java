import java.util.Scanner;

// Our custom exception class.
class IllegalAgeException extends RuntimeException {
    public IllegalAgeException(String message) {
        super(message);
    }
}

public class Strings {

    public static void checkAge(int ageValue) throws IllegalAgeException {
        if(ageValue < 0 || ageValue == 0) {
            throw new IllegalAgeException("Dear User, Entered age value should not be zero or less than zero");
        }
        else if(ageValue < 18) {
            throw new IllegalAgeException("Dear User, You are not eligible to vote in the election as your age is less than 18");
        }
        else {
            System.out.println("Dear User, Your are eligible to vote in the election");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); // scanner object.
        System.out.println("Dear User, please enter your age: ");
        int age = sc.nextInt();

        try {
            checkAge(age); // Method checkAge is invoked
        }
        catch(IllegalAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Normal code after exception occus's
        System.out.println("code is completed");
        System.out.println("ThankYou for participating in the context");
        sc.close(); // closing the scanner class.....
    }
}