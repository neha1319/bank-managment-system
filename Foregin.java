package sample;

public class Foregin{
    private String nationality;
    private String PassPortNo;
    private String accType;

    public Foregin() {
        this.nationality = nationality;
        PassPortNo = PassPortNo;
        this.accType = accType;
    }

    public void BankStatement(){
        System.out.println("Online banking System...");
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getPassPortNo() {
        return PassPortNo;
    }

    public void setPassPortNo(String passPortNo) {
        PassPortNo = passPortNo;
    }

    public String getAccType() {
        return accType;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }
}
