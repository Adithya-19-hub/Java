class Calculator {
    // Method overloading using custom method's
    static int add(int a, int b) {
        return a + b;
    }

    static long add(long a, long b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    static int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    static float add(float a, float b, float c, float d, float e) {
        return a + b + c + d + e;
    }

    // Bonus challenge question.
    static void add(int[] nums) {
        // System.out.println(nums[0] + nums[1] + nums[2]);
        int sum = 0;
        for (int a = 0; a < nums.length; a++) {
            sum += nums[a];
        }
        System.out.println(sum);
    }

    public static void main(String args[]) {
        int result1 = add(2, 2);
        int result2 = add(2, 2, 2);
        int result3 = add(2, 2, 2, 2);
        float result4 = add(2.2F, 2.2F, 2.2F, 2.2F, 2.2F);
        int[] arr = new int[3];
        arr[0] = 100;
        arr[1] = 100;
        arr[2] = 100;
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        add(arr);
        // Bonus result
        // System.out.println(bonus);
    }
}
