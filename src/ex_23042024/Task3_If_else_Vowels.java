package ex_23042024;

import java.util.Scanner;

public class Task3_If_else_Vowels {
    public static void main(String[] args) {
        //Check char is vowel, consonant.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the alphabet ->");
        //String ch = sc.next();
        char ch = sc.next().charAt(0);
        if(ch == 'A' || ch == 'E' || ch =='I' || ch =='O' || ch == 'U'||
                ch == 'a' || ch == 'e' || ch =='i' || ch =='o' || ch == 'u' ){
            System.out.println("The alphabet is Vowel");
        }else {
            System.out.println("The alphabet is consonant");
        }
    }

}
