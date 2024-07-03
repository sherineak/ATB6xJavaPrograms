package ex_13_oops_part2;

public class ATBPerson {
    // Variables
    // 1. instance Variables-> inside class -   2. Local variables  - present in fuction / method
    String name;        // instance Variable
    Long phone;
    String email;
    boolean isMarried;
    String course;

    // Below is parameterized constructor , we can create with keyword public also
    public ATBPerson(String name, Long phone, String email, boolean isMarried, String course) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.isMarried = isMarried;
        this.course = course;
    }
    // Parameterized constructor with 2 parameter
    public ATBPerson(String givenName, long givenPhone) {
        this.name = givenName;
        this.phone = givenPhone;
    }

    // Parameterized constructor with 1 parameter
    public ATBPerson(String name) {
        this.name =name;

    }
    void printDetails(){
        int age = 10;
        System.out.println(age);
//      int age1;
//      System.out.println(age1);   this will give error as there is local variable , if not initialize( int a = 10 ;) variable JVM don't assign default value
        System.out.println("Printing details of Students ");
    }

    // Default constructor
    ATBPerson(){
        System.out.println("Default constructor : Hi , I will be called you when  create an object ");
    }

// Normal method
    void ATBPerson(){  }

// Param constructor
//    ATBPerson(String givenName,long phoneNo){
//        System.out.println("Param constructor");
//        this.name = givenName;
//        this.phone = phoneNo;


    }

