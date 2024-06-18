package ex_06_If_else;

import java.util.Scanner;

public class Lab075 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first  number :");
        int num1 = sc.nextInt();

        System.out.println("Enter the Second   number :");
        int num2 = sc.nextInt();



        if(num1>num2){
            //(num2 > num1)
            //(num1 == num2)
            System.out.println("Max is ->"+num1);
        }else {
            System.out.println("Max is ->" +num2);
        }

        int max = Math.max(20,8);  // can do using math function as well
        System.out.println("The Max by math.max fun() ->"+max);
    }
}
