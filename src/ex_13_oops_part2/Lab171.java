package ex_13_oops_part2;

public class Lab171 {
    public static void main(String[] args) {

        ATBPerson  amitRef = new ATBPerson();   // Default Constructor
        amitRef.name = "Amit";
        amitRef.phone = 122356789l;

        // constructor with all parameters
        ATBPerson sherineref = new ATBPerson("sherine", 123456789l, "sherineak@gmail.com", true, "Java Automation");
        ATBPerson preeref = new ATBPerson("Preethi", 567456789l, "preethk@gmail.com", true, "Manual Automation");
        preeref.course = "ATB Java";  //

        ATBPerson riyanRef = new ATBPerson("Riyan",5472374723l);  //parameterized constructor with 2 parameter
        ATBPerson royceRef = new ATBPerson("Royce");                   // parameterized constructor with 1 parameter


        }
    }
