package ex_02_Variable;

public class Lab023 {
    public static void main(String[] args) {
        double a = 34;
        double b = 10;
        // modulus operator
        double result = a % b;
        System.out.println(result);
        // 10 | 34 | Q -3
        //      | 30 |
        //   R -> 34

        int num = 35;
        int r = num%2;
        System.out.println(r);

        //Comparator Operator
        // num%2 == 0 --> Even
        // num%2 == 1 --> odd
    }
}
