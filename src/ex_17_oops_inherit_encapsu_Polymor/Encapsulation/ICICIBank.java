package ex_17_oops_inherit_encapsu_Polymor.Encapsulation;
// private
// Use setter and getter with condition to secure your data members by method
//Hide data members  - encapsulation

public class ICICIBank {
    private String name;
    private int bal;

    public ICICIBank(int bal, String name) {
        this.bal = bal;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBal() {
        return bal;
    }

    public void setBal(int bal) {
        if(bal > 0){
            this.bal = bal;
                    }else {
            System.out.println("Not Allowed  ");
        }

    }
}
