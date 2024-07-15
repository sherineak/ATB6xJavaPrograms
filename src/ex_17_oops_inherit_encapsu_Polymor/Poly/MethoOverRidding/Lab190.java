package ex_17_oops_inherit_encapsu_Polymor.Poly.MethoOverRidding;

import com.sun.tools.javac.Main;

public class Lab190 {
// method overriding
public static void main(String[] args) {
    Dog d = new Dog();
    d.bark();

    Hound h = new Hound();
    h.bark();

    Dog Dh = new Hound();   // Dynamic Dispatch  - Method overriding
    Dh.bark();

}

}
