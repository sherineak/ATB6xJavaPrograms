package ex_20_WrapperClass.Exceptions;

import java.io.File;
import java.io.FileReader;

public class Lab223 {
    public static void main(String[] args) {

        // Checked Exception - Compile time

        try{
            String path = "c:/a.txt";
            File file = new File(path);
            FileReader fRead = new FileReader(file);    // file and file leader in IO package, this can be used for read s file
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
