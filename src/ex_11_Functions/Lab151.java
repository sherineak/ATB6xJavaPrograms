package ex_11_Functions;

public class Lab151 {
    public static void main(String[] args) {
       int s1 = sumOfTwo(5,6);
        System.out.println(s1);

        String s2 = sumOfTwo("Sherine",11);
        System.out.println(s2);

    }

     static int sumOfTwo(int a, int b) {
        return a+b;
    }
    static String sumOfTwo(String a, int b){
        return a+b;
    }
}
