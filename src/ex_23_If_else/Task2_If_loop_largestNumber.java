package ex_23_If_else;

import java.util.Scanner;

public class Task2_If_loop_largestNumber {
    public static void main(String[] args) {
        //Largest in Three Number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three Numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if(num1 >= num3 && num1 >= num2 ){
            System.out.println("The largest Number is: " + num1);
        }else if(num2 >= num1 && num2>=num3 ){
            System.out.println("The largest number is: " +num2);
        }else {
            System.out.println("The largest number is: " + num3);
        }
        // Do the above pgm using Ternary operator
            // ? -> condition? (if true)-> do this : if else -> do that

        int largest = (num1>num2 && num1>num3)? num1:(num2>num1 && num2>num3)?num2:num3;
        System.out.println("Largest number using ternary operator : "+largest);


sc.close();
    }
}
