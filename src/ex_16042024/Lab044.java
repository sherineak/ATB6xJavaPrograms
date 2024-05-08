package ex_16042024;

public class Lab044 {
    public static void main(String[] args) {
        // Increment (++) / Decrement (--) operator
        //Pre & post
        //pre -> value is incremented first , and then the result is computed

        int a = 10;   //++a -> a = a + 1;
        int b = ++a; // a = a+1     First increment then assign

        //a= 11
        //b = 11
        System.out.println(a); // ans : 11
        System.out.println(b);   // ans : 11

        int a1 = 10;
        int b1 = a++;  // first assign, then increment

        System.out.println(a1); // ans a1 = 10
        System.out.println(b1); // ans b1  = 11



    }
}
