package ex_03_Operators;

public class Lab043 {
    public static void main(String[] args) {
        int course = 100;
        float GST = 18.7f;
        double total = course + (int)GST;// Explicit casting to convert into float to GST
        System.out.println(total);

    }
}
