package ex_01_Array;

public class Lab123 {
    public static void main(String[] args) {
        // Array
        // Collection of similar datatypes

        // Can bdefine 2 types
        int[] ages = {27, 31, 32, 33,34};  //  5 elements   // First method
        System.out.println(ages);     // its print reference address, not element
        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[4]);

        System.out.println(ages.length);
        System.out.println(ages[-1]); //// Error -ArrayIndexOutOfBoundsException
        System.out.println(ages[5]);   // Error -ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
                                      //Process finished with exit code 1


        int[] age2 = new int[5];             // Second method
        age2[0] = 27;
        age2[1] = 31;
        age2[2] = 32;
        age2[3] = 33;
        age2[4] = 34;


    }
}
