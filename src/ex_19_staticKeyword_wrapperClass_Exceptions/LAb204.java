package ex_19_staticKeyword_wrapperClass_Exceptions;

public class LAb204 {
    public static void main(String[] args) {
        A a = new A();
        A b = new A();

        //System.out.println(A.age); "Non- static variable age can not be referenced from static context "
        System.out.println(A.common);
        System.out.println(a.common);
        System.out.println(b.common);

        A.m1();   // class access Static method
        a.m1();   // reference can access static
        b.m1();   // reference can access static

        //A.m2();   // class can't access non-static method
        a.m2();   // reference can access non - static
        b.m2();   // reference can access non - static

        A c = null;
        A.m1();
        c.m1();  // static can execute , if reference point to Null becoz class loaded
        c.m2();   // as object reference c point to Null, Instance can't access
    }


}

class A{
    int age =10; // Non-static variable
    static String common ="ABC";
    static {
        System.out.println("SIB - A");
    }
    {
        System.out.println("IIB - Instance initialization Block");
    }
    static void m1(){
        System.out.println("m1");
    }
    void m2(){
        System.out.println("m2");
    }
}
