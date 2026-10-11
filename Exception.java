import java.util.Scanner;

public class Exception {
    // Method to validate weather user entered age is eligible to vote or not.
    static void checkAge(int ageValue) {
        if (ageValue < 0 || ageValue == 0) {
            throw new IllegalArgumentException("Dear User!, Please enter a valid number");
        }
        else if (ageValue < 18) {
            throw new IllegalArgumentException("Dear User!, You are not eligible to vote");
        }
        else {
            System.out.println("Dear User!, You are eligible to vote");
        }
    }

    public static void main(String[] args) {
        int age;
        Scanner input = new Scanner(System.in);
        System.out.println("Dear User, Please enter the age value:");
        age = input.nextInt();

        // Invoking method checkAge.
        try {
            checkAge(age);
        }
        catch (IllegalArgumentException e) {
            System.out.println("OOPS Something went wrong" + e);
        }
        finally {
            // closing the scanner class
            input.close();
        }

        System.out.println("Program ended....");
    }
}