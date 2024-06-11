package creditCard;

public class Test {
    public static void main(String[] args) {
        Address address=new Address();
        address.flatNo="2-35";
        address.street="svrm";
        address.area="nkp";
        address.pincode="507160";

        User user=new User();
        user.address=address;
        user.name="karthavya";
        user.dob="16/11/1998";
        user.moblieNumber="96522";
        user.adhar="4109";
        user.pan="9087";

        CreditService creditService=new CreditService();
        System.out.println(creditService.card(user));

    }
}
