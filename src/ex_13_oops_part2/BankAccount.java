package ex_13_oops_part2;

public class BankAccount {
    String bankName;
    int balance;
    String bankCode;

    // Default constructor
    BankAccount(){
        System.out.println("Bank Account Details");
        bankName = "SBI";
        bankCode = "SBI001";
        balance = 1;
    }
   // method in class to call when create an object
    void printDetails(){
        System.out.println("Bank name -->" +bankName);
        System.out.println("Bank COde -->" +bankCode);
        System.out.println("Balance ->" +balance);
    }

    // parameterized constructor with 3 paramaeter
    BankAccount(String givenBankname,int balance, String bankCode){
        this.bankName = givenBankname;    //
        this.balance = balance;
        this.bankCode = bankCode;
    }

    // parameterized constructor with 2 paramaeter
    BankAccount(String bankName, String bankCode){
        this.bankName= bankName;
        this.bankCode = bankCode;
    }
}
