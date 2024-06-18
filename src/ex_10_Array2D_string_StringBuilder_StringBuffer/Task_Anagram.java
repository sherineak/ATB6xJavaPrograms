package ex_10_Array2D_string_StringBuilder_StringBuffer;

import java.util.Arrays;
import java.util.Scanner;

public class Task_Anagram {
    public static void main(String[] args) {
        // Program to check Two Strings Are Anagram

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first String");
        String str1 = sc.nextLine();
        str1=str1.toLowerCase();
        System.out.println(("Enter your Second String"));
        String str2 = sc.nextLine();
        str2=str2.toLowerCase();

        //Convert string into character arrays

        char[] chArrS1 = str1.toCharArray();
        char[] chArrS2 = str2.toCharArray();

        Arrays.sort(chArrS1);
        Arrays.sort(chArrS2);

        if(Arrays.equals(chArrS1,chArrS2)){
            System.out.println("Anagram");
        }else {
            System.out.println("Not Anagram");
        }





    }
}
