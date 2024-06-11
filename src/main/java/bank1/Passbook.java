package bank1;

public class Passbook {

    public String name;
    public String accountNumber;
    public String ifscCode;
    public int balance;
    public Address userAddress;
    public Address bankAddress;

    @Override
    public String toString() {
        return "Passbook{" +
                "name='" + name + '\'' +
                ", accountNumber=" + accountNumber +
                ", ifscCode='" + ifscCode + '\'' +
                ", balance=" + balance +
                '}';
    }
}
