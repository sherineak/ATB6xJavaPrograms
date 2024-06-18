package ex_07_Switch;

import java.util.Scanner;

public class Lab082 {
    public static void main(String[] args) {
        //Take a user input as char and tell the user if its vowel
        //aeiou

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character, I will tell you if it is Vowel or not ");
        char user_input = sc.next().charAt(0);
        // OR char user_input = sc.next().toCharArray(0)

        switch (user_input){
            case 'a':
                System.out.println("Vowel");
                break;
            case 'e':
                System.out.println("Vowel");
                break;
            case 'i':
                System.out.println("Vowel");
                break;
            case 'o':
                System.out.println("Vowel");
                break;
            case 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Not a vowel, its is Consonant");
        }
    sc.close();

    }
}
