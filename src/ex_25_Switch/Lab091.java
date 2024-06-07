package ex_25_Switch;

import java.util.Scanner;

public class Lab091 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();

        System.out.println("Enter you age");
        int age = sc.nextInt();

        System.out.println("Enter your salary");
        double salary = sc.nextDouble();

        System.out.println("Your Name is " + name);
        System.out.println("Your age is " + age);
        System.out.println("Your Salary is " + salary);

        sc.close();
    }
}
