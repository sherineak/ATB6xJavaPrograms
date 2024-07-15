package ex_17_oops_inherit_encapsu_Polymor.SuperThisKeyword;

public class Lab181 {
    //Super keyword in java
    // Super in variables
    public static void main(String[] args) {

        Car c = new Car();
        c.display();

    }
}

class Car extends Vehicle{
    int max_speed = 180;     // instance Variable
    void display(){
        System.out.println("Max speed of vehicle can be " +super.max_Speed); // to cal my parent class instance variable
        System.out.println("Max speed of car can be " +this.max_speed); // to call my Class instance variable
    }

}

class Vehicle{
    int max_Speed = 100;   // instance Variable
    void message(){
        System.out.println("This is a vehicle class");
    }
}