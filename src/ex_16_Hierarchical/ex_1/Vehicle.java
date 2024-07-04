package ex_16_Hierarchical.ex_1;

public class Vehicle {
    // Default Constructor
    Vehicle(){
        System.out.println("DC Vehicle");
    }

    // Method
    void vehicleHasTopSpeed(){
        System.out.println("Yeah from " + getClass().getSimpleName() );  // function to get class name
    }
}
