package ex_13_oops_part2;

public class Lab170 {
    public static void main(String[] args) {

        // Default constructor
        ATBPerson objref1 = new ATBPerson();
        ATBPerson obref2 = new ATBPerson();

        // Parameterized constructor
        ATBPerson sherineRef = new ATBPerson("Sherine",123456789l);     // Error Reason : if create parameterized constructor with all parameter should pass all the values when create object. here passing name and phone only Check Lab171
        System.out.println(sherineRef.name);
        System.out.println(sherineRef.phone);

        ATBPerson preethRef = new ATBPerson("Preethi",987654321l);    // Error Reason : if create parameterized constructor with all parameter should pass all the values when create object. here passing name and phone only
        System.out.println(preethRef.name);
        System.out.println(preethRef.phone);



    }
}
