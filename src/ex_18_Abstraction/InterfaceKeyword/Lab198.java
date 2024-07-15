package ex_18_Abstraction.InterfaceKeyword;

public class Lab198 {
    public static void main(String[] args) {
        Car c = new Car();
        c.applyBrake();
        c.startEngine();
        c.stopEngine();

        //default
        c.haltingEngineJustStart();
        c.haltingEngineJustSTop();
    }
}
