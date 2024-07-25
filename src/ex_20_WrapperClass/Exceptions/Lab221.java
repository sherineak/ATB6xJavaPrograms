package ex_20_WrapperClass.Exceptions;

public class Lab221 {
    public static void main(String[] args) {
       try{
           String s = "Sherine";
           String s1 = args[0];  //ArrayIndexOutOfBoundsException
           int a = 10/0;   //ArithmeticException
           s = null;     //NullPointerException
           System.out.println(s.trim());

       }catch (ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException e){
           System.out.println("Something Went Wrong");
       }catch (Exception e){
           System.out.println(e.getMessage());
       }
        System.out.println("End of the Program");

    }
}
