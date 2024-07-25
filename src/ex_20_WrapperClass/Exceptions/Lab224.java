package ex_20_WrapperClass.Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab224 {
    public static void main(String[] args)throws FileNotFoundException {
        readFile("C://a.txt");

    }
    static void readFile(String file) throws FileNotFoundException {
        FileReader f = new FileReader("C://a.txt");
    }
}
