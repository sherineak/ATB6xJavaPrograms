package ex_12_oops_part1;

public class Lab162 {
    public static void main(String[] args) {
        System.out.println("Hello");

        Person amit = new Person();     // After create a object will do assignment on variables like name , age etc
        amit.name = "Amit";
        System.out.println(amit.name);

        Person sherine = new Person();

        Person kanika = null;   // here is no object creation , Jist refernce created and point to null in Heap/Object Area
        System.out.println(kanika);

        // ClassName Ob_ref = Object() -> (new ClassName ()
        //Class -- > Blue print with A , B(Attributes and behaviour )  --. Class is Not real
        // Object  --> It's a real entity , which are created from class. they have A, B


    }
}
