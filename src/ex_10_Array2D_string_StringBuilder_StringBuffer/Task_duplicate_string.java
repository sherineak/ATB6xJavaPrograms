package ex_10_Array2D_string_StringBuilder_StringBuffer;

import java.util.Scanner;

public class Task_duplicate_string {
    public static void main(String[] args) {
        // Removing Duplicate characters present in a String - Hello World -> Helowrd

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String");
        String str = sc.nextLine();

        //String str = "Hello world";
        String result = "";

        for(int i = 0 ; i < str.length(); i++){
            //String ch = String.valueOf(str.charAt(i));   OR 
            String ch = " "+ str.charAt(i);  // By concatenating empty string "" with character returned by str.charAt(i) , character converted into string
            if(result.contains(ch)){
             continue;
            }
            result = result + ch;
        }
        System.out.println("String without duplicate character is " +result);

            }

        }








