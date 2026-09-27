import java.util.Scanner; // Scanner class.

public class Main {
    public static void main(String args[]) {
        int var1 = -1;
        int var2 = -20; // 32 bit box will be allocated.

        // Conditional expression in java.
        if (var1 < 0 || var2 < 0) {
            System.out.println("Variable's cant be negative");
        } else if (var1 < var2) {
            System.out.println("Var2 is greater");
        } else if (var1 > var2) {
            System.out.println("Var1 is greater");
        } else {
            System.out.println("Both variables are equal");
        }

        // To check weather the user input is even or odd.
        Scanner sc = new Scanner(System.in); // It reads input from the user.
        System.out.println("Enter interger:");
        int num = sc.nextInt(); // Taking input from the user.

        if(num % 2 == 0) {
            System.out.println("Yes integer is even");
        }
        else {
            System.out.println("Integer is odd");
        }

        sc.close(); // Scanner class will get close.

        // In any other language there will be precedence and associativity.

        
    }
}