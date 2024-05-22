package ex_20042024;

public class Lab065 {
    public static void main(String[] args) {
        // ternary Operator
        //?- if this do 1, if not this do 2
        boolean result = 10>40? 10 > 40 : 40>10;
        System.out.println(result);
//        The expression 10 > 40 evaluates to false because 10 is not greater than 40.
//        Therefore, the value assigned to result would be the value after the : if the condition is false.
//                After :, the condition 40 > 10 evaluates to true because 40 is indeed greater than 10.
//        So, result is assigned the value true.
//                The println statement prints the value of result, which is true





        int a = true? 10: 20;
        System.out.println(a);
//        If the condition true is true, then i will be assigned the value 10.
//        If the condition is false, then i will be assigned the value 20.
//        So, in this case, since the condition true is always true, i will be assigned the value 10.

        int a1 = (30>40)? 10: 20;
        System.out.println(a1);

    }
}
