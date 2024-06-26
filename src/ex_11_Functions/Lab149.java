package ex_11_Functions;

public class Lab149 {
    public static void main(String[] args) {
//        sayHi();
//        sayHi();
//        sayHi();
//        sayHi();  // we can call a function infinite number of times
        // can use for loop to call many times
        for (int i =0; i<100;i++){
            sayHi();
            sayBye();

        }

    }

   static void sayBye() {
       System.out.println("Bye");
    }

    static void sayHi(){
        System.out.println("Hello, hi");
    }
}
