package ex_11_Functions;

public class Lab156 {
    public static void main(String[] args) {
        // 1 friend
        // 1 beg
        System.out.println("Starting of program");
        System.out.println("End Of a program");
        main(10);
        main("sherine");


    }
    static void main(int a){
        System.out.println(a);   // calling other 'main' function outside main function with different parameter
    }

    static void main(String a){
        System.out.println(a);   // calling other 'main' function outside main function with different parameter
    }
    static String main(String[] a, String b){
        System.out.println(a);
        return "Hello";
    }


    static void giveMoneybeg() {
        System.out.println("Blessing");
    }

    static int giveMoneyFrined(int i) {
        i = i + 8;
        return i;
    }
}
