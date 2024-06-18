package ex_09_Array;

import java.util.Scanner;

public class Lab132 {
    public static void main(String[] args) {
        // Print marks
        Scanner sc = new Scanner(System.in);
        float[] marks = new float[4];
        System.out.println("Enter the sub 1 Mark");
        marks[0] = sc.nextFloat();
        System.out.println("Enter the sub 2 Mark ");
        marks[1] = sc.nextFloat();
        System.out.println("Enter the sub 3 Marks");
        marks[2] = sc.nextFloat();
        System.out.println("Enter the sub 4 Marks");
        marks[3] = sc.nextFloat();

        for(int i =0; i<marks.length; i++){
            if(marks[i] < 30){
                System.out.println("Failed in this subject " +marks[i]);
                continue;
            }
            System.out.println(marks[i]);
        }


        // While loop

        int j =0;
        while(j<marks.length){
            System.out.println(marks[j]);
            j++;
        }

        sc.close();

    }
}
