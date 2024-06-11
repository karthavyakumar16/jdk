package foodorder;

public class Test {
    public static void main(String[] args) {

        Address address=new Address();
        address.houseNo="23";
        address.area="kphb";
        address.street="greenhills";
        address.pinCode="507160";
        address.flatNo="1-79";

        User user=new User();
        user.email="karthavya98";
        user.moblieNumber="9652295359";
        user.address=address;
        System.out.println(user);


        Address address1=new Address();
        address1.houseNo="22";
        address1.area="kaikalur";
        address1.street="signal";
        address1.pinCode="12345";
        address1.flatNo="2-35";

        Restarent restraunt=new Restarent();
        restraunt.name="lucky";
        restraunt.address=address1;
        System.out.println(restraunt);
    }
}
