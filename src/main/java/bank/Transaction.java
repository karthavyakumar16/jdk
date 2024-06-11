package bank;

import java.util.Date;

public class Transaction {

    public String txId;
    public Date date;
    public int withdrawalAmt;

    public Card card;
    public AtmMachine atmMachine;

    @Override
    public String toString() {
        return "Transaction{" +
                "txId='" + txId + '\'' +
                ", date=" + date +
                ", withdrawalAmt=" + withdrawalAmt +
                ", card=" + card +
                ", atmMachine=" + atmMachine +
                '}';
    }
}
