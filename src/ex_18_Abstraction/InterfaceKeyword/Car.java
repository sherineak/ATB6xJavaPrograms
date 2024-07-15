package ex_18_Abstraction.InterfaceKeyword;

public class Car implements Brake,Engine{
    @Override
    public void applyBrake() {
        System.out.println("Applying Break");

    }

    @Override
    public void startEngine() {
        System.out.println("Starting Engine");

    }

    @Override
    public void stopEngine() {
        System.out.println("Stopping Engine  ");

    }
}
