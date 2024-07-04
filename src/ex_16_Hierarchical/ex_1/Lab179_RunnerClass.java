package ex_16_Hierarchical.ex_1;

public class Lab179_RunnerClass {
    public static void main(String[] args) {

        Car c = new Car();       // here will call default constructors of both car (child) vehicle (Parent)
        c.vehicleHasTopSpeed();

        Vehicle v = new Car();  // Dynamic Dispatch so will call the functions of object create class so here child, and child will call default constructor of parent also
        v.vehicleHasTopSpeed();
    }
}
