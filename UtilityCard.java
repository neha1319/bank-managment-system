package sample;

public class UtilityCard {
    private String barcode;
    private Account account;
    private Transaction transaction;

    public UtilityCard(String barcode, Account account, Transaction transaction) {
        this.barcode = barcode;
        this.account = account;
        this.transaction = transaction;
    }

    public double pay(){
        return transaction.getAmount();
    }

    public Transaction add(){
        return transaction;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }
}
