package ex_16042024;

public class Lab046 {
    public static void main(String[] args) {
        int a = 10;
        //System.out.println(a++);

        System.out.println(++a + ++a);
        //Part A  -> ++a, EX_Result= 11 , a =11
        //Part B  -> + , EX_Result, a
        //Part C  -> a++, Result = 12 , a = 12
        System.out.println(a);
        System.out.println(++a + a++);
        //Part A  -> ++a, EX_Result= 13 , a =13
        //Part B  -> + , EX_Result, a
        //Part C  -> a++, Result = 13 , a = 14
        System.out.println("Result:"+a);
        System.out.printf("Result is %d",a);

    }
}
