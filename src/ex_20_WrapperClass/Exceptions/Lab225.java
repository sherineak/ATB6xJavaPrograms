package ex_20_WrapperClass.Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab225 {
    public static void main(String[] args) {


        try {
            int a = 10/0;  //JVM don't know, its unchecked  - run time
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());

        }

        try {
            FileReader f = new FileReader("C://a.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
