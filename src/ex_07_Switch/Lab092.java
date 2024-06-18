package ex_07_Switch;

import java.util.Scanner;

public class Lab092 {
    public static void main(String[] args) {
        // program to check grade based on marks
       // mark/10 -> 99/10 -> Grade A
        //mark/20 -> 88/10 -> Grade B
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks");
        int mark = sc.nextInt();

        mark = mark/10;
        System.out.println(mark);

        switch(mark){
            case 9:
                System.out.println("Garde A");
                break;
            case 8:
                System.out.println("Grade B");
                break;
            case 7:
                System.out.println("Grade C");
                break;
            case 6:
                System.out.println("Grade D");
                break;
            case 1:
                System.out.println("You Fail");
                break;
            default:
                System.out.println("NONE");
        }
    }
}
