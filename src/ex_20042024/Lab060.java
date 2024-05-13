package ex_20042024;

public class Lab060 {
    public static void main(String[] args) {
        String s1 = new String("Sherine"); // Heap Area or Object Area
        String s2 = new String("Sherine"); // Heap Area Or Object Are

        System.out.println(s1 == s2);   // Check reference --> Ans: False
        System.out.println(s1.equals(s2)); // Check Values --> Ans: True

    }
}
