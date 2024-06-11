package siwggydemo;

public class EqualsTest {
    public static void main(String[] args) {
        Address address12=new Address();
        address12.flatNo="1-79";
        address12.area="gd";
        address12.street="kh";
        address12.pinCode="34";
        Address address21=new Address();
        address21.flatNo="1-79";
        address21.area="gd";
        address21.street="kh";
        address21.pinCode="34";
        Address address22=new Address();
        address22.flatNo="1-79";
        address22.area="gd";
        address22.street="kh";
        address22.pinCode="34";


        System.out.println("reflexive starts");
        System.out.println(address12.equals(address12));
        System.out.println("reflexive ends");


        System.out.println("symetric starts");
        System.out.println(address12.equals(address21));
        System.out.println(address21.equals(address12));
        System.out.println("symetric ends");

        System.out.println("transtive starts");
        System.out.println(address12.equals(address21));
        System.out.println(address21.equals(address22));
        System.out.println(address12.equals(address22));
        System.out.println("transtive ends");

        System.out.println("consistent starts");
        System.out.println(address12.equals(address21));
        System.out.println(address12.equals(address21));
        System.out.println(address12.equals(address21));

        System.out.println("consistent ends");

        System.out.println(address12.hashCode());
        System.out.println(address21.hashCode());
        System.out.println(address22.hashCode());

    }
}
