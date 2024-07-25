package ex_20_WrapperClass.Exceptions;

public class Lab222 {
    public static void main(String[] args) {
        // finally
        final double pi = 3.14;

      try{
          int a =0;
          int b =10/0;
          System.out.println(b);
      }catch (Exception e){
          System.out.println("Exit");
      }finally {
          System.out.println(" Iam finally ");
      }


    }
}
