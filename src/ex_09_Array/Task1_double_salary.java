package ex_09_Array;

import java.util.Arrays;

public class Task1_double_salary {
    public static void main(String[] args) {
        //Create a Program to double an array and store it also. {1,2,3} -> {2,4,6}
        // Pramod Sir explained way
        int[] arr1 = { 1, 2, 3, 4};
        System.out.println("First array " + Arrays.toString(arr1));
        int[] arr2 = new int[4];

        for(int i=0; i < arr1.length; i++){
            System.out.println(arr2[i] = arr1[i]*2);
        }

        System.out.println("Printing Arrays");
            System.out.println("Second array" + Arrays.toString(arr2)); // OR below for loop to use
            System.out.println(arr2);  // its reference address

        for (int i =0; i<arr1.length;i++){
            System.out.println(arr2[i]);
        }


    }
}
