package Lab25042024;

import java.util.Locale;
import java.util.Scanner;

public class Lab081 {
    public static void main(String[] args) {
        // Web Automation
       //  I will ask which user you want to run the code
        //chrome --> Strat chrome, firefox --> Start firefox, edge --> Strat edge

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a browser name, where you want to execute the pgm");
        String browserName = sc.nextLine();
        browserName=browserName.toLowerCase();

        switch (browserName){
            case "chrome":
                System.out.println("Starting the chrome Browser");
                break;
            case "firefox":
                System.out.println("Starting the firefox Browser ");
                break;
            case "edge":
                System.out.println("Starting the edge browser ");
                break;
            default:
                System.out.println("I have no idea which browser is this");
        }
    sc.close();
    }
}
