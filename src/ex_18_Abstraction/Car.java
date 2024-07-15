package ex_18_Abstraction;

abstract public class Car {
    public Car() {
    }
    void gearBox(){
        System.out.println("GearBox is working");
    }
    abstract void drive();
}
