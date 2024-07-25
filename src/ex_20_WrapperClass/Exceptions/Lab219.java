package ex_20_WrapperClass.Exceptions;

public class Lab219 {
    public static void main(String[] args) {
        String sh = args[0];     // 5    passing the value from edit configuration by select above 3 dots
        int x = Integer.parseInt(sh);
        int a = 10/x;  // 10/5 --> 2

        System.out.println(x);  //5
        System.out.println(a);   //2

        // Test case for the program
        // 5 -> Happy
        // No input ->  java.lang.ArrayIndexOutOfBoundsException
        // 0 ->  java.lang.ArithmeticException
        //-5  ->
        //2.5 ->  java.lang.NumberFormatException
        // Sherine ->  java.lang.NumberFormatException
        //#$%^&  -> java.lang.NumberFormatException

    }
}
