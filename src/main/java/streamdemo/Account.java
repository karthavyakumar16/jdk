package streamdemo;

import map.Ticket;

import java.util.List;
import java.util.Objects;

public class Account {
    public String accountName;
    public String accountNumber;

    public double balance;
    public String branchName;
    public String ifscCode;
    public Address address;

    public User user;
   public List<AccountDeatils> accountDeatils;

    public boolean equals(Object obj){
        if(this==obj){
            return  true;

        }
        if(this.getClass()!=obj.getClass()){
            return false;

        }
        Account account=(Account) obj;
        return this.accountNumber.equals(account.accountNumber);
    }
    public int hashCode(){
        return this.accountNumber.hashCode();
    }


}
