package ex_19_staticKeyword_wrapperClass_Exceptions;

public class Lab201 {
    // Static can be data member, method , class
    // Static data member

    public static void main(String[] args) {
        ATB sherine = new ATB(12334445);
        ATB preethi = new ATB(34353535);
        sherine.printDetails();
        preethi.printDetails();
        System.out.println(ATB.courseName);
    }
}

class ATB{
    static String courseName = "ATB";
            int phoneNo;

    public ATB(int phoneNo) {
        this.phoneNo = phoneNo;
    }
    void printDetails(){
        System.out.println("Your phone " + this.phoneNo);
    }
}