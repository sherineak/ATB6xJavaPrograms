package ex_19_staticKeyword_wrapperClass_Exceptions;

public class Lab205  {
    public static void main(String[] args) {

    }
}

class OuterClass{
    int a =10;
    class InnerClass{
        void m2(){
            System.out.println("Hi" +a);
        }
    }
}
