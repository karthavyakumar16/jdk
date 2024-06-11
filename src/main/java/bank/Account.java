package bank;

public class Account {
    public String number;
    public String name;
    public int totalBalance;
    public String pin;


    @Override
    public String toString() {
        return "Account{" +
                "number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", totalBalance=" + totalBalance +
                ", pin='" + pin + '\'' +
                '}';
    }
}
