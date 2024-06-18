package ex_05;

public class Lab059 {
    public static void main(String[] args) {
        // Interview Question
        String name ="The Testing Academy";   // SCP(String Constant Pool)
        String name1 ="The Testing Academy";   // SCP(String Constant Pool)

        String name2 = new String("The Testing Academy");// Heap Area or Object Area

        System.out.println(name == name1);  // Check Reference is same or not  --> Ans : True
        System.out.println(name.equals(name1));  // Check Values or content of String   --> Ans : True


        System.out.println(name == name2);  // False
        System.out.println(name.equals(name2)); // True
    }
}
