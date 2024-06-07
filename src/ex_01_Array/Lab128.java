package ex_01_Array;

public class Lab128 {
    public static void main(String[] args) {
        int a[] = {27, 31, 39, 33};
        //int[] a1 = {27, 31, 33, 36};   // can use this and above declarations
        System.out.println(a.length);

        //How to print all elements ?
        // condition or  loop -> ans : loop is to print all elements
        // for loop
        for(int i=0;i<a.length;i++){    // loop for array should start from for 0 for initialization
            System.out.println(a[i]);
        }

    }
}
