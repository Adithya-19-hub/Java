import java.util.Scanner;

public class PracticeSet {
    public static void addNums(int a, int b) throws IllegalArgumentException, ArithmeticException {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("HeHe");
        } 
        else {
            System.out.println("Addition of two nums is: " + (a + b));
        }
    }

    public static void main(String[] args) {
        // Question - 2
        Scanner obj = new Scanner(System.in);
        System.out.println("Dear User, please enter the integer - 1");
        int num = obj.nextInt();
        System.out.println("Dear User, please enter the integer - 2");
        int num2 = obj.nextInt();

        try {
            addNums(num, num2);
        } catch (ArithmeticException err) {
            System.out.println("Error: " + err.getMessage());
        } finally {
            obj.close();
        }

        System.out.println("Code completed");
    }
}