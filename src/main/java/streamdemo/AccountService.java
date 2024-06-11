package streamdemo;

import java.util.*;

public class AccountService {
    public  Map<Account,Account> getAccountSummary(){
        Map<Account,Account> accountMap=new HashMap<>();
        Address useraddress=new Address();
        useraddress.flotNo="1-79";
        useraddress.street="mainroad";
        useraddress.area="rjp";
        useraddress.pincode="507160";

        Address bankaddress=new Address();
        bankaddress.flotNo="2-39";
        bankaddress.street="sivalayam";
        bankaddress.area="rjp";
        bankaddress.pincode="507160";

        User user=new User();
        user.name="karthavya";
        user.dob="16/11";
        user.adarNo="4109";
        user.address=useraddress;

        Account account=new Account();
        account.accountName="karthavya";
        account.accountNumber="123456";
        account.balance=4000;
        account.branchName="rjpbranch";
        account.ifscCode="20415";
        account.user=user;

        List<AccountDeatils> accountDeatilsList=new ArrayList<>();
        AccountDeatils accountDeatils=new AccountDeatils();
        accountDeatils.accountNumber= account.accountNumber;
        accountDeatils.txnDate=new Date();
        accountDeatils.valueDate=new Date();
        accountDeatils.amount=2000;
        accountDeatils.type="credit";

        AccountDeatils accountDeatils1=new AccountDeatils();
        accountDeatils1.accountNumber= account.accountNumber;
        accountDeatils1.txnDate=new Date();
        accountDeatils1.valueDate=new Date();
        accountDeatils1.amount=2000;
        accountDeatils1.type="debit";

        account.accountDeatils=accountDeatilsList;

        accountDeatilsList.add(accountDeatils);
        accountDeatilsList.add(accountDeatils1);




        accountMap.put(account,account);
        return accountMap;
    }
}
