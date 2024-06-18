package ex_10_Array2D_string_StringBuilder_StringBuffer;

import java.util.Scanner;

public class Lab144_palindrome_Or_Not {
    public static void main(String[] args) {
        // Check the string is palindrome or not
        // mom   , madam, amma
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number , will say number is palindrome or not");
        String user_input = sc.next();

        // reverse not available in  String so can use string buffer or string builder
        StringBuilder sb = new StringBuilder(user_input);
        String rev_user_input = sb.reverse().toString();

        if(user_input.equalsIgnoreCase(rev_user_input)){
            System.out.println("Palindrome - >"+user_input);
        }else {
            System.out.println("Nope");
        }
    }
}
