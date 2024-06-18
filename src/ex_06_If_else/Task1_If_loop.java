package ex_06_If_else;

import java.util.Scanner;

public class Task1_If_loop {
    public static void main(String[] args) {
        //Program to Check if a Number is Positive, Negative, or Zero.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to identify Positive , negative and Zero-->");
        int num = sc.nextInt();

        if(num>0){
            System.out.println("The number is positive");
        }else if(num==0){
            System.out.println("The number is Zero");
        }else {
            System.out.println("The number is negative");
        }
        sc.close();
    }
}
