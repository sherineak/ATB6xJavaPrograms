package ex_20_WrapperClass;

public class Lab218 {
    public static void main(String[] args) {
        // Exceptions
        //
        String s1 = null;
        s1.trim();  //NullPointerException: Cannot invoke "String.trim()" because "s1" is null

        int a = 10;
        int x = a/0;  // we can't divide by 0 in arithmetic operation  //NullPointerException: Cannot invoke "String.trim()" because "s1" is null
        System.out.println(x);
    }
}
