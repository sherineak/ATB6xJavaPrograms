package ex_06_If_else;

import java.util.Scanner;

public class Lab076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number>20){
            System.out.println("The number is > 20");
        }else if (number > 10)
            System.out.println(" The number between 10 and 20");
        else {
            System.out.println("The number is < 20");
        }
        sc.close();
    }
}
