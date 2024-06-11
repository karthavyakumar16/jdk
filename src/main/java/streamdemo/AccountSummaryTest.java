package streamdemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.summingDouble;

public class AccountSummaryTest {
    public static void main(String[] args) {
        AccountService accountService=new AccountService();
        Map<Account,Account> accountMap=accountService.getAccountSummary();
        Account account1=new Account();
        account1.accountNumber="123456";
        Account fullAccount=accountMap.get(account1);
        System.out.println(fullAccount.accountNumber);

        Predicate<AccountDeatils> creditTypePredicate=
                (accountDeatils -> accountDeatils.type.equals("credit"));

        List<AccountDeatils> creditAccountDetails=fullAccount.accountDeatils.stream().
                filter(abc ->creditTypePredicate.test(abc))
                .collect(Collectors.toList());
        System.out.println("stream credit account details"+creditAccountDetails);

        List<AccountDeatils> normalForcreditAccountDetails=new ArrayList<>();
        for(int i=0;i<fullAccount.accountDeatils.size();i++){
            if(fullAccount.accountDeatils.get(i).type.equals("credit")){
                normalForcreditAccountDetails.add(fullAccount.accountDeatils.get(i));
            }
        }
        System.out.println("normal for loop credit account details"+normalForcreditAccountDetails);
        Map<String,Double> groupBytypeSum = fullAccount.accountDeatils.stream()
                .collect(groupingBy(AccountDeatils::getType,summingDouble(AccountDeatils::getAmount)));
        System.out.println(groupBytypeSum);
        Map<String,Double> groupBynormalMap=new HashMap<String,Double>();
        double creditSum=0;
        double debitSum=0;

        for(int i=0;i<fullAccount.accountDeatils.size();i++){
            if(fullAccount.accountDeatils.get(i).type.equals("credit")){
                AccountDeatils detail=fullAccount.accountDeatils.get(i);
                creditSum=creditSum+detail.getAmount();
            }else if(fullAccount.accountDeatils.get(i).type.equals("debit")){
                AccountDeatils detail=fullAccount.accountDeatils.get(i);
                debitSum=debitSum+detail.getAmount();
            }
        }
        System.out.println("credit sum"+creditSum+"debit sum"+debitSum);
    }
}
