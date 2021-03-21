package sample;


public class Transaction{
    private double amount;
    private boolean approval;


    public Transaction() {
        this.amount = amount;
        this.approval = approval;
    }


    public double getAmount() {
        System.out.println(amount);
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }


    public boolean isApproval() {
        return approval;
    }

    public void setApproval(boolean approval) {
        this.approval = approval;
    }
}
