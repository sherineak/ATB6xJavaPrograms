package ex_17_oops_inherit_encapsu_Polymor.Poly.MethodOverLoading;

public class Lab189 {

    //Constructor over loading already studied
    Lab189(){
    }
    Lab189(int a){
    }
    Lab189(String a){
    }
    Lab189(int a, String b ){

    }
    Lab189(int a, int b){

    }
    //Method overloading --> Multiple methods with same name , but different argument
    //Order also matter - if order is different it will consider as different

    void gif(String s){
        System.out.println("s is a String "  +s);
    }
    void gif(int s){
        System.out.println("s is a int "  +s);
    }
    void gif(float s){
        System.out.println("s is a float "  +s);
    }
    void gif(double s){
        System.out.println("s is a double "  +s);
    }

// Creating Runner class
public static void main(String[] args) {
    Lab189 l = new Lab189();
    l.gif(10);   // it will match line 10 method with int
}
}
