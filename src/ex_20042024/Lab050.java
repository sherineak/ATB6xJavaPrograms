package ex_20042024;

public class Lab050 {
    public static void main(String[] args) {
        int smallNumber = 10;
        //double bigNumber = smallNumber;  // Jvm will do this implicit casting - lower to bigger (widening)
          //OR
        double bigNumber = (double)smallNumber;  // valid implicit casting without help from JVM, by human


        double bigNumber1 = 20.5;
        int smallNumber1 = (int) bigNumber1;  // Valid explicit casting(narrowing) - higher to lower

    }
}
