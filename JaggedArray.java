public class JaggedArray {
    public static void main(String[] args) {
        // Jaggedarray in java
        int[][] array = new int[3][];
        System.out.println(array[0]); // null
        System.out.println(array[1]); // null
        array[0] = new int[2]; // Inner array with size 2 will be created for the first outer array.
        array[1] = new int[2];
        array[2] = new int[3];
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        // If i access the innerarray without initializing the values, then i will get 0 in output in bydefault.
        // Example:
        System.out.println(array[0][0]); // 0
        array[0][0] = 100;
        array[0][1] = 500;
        // array[0][2] = 100;

        System.out.println(array[0][0]);


        // Normal flow of program execution.
        System.out.println("Code finished....");
        System.out.println("ThankYou....");
    }
}