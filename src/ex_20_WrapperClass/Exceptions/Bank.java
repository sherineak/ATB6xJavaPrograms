package ex_20_WrapperClass.Exceptions;

public class Bank {
    private String currency;
    private  Integer amount;

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Bank(String currency, Integer amount) {
        this.currency = currency;
        this.amount = amount;
    }

    // throws
    public Integer add(Bank bankName) throws Exception {
        if(!bankName.currency.equalsIgnoreCase("INR")){
            throw new Exception("Currency Doesn't match");
        }
        Integer sum = this.amount+ bankName.amount;
        return sum;
    }
}
