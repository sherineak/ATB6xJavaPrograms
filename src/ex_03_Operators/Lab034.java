package ex_03_Operators;

public class Lab034 {
    public static void main(String[] args) {
        //Logical Operator
        //NOT Gate , OR Gate , AND Gate

        Boolean a = true;
        System.out.println(!a);
        //--INTERVIEW --
        System.out.println(!(30>90)); // reverse of 30 > 90
        //-- INTERVIEW
        System.out.println(!!(30>90));  // Double Not operator will reverse again
        System.out.println(!!!(30>90));  // Do multiple  ! , it will reverse many times

    }
}
