package ex_25_Switch;

public class Lab089 {
    public static void main(String[] args) {

        // To return something and rarely using
        char code = 'A';
        int val = switch (code){
            case 'A':
                yield 65;// return
            case 'B':
                yield 45;
            default:
                System.out.println("Not Able to find");
                throw new IllegalStateException("Error");
        };      // In this pgm int val replaced with value 65 using this switch;  int val = 65

    }
}
