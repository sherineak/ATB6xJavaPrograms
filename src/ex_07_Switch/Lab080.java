package ex_07_Switch;

import java.util.Scanner;

public class Lab080 {
    public static void main(String[] args) {
        // If Else  - Condition (if , else if , else ) - Multiple condition
        // Switch multiple condition

        // Which day it is ?
        // 1 - monday .. 7-> Sunday
        // Create a simple pgm --> User will enter a number, Will will tell to user which is  this
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  your Number , will say which day is this ");
        int day = sc.nextInt();

        switch (day){
            case 1 :
                System.out.println("Mon");
                break;
            case 2 :
                System.out.println("Tue");
                break;
            case 3 :
                System.out.println("Wed");
                break;
            case 4 :
                System.out.println("Thu");
                break;
            case 5 :
                System.out.println("Fri");
                break;
            case 6 :
                System.out.println("Sat");
                break;
            case 7 :
                System.out.println("Sun");
                break;
            default:
                System.out.println("Only numbers 1-7 are allowed");
        }
        System.out.println("---End Of The Program---");
        sc.close();
    }
}
