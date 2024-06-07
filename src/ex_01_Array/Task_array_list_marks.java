package ex_01_Array;

import java.util.Scanner;

public class Task_array_list_marks {
    public static void main(String[] args) {
        //Create a Program which takes arrays and print all the marks
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter sub 1 mark ");
        int[] markes = new int[3];
        System.out.println("Enter sub 1 mark ");
        markes[0] = sc.nextInt();
        System.out.println("Enter sub 2 mark ");
        markes[1] = sc.nextInt();
        System.out.println("Enter sub 3 mark ");
        markes[2] = sc. nextInt();

        for(int i =0; i<markes.length;i++){
            if(markes[i] < 30){
                System.out.println("failed subject mark " +markes[i]);
                continue;
            }
            System.out.println(markes[i]);
        }
    sc.close();
    }
}
