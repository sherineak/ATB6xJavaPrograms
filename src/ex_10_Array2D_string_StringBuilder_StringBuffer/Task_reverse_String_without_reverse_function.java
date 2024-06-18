package ex_10_Array2D_string_StringBuilder_StringBuffer;

public class Task_reverse_String_without_reverse_function {
    public static void main(String[] args) {
        // Interview Question
        // Reverse a string without reverse function
        String name = "Sherine";
        String rev = " ";
        for(int i = name.length()-1; i>=0 ; i--){
        rev = rev  + name.charAt(i);
        }
        System.out.println(rev);
    }
}
