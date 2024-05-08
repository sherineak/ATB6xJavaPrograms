package ex_20042024;

public class Lab053 {
    public static void main(String[] args) {
        String name = "Sherine"; // Assignment Operator
        String name1 = new String("Sherine");  // New Operator
        // Both of them save the name , name1 in different ways Jvm
        // String is a class, it has extra functionalities, So class has extra functionalities
        System.out.println(name);
        System.out.println("Your Name is ->"+name);
        System.out.printf("Your Name is : %S",name);

        System.out.println("\n_________All the functions available in String___________");

        System.out.println(name.length());  // length() - Its a function
        System.out.println(name.toLowerCase());

        int age = 65;
        //--Interview-
        // primitive data types are byte,short,int,char,long,float,double boolean -> don't have extra functionality
        //Primitive data types not in class, due to primitive data types java is not oops (object oriented pgming language)
        // OOPs - Everything should be in class format, Tha java is not a pure oops due to primitive data types
        // Opps - everything in class Eg : python
        // Java is not pure object oriented

        // Non - Primitive Data Types
        //String - Extra functionalities
    }
}
