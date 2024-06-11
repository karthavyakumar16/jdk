package bank1;

public class Test {
    public static void main(String[] args) {
        Address bankaddress=new Address();
        bankaddress.flatNo="1-35";
        bankaddress.street="main road";
        bankaddress.area="rjpuram";
        bankaddress.pincode="507160";

        User user=new User();
        user.address=bankaddress;
        user.fristName="karthavya";
        user.lastName="kumar";
        user.dateOfBrith="16/11/1998";
        user.moblieNumber="96522";
        user.adhar="4109";

        AccountService bankService=new AccountService();
        System.out.println(bankService.createAccount(user));
        System.out.println(bankaddress);
    }
}
