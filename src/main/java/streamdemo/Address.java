package streamdemo;

public class Address {
    public String flotNo;
    public String street;
    public String area;
    public String pincode;

    @Override
    public String toString() {
        return "Address{" +
                "flotNo='" + flotNo + '\'' +
                ", street='" + street + '\'' +
                ", area='" + area + '\'' +
                ", pincode='" + pincode + '\'' +
                '}';
    }
}
