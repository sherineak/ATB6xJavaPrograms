package ex_23042024;

import java.util.Scanner;

public class Task2_If_loop {
    public static void main(String[] args) {
        //Largest in Three Number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three Numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if(num1 >= num3 && num1 >= num2 ){
            System.out.println("The largest Number is: " + num1);
        }else if(num2 >= num3){
            System.out.println("The largest number is: " +num2);
        }else {
            System.out.println("The largest number is: " +num3);
        }
sc.close();
    }
}
