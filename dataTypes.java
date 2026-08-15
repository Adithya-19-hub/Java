public class dataTypes {
    public static void main(String args[]){
        // Primitive datatypes in java.
        // Basically Java supports 8 primitive datatypes.(Int,short,long,double,float,boolean,char,byet)
        // Int, -> Takes 4 bytes which is 32 bit box will be allocate in the memory.
        // byte, -> Takes 1 bytes which is 8 bit box will be allocate in the memory.
        // short, -> Takes 2 bytes which is 16 bit box will be allocate in the memory.
        // long, -> Takes 8 bytes which is 64 bit box will be allocate in the memory.
        // float, -> depends on the docs.
        // boolean, -> depends on the JVM.
        // double, -> Takes 8 bytes which is 64 bit box will be allocate in the memory.
        // char, -> Takes 2 bytes which is 16 bit box will be allocate in the memory.
        // Generally value of the variable will get store in the memory in the form of binary code(0's and 1's format).
        // No matter how much big the data is or small, in the memory bit box size will always full  with 0's and 1's.
        // char is also a silently an integer in java.
        // How negative nums store in side the memory?
        // --> First computer store 0's and 1's for postive number, ex:For -2, bit box hold the positive 0's and 1's and then later computer flips the box means all the 0's become 1 and all the 1 become 0's for negative integer.
        // String object is the only thing which supports '+' operator to concatinate two strings.

        short var1 = -2; // 0, 1 is the binary code for 2.
        System.out.println(var1);

        int var2 = 20; // 1,0,1,0,0 is the binary code for 20.
        System.out.println(var2);
        
        char var3 = 'b'; // Depends on Unicode.
        System.out.println(var3);

        long var4 = 788777676667L;
        System.out.println(var4);

        byte var5 = 122; // 1,0,1,1 is the bc.
        System.out.println(var5);

        double var6 = 20.2;
        System.out.println(var6);

        int var7;
        // System.out.println(var7); // java throws compilation error.

        boolean var8 = false;
        System.out.println(var8);

        float var9 = 10.1F;
        System.out.println(var9);
    }
}
