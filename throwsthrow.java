import java.util.Scanner;

public class throwsthrow {
    // Method which might throw an error.
    static void checkAge(int arg) throws IllegalArgumentException {
        if (arg < 0 || arg == 0) {
            // System.out.println("");
            throw new IllegalArgumentException("Entered age is invalid");
        }
        else if (arg < 18) {
            throw new IllegalArgumentException("Hey, Entered age is not eligible to vote");
        }
        else {
            System.out.println("Hey, You are eligble to vote");
        }
    }


    public static void main(String[] args) {

        // throws keyword in java
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age: ");
        age = sc.nextInt();

        try {
            checkAge(age);
        }
        catch (IllegalArgumentException a) {
            System.out.println("Error: " + a.getMessage());
        }

        System.out.println("Program is completed");
    }
}