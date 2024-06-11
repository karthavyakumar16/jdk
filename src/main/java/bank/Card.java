package bank;

public class Card {
    public String validity;
    public String cvv;
    public String number;
    public Account account;

    @Override
    public String toString() {
        return "Card{" +
                "validity='" + validity + '\'' +
                ", cvv='" + cvv + '\'' +
                ", number='" + number + '\'' +
                ", account=" + account +
                '}';
    }
}
