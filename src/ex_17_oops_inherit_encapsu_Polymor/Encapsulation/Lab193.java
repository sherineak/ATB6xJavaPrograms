package ex_17_oops_inherit_encapsu_Polymor.Encapsulation;

public class Lab193 {
    public static void main(String[] args) {
        ICICIBank Ic =new ICICIBank(100,"Sherine");
        System.out.println(Ic.getBal());
        System.out.println(Ic.getName());
        Ic.setName("Sherine Antony");         // public void setName(String name) { this.name = name;}
        System.out.println(Ic.getName());       // public String getName(String name){ return name; }
        Ic.setBal(-100);
        System.out.println(Ic.getBal());


    }
}
