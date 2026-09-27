import java.util.Scanner;

public class Methods {
    // Custom method
    public void multiplynums(int x, int y) {
        int result;
        if (x < 0 || x == 0 || y < 0 || y == 0) {
            System.out.println("Dear User, Negative numbsejnvgkjsnfrers or zero number's are not allowed");
        } else {
            result = x * y;
            System.out.println("Multipsfsfsfdflassassasication of two nums is: " + result);
        }
    }

    public static void main(String[] args) {
        // Task is to perform the multiplication of two nums pair of 3 times.
        int num1;
        int num2;

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Number - 1");
        num1 = obj.nextInt();
        System.out.println("Dear user, Your entered number is: " + num1);
        System.out.println("Enter Number - 2");
        num2 = obj.nextInt();
        System.out.println("Dear user, Your entered number is: " + num2);

        Methods refvar = new Methods();
        refvar.multiplynums(num1, num2);

        int num3;
        int num4;

        System.out.println("Enter Number - 1");
        num3 = obj.nextInt();
        System.out.println("Dear user, Your entered number is: " + num3);
        System.out.println("Enter Number - 2");
        num4 = obj.nextInt();
        System.out.println("Dear user, Your entered number is: " + num4);

        refvar.multiplynums(num3, num4);

        int num5;
        int num6;

        System.out.println("Enter Number - 1");
        num5 = obj.nextInt();
        System.out.println("Dear user, Your entered number is: " + num5);
        System.out.println("Enter Number - 2");
        num6 = obj.nextInt();
        System.out.println("Dear user, Your entered number is: " + num6);

        refvar.multiplynums(num5, num6);

        obj.close(); // closing the scanner object


        // int num3;
        // int num4;
        // int task2;
        // System.out.println("Enter Number - 3");
        // num3 = obj.nextInt();
        // System.out.println("Dear user, Your entered number is: " + num3);
        // System.out.println("Enter Number - 4");
        // num4 = obj.nextInt();
        // System.out.println("Dear user, Your entered number is: " + num4);

        // if (num3 < 0 || num3 == 0 || num4 < 0 || num4 == 0) {
        // System.out.println("Dear User, Negative numbers or zero number's are not
        // allowed");
        // } else {
        // task2 = num3 * num4;
        // System.out.println("Multiplication of two nums is: " + task2);
        // }

        // int num5;
        // int num6;
        // int task3;
        // System.out.println("Enter Number - 5");
        // num5 = obj.nextInt();
        // System.out.println("Dear user, Your entered number is: " + num5);
        // System.out.println("Enter Number - 6");
        // num6 = obj.nextInt();
        // System.out.println("Dear user, Your entered number is: " + num6);

        // if (num5 < 0 || num5 == 0 || num6 < 0 || num6 == 0) {
        // System.out.println("Dear User, Negative numbers or zero number's are not
        // allowed");
        // } else {
        // task3 = num5 * num6;
        // System.out.println("Multiplication of two nums is: " + task3);
        // }
    }
}
