package ex_17_oops_inherit_encapsu_Polymor.SuperThisKeyword;

public class Lab185 {
    public static void main(String[] args) {
        Dog dc = new Dog();

        // constructor Chaining --> Child DC always call --> parent DC
        Dog dc1 = new Dog("Lab");
        dc1.display();
    }
}
class Animals{

     String type;
     Animals(){           // Default Constructor
        System.out.println("Animal : DC");
    }

    public Animals(String type) {
        this.type = type;
        System.out.println("Animal: PC");
    }
}

class Dog extends Animals{
    String breed;
    Dog() {
        System.out.println("Dog : DC");
    }

    Dog(String breed){
        super("Dog type");
        this.breed =breed;
    }
    Dog(String breed, String type){
        this("breed set by dig only");
        this.breed = breed;
        System.out.println("pc with two args");
    }

    void display(){
        System.out.println("Type " +super.type + ", Breed " +this.breed);
    }

}