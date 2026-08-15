public class formatString {
    public static void main(String[] args) {
        // Format String. - whenever we use System.out.printf() or System.out.format(),
        // inside the double quotes whatever we write that will become format string.
        // in the format string, to access the data generally we use % along with
        // literal.

        char var = 'A'; // 65
        String name = "Adithya";

        // System.out.printf("char is: %c and the name is: %s", var, name); // correct
        // way of using format string.
        // System.out.printf("the name is: %s and char is: %c", name, var); // correct
        // // way of using format string.
        // System.out.printf("the name is: %s and char is: %c", var,name); // wrong way
        // of using format string.
        //System.out.printf("the name is: % and char is: %", name, var); // wrong way of using format string.

        // Another way of using format string in java.
        //System.out.format("char is: %c and name is %s",var,name);


    }
}
