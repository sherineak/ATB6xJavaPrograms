package ex_23042024;

import java.util.Scanner;

public class Task5_if_else_prime_number {
    public static void main(String[] args) {
        // Prime number or not

        // 12           /     3  =  4
        // Dividend    ||     Divisor  || Quotient
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number to identify prime or not");
        int num = sc.nextInt();
        int count = 0;

        if(num <= 1){
            System.out.println("The number is not a prime number");
        }else {
            for(int i=2;i < num;i++){
                if (num%i==0){
                    count = 1;
                    System.out.println("The number is not a prime number");
                    break;

                }
            }
        }
        if(count == 0){
            System.out.println(num+ " is prime number");
        }
       sc.close();
    }
}
