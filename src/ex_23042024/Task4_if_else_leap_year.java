package ex_23042024;

import java.util.Scanner;

public class Task4_if_else_leap_year {
    public static void main(String[] args) {
  // Create a program that determines whether a given year is leap year or not
  //A leap year is divisible by 4 , but not by 100, It is also divisible by 400 and 100

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = sc.nextInt();

        if(year%4 == 0 && year%100 !=0){
            System.out.println("The year is a leap year");
        }else if (year%400 == 0 && year%100 == 0){
            System.out.println("The year is a leap year");
        }else {
            System.out.println("The year is not a leap year");
        }
        sc.close();
    }
}
