package ex_25_Switch;

public class Lab086 {
    public static void main(String[] args) {
        //JDK > 13
        int itemcode = 010 ;
        switch (itemcode){
            case 001,002,003:
                System.out.println("It is a electronic Gadget");
                break;
            case 004,005,006:
                System.out.println("Its a Mechanical Gadget");
                break;
            default:
                System.out.println("NONE");
        }

    }
}
