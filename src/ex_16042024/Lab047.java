package ex_16042024;

public class Lab047 {
    public static void main(String[] args) {
        int a =10;
        System.out.println(++a + a++ + a++);
        //Part A -> ++a , Ex_Resut1 = 11 , a =11
        //Part A -> a++ , Ex_Resut2 =11 , a = 12
        //Part A -> a++ , Ex_Resut3 = 12,  a = 13

        // Op - > Ex_Resut1 +Ex_Resut2 +Ex_Resut3   = 32
        // a = 13
    }
}
