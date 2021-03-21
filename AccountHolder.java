package sample;

public class AccountHolder {
    private String accountNumber;
    private String HolderName;

    public AccountHolder(String accountNumber, String holderName) {
        this.accountNumber = accountNumber;
        HolderName = holderName;
    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getHolderName() {
        return HolderName;
    }

    public void setHolderName(String holderName) {
        HolderName = holderName;
    }

}
