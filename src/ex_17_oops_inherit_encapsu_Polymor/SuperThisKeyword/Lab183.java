package ex_17_oops_inherit_encapsu_Polymor.SuperThisKeyword;

public class Lab183 {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        //Person1 pc1 = new Person1();
        //if child has default constructor will be called by super() automatically in Java

        //super.variable
        //super.method();
        //super()  --> Default constructor
        //super("Sherine")  --> parameterized constructor



    }
}

class Person1{
    Person1(){
        System.out.println("Person1 - Default Constructor");
    }
    Person1(String a){  // parameterized constructor
        System.out.println("Person 1 : Parameterized constructor");
    }
}

class Student1 extends Person1{
    Student1(){
        //super();
        super("sherine");   // this is the key word , but without super key word also it wil work if child has default constructor will be called by super() automatically in Java
        System.out.println("Student1 - Default constructor");

    }
}