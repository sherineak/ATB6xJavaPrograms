package ex_13_oops_part2;

public class Lab167 {
    public static void main(String[] args) {
        ATBPerson atbperson1 = new ATBPerson();
        // ClassName objectRef = new keyword + ClassName();
        // Object --> new keyword + ClassName();
        // Object Ref --> Object ref
        //ATBPerson atbperson1 = ATBPerson();  (calling a function)
        System.out.println(atbperson1.name);
        // Ans : null -- > Jvm will assign default value for instance variable
        atbperson1.name = "Sherine";
        System.out.println(atbperson1.name);

    }
}
