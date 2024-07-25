package ex_20_WrapperClass.Exceptions;

import java.io.FileInputStream;

public class Lab220 {
    public static void main(String[] args) {
        //Exception

        //1 . Checked Exception  - JUV Knows , its a compile time exception
        try {
            FileInputStream f = new FileInputStream("c:/login.txt"); // this file may or may not available so handle this by try catch exception
        } catch (Exception e){
            System.out.println(e.getMessage());
        }


        //2. Unchecked Exception  - JVM don't know , it will occur at run time
        int a = 10;
        int c = a/0;
    }
}
