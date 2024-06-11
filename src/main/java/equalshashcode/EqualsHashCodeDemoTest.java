package equalshashcode;

public class EqualsHashCodeDemoTest {
    public static void main(String[] args) {
        Address address1=new Address();
       address1 .area="kphb";
        address1.flatNo="1-19";
        address1.street="grennhills";
        address1.pincode="507160";
       // Address y=null;

       // System.out.println(address.equals(address1));
        Address address2=new Address();
        address2.area="kphb";
        address2.flatNo="1-19";
        address2.street="grennhills";
        address2.pincode="507160";



        Address address3=new Address();
        address3.area="kphb";
        address3.flatNo="1-19";
        address3.street="grennhills";
        address3.pincode="507160";
//Address address1=null;

        System.out.println(address1.equals(address2));
        System.out.println(address2.equals(address1));
        System.out.println(address1.equals(address3));
    }
}
