package ex_23_If_else;

import java.util.Scanner;

public class Lab079 {
    public static void main(String[] args) {

        // Triangle classifier
        // Write a program that classifies a triangle based on its side length
        //Given three input values representing th elength of the sides , determine

        // if the triangle is equilateral (All sides are equal)
        // isosceles (exactly two sides are equal
        //Scalene ( no sides are equal)
        //use an if - else statement to classify the triangle

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side1,side2,side3, will tell you what triangle is this");
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();

        if(side1 == side2 && side1 == side3 && side2 == side3){
            System.out.println("The triangle is equilateral ");
        }else if(side1 == side2 || side1 == side3 || side2 ==side3){
            System.out.println("The triangle is isosceles ");
        }else {
            System.out.println("The triangle is Scalene");
        }
    }
}
