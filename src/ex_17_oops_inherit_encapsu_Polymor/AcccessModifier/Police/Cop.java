package ex_17_oops_inherit_encapsu_Polymor.AcccessModifier.Police;

public class Cop {
    public int gun;
    private String idCard;

    public Cop(int gun){
        this.gun= gun;
    }
    public void shoot(){              // its public in nature, so can form anywhere
        System.out.println("Of- Course , Shoot");
    }
}
