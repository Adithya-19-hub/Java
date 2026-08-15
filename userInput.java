// Taking input from the user.
import java.util.Scanner;

public class userInput{
    // Function block.
    public static void main(String args[]){
        System.out.println("Hello world");
        // Scanner object in java.
        Scanner first = new Scanner(System.in);
        // String var1 = first.next(); // It reads only single word.
        // System.out.println("My name is:" + var1);
        // String word2 = first.nextLine(); // It reads the entire text in the string including white spaces.
        // System.out.println("Output:" + word2);
        // double var1 = first.nextDouble();
        // boolean var2 = first.nextBoolean();
        // String sc = first.next();
        // System.out.println("Output is:" + sc);
        // boolean var1 = first.hasNextLine();
        // System.out.println("Output is:" + var1);
        // System.out.println(true);
        int num = first.nextShort();
        System.out.println("Output is:" + num);

        String str = first.nextLine();
        System.out.println(str);
    }
}