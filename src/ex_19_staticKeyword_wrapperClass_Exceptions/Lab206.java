package ex_19_staticKeyword_wrapperClass_Exceptions;

public class Lab206  {
    public static void main(String[] args) {

        Car c = new Car("Lambo");
        c.drive();

        Car.Engine egne = c.new Engine("100cc");
        egne.start();
    }
}

class Car{
    String make;
    public Car(String make) {
        this.make = make;
    }
    // method
    void drive(){
        System.out.println("You can drive a car");
    }
    // Inner Class
    class Engine{
        //instance variable
        String horsePower;

        public Engine(String horsePower) {
            this.horsePower = horsePower;
        }
        void start(){
            System.out.println("Engineer is started"+make);
        }
        class Gear{
            void m2(){
                System.out.println("m2");
            }
        }
        class pp{

        }
    }
}
