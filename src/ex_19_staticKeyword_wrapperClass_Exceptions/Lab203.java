package ex_19_staticKeyword_wrapperClass_Exceptions;

//Static - Variable , class, method
// Static variables, method, block  can'be accessed by class
// theuy belong to class
// they are loaded when class is loaded
// static block - its block of code , and its executed one time when class is loaded

public class Lab203 {
    public static void main(String[] args) {
        Person p1 = new Person("Sherine");
        Person p2 = new Person("Preethi");
        System.out.println(Person.footballClub);

        // To access static method --.
        Person.m1();     //className.method

        p1.m2();    // non-static or normal method
        p2.m2();

    }
}

class Person{
     static String footballClub = "Star Club";
     String name;

     static {
         System.out.println("static only one time when class executed  ");
     }
    {
        System.out.println("IIB - Initialization Block ");
    }

    public Person(String name) {  //   ---> PC parameterized constr
        this.name = name;
    }
    // static function
    static void m1(){
        System.out.println("I am a common function");
    }
    // non- static
    void m2(){
        System.out.println("Person name " +this.name);
    }

}
