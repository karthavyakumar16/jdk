package creditCard;

import java.util.Date;
import java.util.UUID;

public class CreditService {
    public CreditCard card(User user){
        CreditCard creditCard=new CreditCard();
        creditCard.creditCardHolderName= user.name;
        creditCard.bankName="sbi";
        creditCard.creditCardNumber= UUID.randomUUID().toString();
        creditCard.cvv=UUID.randomUUID().toString();
        creditCard.cardExpiry=new Date();
        creditCard.cardLimit=25000;
        creditCard.availableBalance=creditCard.cardLimit;
        return creditCard;
    }


}
