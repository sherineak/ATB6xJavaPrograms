package Lab25042024;

import java.util.Scanner;

public class Lab093 {
    public static void main(String[] args) {
        int a = 11;

        switch (a){
            default:
                System.out.println("Default");   // we can default any place but if not used at last pls use break statement
                break;
            case 10:
                System.out.println("10");
                break;
            case 11:
                System.out.println("11");   // at the end no need break
        }
    }
}
