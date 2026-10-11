import java.lang.Throwable;

public class Exceptions {
    public static void main(String[] args) {
        // Exceptions are handled using try-catch block.

        // Normal flow of program execution
        System.out.println("Hello world");
        System.out.println("Paris");
        System.out.println("India is in asia");

        try {
            int[] arr = new int[3];
            arr[0] = 100;
            arr[1] = 200;
            arr[2] = 300;
            arr[3] = 400;
            arr[4] = 400;
        } catch (Exception adithya) {
            System.out.println("Error is" + adithya);
        } finally {
            System.out.println("Exception has ended....");
        }

        System.out.println("Program ended");
        System.out.println("Completed");


        // How to handle the multiple catch blocks.
        // Defining multiple catch blocks will help you catch one specific error.

        
        
        try {
            int[] arr1 = new int[3];
            arr1[0] = 100;
            arr1[1] = 200;
            arr1[2] = 300;
            arr1[3] = 400;
            arr1[4] = 400;
            
        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println(a);
        } catch (Exception r) {
            System.out.println("OOPS Something went wrong" + r);
        }
    }
}