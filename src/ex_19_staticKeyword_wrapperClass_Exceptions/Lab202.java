package ex_19_staticKeyword_wrapperClass_Exceptions;

public class Lab202 {
    //Static block

    public static void main(String[] args) {
        ATB6x sherine = new ATB6x();
        ATB6x preethi = new ATB6x();
    }
}

class ATB6x{
    static {
        System.out.println("SIB-static initialization block : Load one time, when class is loaded");
    }
    {
        System.out.println("IIB- Instance Initialization block :  loaded when object is created");
    }
}