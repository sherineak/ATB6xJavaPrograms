package ex_01_Array;

import java.util.Arrays;

public class Task_double_salary {
    public static void main(String[] args) {
        //Create a Program to double an array and store it also. {1,2,3} -> {2,4,6}
        int[] arr1 = { 1, 2, 3, 4};
        System.out.println("First array " + Arrays.toString(arr1));
        int[] arr2 = new int[arr1.length];  //declared new array
        // OR   int arr2 = new int[3]


        for(int i=0; i < arr1.length; i++){
         int result = arr1[i]*2;     // calculated double of a array and stored it in a variable
            System.out.println(result);
            arr2[i] = result;        // stored in a variable

        }
        System.out.println("Doubles the array"+ Arrays.toString(arr2)); // used method to print

    }
}
