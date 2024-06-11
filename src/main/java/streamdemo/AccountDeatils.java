package streamdemo;

import java.util.Date;

public class AccountDeatils {
    public Date txnDate;
    public Date valueDate;
    public double amount;
    public String description;
    public String type;
    public String accountNumber;

    @Override
    public String toString() {
        return "AccountDeatils{" +
                "txnDate=" + txnDate +
                ", valueDate=" + valueDate +
                ", amount=" + amount +
                ", description='" + description + '\'' +
                ", type='" + type + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                '}';
    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }
}
