package bank;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
         Account account=new Account();
         account.number="12345";
         account.name="sbi";
         account.totalBalance=2500;
         account.pin="12345";

         Card card=new Card();
         card.account=account;
         card.validity="2029";
         card.cvv="123";
         card.number="1233457";


         AtmMachine atmMachine=new AtmMachine();
         atmMachine.location="kphb";
         atmMachine.id="321";
         atmMachine.balance=25000;

         Transaction transaction=new Transaction();

         transaction.card=card;
         transaction.atmMachine=atmMachine;
         transaction.txId="45678";
         transaction.date=new Date();
         transaction.withdrawalAmt=1000;


         System.out.println(account);
        System.out.println(card);
        System.out.println(atmMachine);
        System.out.println(transaction);
    }
}
