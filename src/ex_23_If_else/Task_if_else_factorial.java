package ex_23_If_else;

import java.util.Scanner;

public class Task_if_else_factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to find factorial");
        int num = sc.nextInt();

        int fact =1;

        for(int i =1; i<=num; i++){

           fact = fact * i;
        }
        System.out.println(fact);
        sc.close();
    }
}
