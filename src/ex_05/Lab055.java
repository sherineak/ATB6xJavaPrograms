package ex_05;

public class Lab055 {
    public static void main(String[] args) {
        String s1 = "Sherine";
        String s2 = s1;

        System.out.println(s2);
        System.out.println("________");
        // INTERVIEW
        String s3 = "The Testing Academy";
        s3.toLowerCase();  // It will create new string but there is no assignment happened,
        System.out.println(s3); // Ans :The Testing Academy ( so lower case created but as there no assignment its not point to the exact location in the string constant pool)
        s3 =s3.toLowerCase(); // Value assigned to the variable s3
        System.out.println(s3);// ans :the testing academy ( once assigned to the variable s3 , its point(reference) to the lower case string created (the testing academy)exact location in the string constant  pool

    }
}
