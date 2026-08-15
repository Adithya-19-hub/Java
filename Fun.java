import java.util.Scanner; // Scanner class imported to take input from the user.

public class Fun {
    public static void main(String args[]){
        // Calculate percentage of student marks obtained in CBSC Exams and take 5 subjects of marks from user and marks are out of 100.
        Scanner value = new Scanner(System.in); // object for scanner.
        System.out.println("Enter the subject - 1 markskmlkm:");
        double marks1 = value.nextDouble();
        System.out.println("Enter the subject - 2 marks:");
        double marks2 = value.nextDouble();
        System.out.println("Enter the subject - 3 marks:");
        double marks3 = value.nextDouble();
        System.out.println("Enter the subject - 4 marks:");
        double marks4 = value.nextDouble();
        System.out.println("Enter the subject - 5 marks:");
        double marks5 = value.nextDouble();
        int totalMarks = 500;
        double result = marks1 + marks2 + marks3 + marks4 + marks5; // 300

        if(marks1 < 0 || marks2 < 0 || marks3 < 0 || marks4 < 0 || marks5 < 0) {
            System.out.println("Negative marks are not allowed");
        }
        else if(marks1 > 100 || marks2 > 100 || marks3 > 100 || marks4 > 100 || marks5 > 100) {
            System.out.println("Marks should not contain more than 100");
        }
        else {
            System.out.print("Total percentage is: ");
            System.out.println(result / totalMarks * 100);
        }

        System.out.println("Enter your name: ");
        String s1 = value.nextLine();
        System.out.println("My name is: " + s1);
    }
}