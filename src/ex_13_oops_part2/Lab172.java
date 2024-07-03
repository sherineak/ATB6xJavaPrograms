package ex_13_oops_part2;

public class Lab172 {
    public static void main(String[] args) {

        BankAccount sbi_ref = new BankAccount();
        sbi_ref.printDetails();

        BankAccount icici_ref = new BankAccount("ICICI",10,"ICIC01");
        icici_ref.printDetails();

        BankAccount yesBank_ref = new BankAccount("YesBank","Yes006");
        yesBank_ref.printDetails();
    }
}
