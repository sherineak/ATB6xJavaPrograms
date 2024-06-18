package ex_08_for_while_DoWhile_loop;

public class Lab110 {
    public static void main(String[] args) {

        System.out.println("Print value of i, but I want to break when i = 5");

        for(int i = 1; i <= 10; i++){
            System.out.println("Value of " +i);
            if(i==5){
                break;
            }
           // System.out.println("Value of " +i);
        }
        System.out.println("END");
    }
}
