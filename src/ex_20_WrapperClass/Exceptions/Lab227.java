package ex_20_WrapperClass.Exceptions;

public class Lab227 {
    public static void main(String[] args) throws Exception {
        Bank sbi = new Bank("INR",100);
        Bank ICIC= new Bank("USD",10);
        Integer total = sbi.add(ICIC);   // there is currency mismatch USD and INR
        System.out.println(total);

    }
}
