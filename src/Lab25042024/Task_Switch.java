package Lab25042024;

import java.util.Scanner;

public class Task_Switch {
    public static void main(String[] args) {
        //Program to perform Arithmetic operations

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your First Number");
        int num1 = sc.nextInt();
        System.out.println("Enter Your Second Number");
        int num2 = sc.nextInt();

        System.out.println("Enter your arithmetic operation to perform");
        char ar_op = sc.next().charAt(0);

        switch (ar_op){
            case '+':
                System.out.println("Sum : "+(num1+num2));
                break;
            case '-':
                System.out.println("Subtraction : "+(num1-num2));
                break;
            case '*':
                System.out.println("Multiplication : "+(num1*num2));
                break;
            case '/':
                System.out.println("Division : "+(num1/num2));
                break;
            case '%':
                System.out.println("Modulus : " +(num1%num2));
                break;
            default:
                System.out.println("None");

        }
    }
}
