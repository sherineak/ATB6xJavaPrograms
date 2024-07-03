package ex_14_SingleInheritance;

public class Lab174 {
    public static void main(String[] args) {
        // What is inheritance
        // inherit attributes and behaviour from parent , grandparent

        // Super class / Parent class / Base Class
        // Sub Class  / Child Class / Derived Class

        // parent -> Child
        // Child extends parent{}
        // extend keyword -> parent's Attributes & behaviours are available to the child (Class)

        Programming p = new Programming(12, "James Gosling");
        Java j = new Java("Lambada");
        p.printInfo();
        j.printInfo();

        Programming p1 = new Programming(12 , "Python :Van Russon");
        p1.printInfo();

        Python phy = new Python();
        phy.printInfo();   // in Python class no functions or methods so it will inherit from parent class
        phy.bhk3();
        phy.author = "Python Author";
        System.out.println(phy.author);
    }
}
