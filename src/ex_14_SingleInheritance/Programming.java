package ex_14_SingleInheritance;

public class Programming  {
    // instance variable or attributes
    String author;
    int version;

     // default constructor
    Programming() {
        System.out.println("Default constructor - parent");
    }
    // Param constructor
    Programming(int version, String author) {
        this.version = version;
        this.author = author;

    }
    // method
    void printInfo(){
        System.out.println("Programming info --> " +this.version+ " Author " + this.author);

    }
    void bhk3(){
        System.out.println("3Bhk");
    }
}
