package ex_20_WrapperClass.Exceptions;

public class Lab211 {
    public static void main(String[] args) {

        try {
            String s = args[0];
            int a = Integer.parseInt(s);
            int b = a / 0;
            System.out.println(a);
            System.out.println(b);
        }catch (ArithmeticException | NumberFormatException | ArrayIndexOutOfBoundsException e){
            System.out.println("Problem with code");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
