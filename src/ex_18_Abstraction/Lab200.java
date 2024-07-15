package ex_18_Abstraction;



public class Lab200 {
}
class Pramod extends B1{

    @Override
    void mtb() {
        System.out.println("Mtb Completed");
    }

    @Override
    public void atb() {
        System.out.println("atb completed");
    }
}


abstract class B1 implements  Course {

    abstract void mtb();
}

interface Course{
    void atb();
}