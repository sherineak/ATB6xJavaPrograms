package ex_05;

public class Lab066 {
    public static void main(String[] args) {
        // Ternary operator
        // max and min between a and b;
        int a = 10;
        int b = 20;
        int max = a<b? b : a;
        int min = a<b? a : b;
        System.out.println("max:"+max);
        System.out.println("min:"+min);

    }
}
