public class Demo {
    public static void main(String[] args) {
        String a = "Hello";
        String str = new String(a);
        System.out.println(a);
        System.out.println(str);
        System.out.println(a == str);
        System.out.println(a.equals(str)); // true

        // intern() method.
        String checkString = str.intern();
        System.out.println(a == checkString); // true
        System.out.println(str == checkString); // false

        String b = new String();
        System.out.println(b);

        // Jagged array.
        int[][] arr = new int[2][3];
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[0][0]);
        System.out.println(arr[1][2]);
    }
}
