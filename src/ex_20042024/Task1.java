package ex_20042024;

public class Task1 {
    public static void main(String[] args) {

        // MAx between 3 Number with ternary Operators
        int a = 25;
        int b = 30;
        int c = 20;

        int max = (a<b)? ((b<c)?c:b):((a<c)? a:c);
        System.out.println(max);
    }
}
