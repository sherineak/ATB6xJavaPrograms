package ex_08_for_while_DoWhile_loop;

import java.util.Scanner;

public class Lab120 {
    public static void main(String[] args) {
        // factorial program
        // 1! -> 1
        //2! -> 1* 2
        //3! -> 1*2*3 -> 6
        //4! -> 1*2*3*4 -> 24
        //5! -> 1*2*3*4*5 ->120
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int fact =1;

        // A - > int i=1;
        //B -> i<= num
        // c  -> i++

        for(int i =1 ;i<=5 ; i++){
            fact = fact * i;
        }
        System.out.println(fact);



    }
}
