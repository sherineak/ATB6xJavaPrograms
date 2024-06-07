package ex_01_Array;

public class Lab125 {
    public static void main(String[] args) {
        int[] a = new int[4];
        //by default a[0,0,0,0]
        // IN JVM |0,0,0,0|
        a[3] = 90;
        System.out.println(a[3]);
    }
}
