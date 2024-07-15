package ex_18_Abstraction.abstractKeyword.Class_ex;

public class Car extends Engine{
    @Override
    void start() {
        System.out.println("Starting Car");

    }

    @Override
    void stop() {
        System.out.println("Stopping car");

    }

    @Override
    void partGearBox() {
        System.out.println("Assemble the Gear Box");
    }
}
