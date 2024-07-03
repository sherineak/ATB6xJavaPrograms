package ex_15_Multi_level_Inheritance;

public class Lab176 {
    public static void main(String[] args) {
        Child c = new Child();
        c.home();   // Ans : 3 BHK if child has NO home() function, it will check father, if father also has no , it will check grand Father

        GrandFather GF = new GrandFather();
        GF.home();  // Ans : 1 BHK

        Father f = new Father();
        f.home();   //Ans : 2 Bhk

        // Dynamic Dispatch
        GrandFather Gf1 = new GrandFather();
        GrandFather GF2 = new Father();
        GrandFather GF3 = new Child();

//        Child c1 = new GrandFather();    // Not possible inthe reverse
//        Father f1  = new GrandFather(); // Not possible inthe reverse
        Father f1 = new Child();  // Ans  3 BHK
        f1.home();



    }
}
