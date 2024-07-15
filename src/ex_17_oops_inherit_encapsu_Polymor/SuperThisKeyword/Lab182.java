package ex_17_oops_inherit_encapsu_Polymor.SuperThisKeyword;

public class Lab182 {
    public static void main(String[] args) {
        Student s = new Student();
        s.message();
        s.display();
    }
}


class Student extends Person{
    void message(){
        System.out.println("I am a Student");
    }
    void display(){
        this.message();   //  To call my own class method message()
        super.message();  // To call parent class function
    }
}



class Person{
    void message(){
        System.out.println("I am a person");
    }
}