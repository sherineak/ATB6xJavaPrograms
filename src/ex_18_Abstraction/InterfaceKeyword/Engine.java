package ex_18_Abstraction.InterfaceKeyword;

public interface Engine {
    void startEngine();
    void stopEngine();


    // Default method
    default void haltingEngineJustStart(){

    }
    default void haltingEngineJustSTop(){

    }

  //Normal complete method not allowed
//    void m2(){
//
//    }

    //Static
    static void m1(){

    }
}
