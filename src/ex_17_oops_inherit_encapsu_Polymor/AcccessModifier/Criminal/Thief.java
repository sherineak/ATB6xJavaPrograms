package ex_17_oops_inherit_encapsu_Polymor.AcccessModifier.Criminal;

import ex_17_oops_inherit_encapsu_Polymor.AcccessModifier.Police.Cop;

public class Thief {
    public static void main(String[] args) {
        Cop c = new Cop(10);
        c.shoot();
        System.out.println(c.gun);
    }
}
