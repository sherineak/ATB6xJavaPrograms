package ex_25_Switch;

import java.util.Scanner;

public class Lab090 {
    public static void main(String[] args) {
        //  3/ x ^ 2 + y ^ 3 - |Z|
        //a + b + c, A-> x^2 , B-> Y^3 , C-> |Z|  abs(Z) -> -1 > 1, -2 -> 2

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of X");
        double x = sc.nextDouble();
        System.out.println("Enter the value of Y ");
        double y = sc.nextDouble();
        System.out.println("Enter the value of Z");
        double z =sc.nextDouble();

        double result;
        //  3/ x ^ 2 + y ^ 3 - |Z|
        //a + b + c, A-> x^2 , B-> Y^3 , C-> |Z|  abs(Z) -> -1 > 1, -2 -> 2

        result = Math.cbrt(Math.pow(x,2) + Math.pow(y,2) - Math.abs(z));
        System.out.println(result);
        sc.close();
    }
}
