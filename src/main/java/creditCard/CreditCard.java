package creditCard;

import java.util.Date;

public class CreditCard {
    public String creditCardHolderName;
    public String bankName;
    public String creditCardNumber;
    public String cvv;
    public Date cardExpiry;

    public int availableBalance;
    public int cardLimit;


    @Override
    public String toString() {
        return "CreditCard{" +
                "creditCardHolderName='" + creditCardHolderName + '\'' +
                ", bankName='" + bankName + '\'' +
                ", creditCardNumber='" + creditCardNumber + '\'' +
                ", cvv='" + cvv + '\'' +
                ", cardExpiry=" + cardExpiry +
                ", availableBalance=" + availableBalance +
                ", cardLimit=" + cardLimit +
                '}';
    }
}
