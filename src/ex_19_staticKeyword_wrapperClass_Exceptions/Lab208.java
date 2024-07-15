package ex_19_staticKeyword_wrapperClass_Exceptions;

public class Lab208  {

    // anonymous class
    public static void main(String[] args) {
        ABC abc = new ABC() {
            @Override
            void m1() {
                System.out.println("m1");
            }
        };
        abc.m1();

        I1 i = new I1() {
            @Override
            public void m2() {
                System.out.println("m2");
            }
        };
        i.m2();
    }
}

abstract class ABC{
    abstract void m1();
}

interface I1{
    void m2();
}