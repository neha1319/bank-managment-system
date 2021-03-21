package sample;

public class Account {
    private String accountNumber;
    private double balance;
    private String accountName;
    private Transaction transaction;

    public Account() {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountName = accountName;
        this.transaction = transaction;
    }

    public boolean deposit(){
        return true;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }
}
