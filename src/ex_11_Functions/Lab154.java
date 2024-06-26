package ex_11_Functions;

import java.util.Scanner;

public class Lab154 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your two numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

     int r_sum = sum(num1, num2);
     int r_sub = sub(num1,num2);
     int r_sum2 = sum(24,67);
     int r_mul = mul(num1,num2);


        System.out.println("Sum is-->" +r_sum);
        System.out.println("Sum is-->" +r_sum2);
        System.out.println("Sub is -->" +r_sub);
        System.out.println("Mul is -->" +r_mul);

    }

    private static int sub(int num1, int num2) {
        return num1-num2;
    }

    private static int mul(int num1, int num2) {
        return num1*num2;
    }

    static int sum(int num1, int num2) {
        return num1+num2;
    }
}
