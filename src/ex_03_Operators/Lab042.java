package ex_03_Operators;

public class Lab042 {
    public static void main(String[] args) {


        int a1 = 300;
        byte b1 = (byte) a1; // Explicit casting
        System.out.println(b1);  // Result is 44
        // 300 -> 32 bits -> 00101101101001101100000100111110
        //  byte -> 1 Byte - > 8 bits  // take last 8 bits value
        // 44

    }
}
