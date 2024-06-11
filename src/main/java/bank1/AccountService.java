package bank1;

import java.util.UUID;

public class AccountService {

    public Passbook createAccount(User user){
        Passbook passbook=new Passbook();
        Address address=new Address();
        address.flatNo="2-35";
        address.street="shivalayam";
        address.area="rjp";
        address.pincode="507160";

        String name=user.fristName+user.lastName;

        passbook.name=name;
        passbook.userAddress=user.address;
        passbook.bankAddress=address;
        passbook.accountNumber= UUID.randomUUID().toString();
        passbook.ifscCode="7654321";
        passbook.balance=2500;
        return passbook;
    }
}
