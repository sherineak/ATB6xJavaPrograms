package ex_20042024;

public class Task2 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + a++ + a++);
        //part A - > exp 11  a =11
        //part B - > exp 11  a =12
        //part C - > exp 12  a =13

        int b= 10;
        System.out.println(--b + b++ + ++b);
        //part A - > exp 9  a =9
        //part B - > exp 9  a =10
        //part C - > exp 11  a =11


    }
}
