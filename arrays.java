class arrays {
    public static void main(String[] args) {
        // 1-D arrays in java.
        int[] arr = new int[3];
        arr[0] = 1000;
        arr[1] = 2000;
        arr[2] = 3000;
        // Accessing array element's
        System.out.println(arr[0]);

        System.out.println(arr.length);

        System.out.println("Forloop starts...");
        for (int a = 0; a < arr.length; a++) {
            // Body of the loop executes
            System.out.println("Element at index " + a + " is" + " " + arr[a]);
        }

        arr[0] = 5000;
        System.out.println("Updated memory slot is:" + arr[0]); // 5000

        // 2-D Array's in java.
        int[][] arrays = new int[2][3];
        arrays[0][0] = 150;
        arrays[0][1] = 250;
        arrays[0][2] = 350;
        arrays[1][0] = 450;
        arrays[1][1] = 550;
        arrays[1][2] = 650;
        // Accessing the inner array element's
        System.out.println(arrays[1][2]);

        // for (int k = 0; k < arrays.length; k++) {
        // for (int j = 0; j < arrays.length; j++) {
        // // System.out.print(k);
        // System.out.print(j);
        // }
        // }

        for (int k = 0; k < 2; k++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(k);
                System.out.println(j);
            }
        }
    }
}


/* 
1st iteration --
initially k sets to 0 (k = 0)
j = 0 
    k = 0
    j = 0
j = 1
    k = 0
    j = 1
j = 2
    k = 0
    j = 2

2st iteration --
k sets to 1 (k = 1)

j = 0
    k = 1
    j = 0
j = 1
    k = 1
    j = 1
j = 2
    k = 1
    j = 2

3st iteration --
k sets to 2 (k = 2)

j = 0
    k = 2
    j = 0
j = 1
    k = 2
    j = 1
j = 2
    k = 2
    j = 2

o/p: 000102101112202122
*/
