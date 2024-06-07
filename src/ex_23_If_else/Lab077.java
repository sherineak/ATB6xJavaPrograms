package ex_23_If_else;

import java.util.Scanner;

public class Lab077 {
    public static void main(String[] args) {
        // Interview
        //Grade calculator
        // A : 90 -100
        // B : 80-89
        //C : 70-79
        //D: 60 -69
        //F: 0-59

        //1. find user inputs
        //Score - data type -int
        //return --> grade --> data type -> char
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your mark: ");
        int score = sc.nextInt();

        char grade = 'F';

        if(score<=100 && score>=90){
            grade = 'A';
        }
        else if (score<=89 && score >=80){
            grade ='B';
        }
        else if (score<=79 && score >=70){
            grade = 'C';
        } else if (score <=69 && score >=60) {
            grade = 'D';
        } else if (score <=0 || score > 100) {
            System.out.println("Loll!!, are you god");
        } else {
            grade ='F';
        }
        System.out.println("Your grade ->"+grade);
    sc.close();
    }
}
