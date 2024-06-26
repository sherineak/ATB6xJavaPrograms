package ex_11_Functions;

public class Lab153 {
    public static void main(String[] args) {
        //Non-Return without parameter
        saySomethingPlease();

        //Non-Return with parameter
        sayHelloToYou("Sherine");

        //Return without parameter
         sumOfTwoBad(5,6);

        //Return with parameter  / This is widely used function

        int Result = sumOfTwoGood(7,8);
        System.out.println(Result);
    }

    static int  sumOfTwoGood(int a, int b) {
        return a+b;
    }

    static void sumOfTwoBad(int a, int b) {
       System.out.println(a+b);
    }

    static void sayHelloToYou(String name) {
        System.out.println("Hello," +name);
    }


    static void saySomethingPlease() {
        System.out.println("Non-Return without parameter");
    }
}
