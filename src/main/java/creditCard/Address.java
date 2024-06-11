package creditCard;

public class Address {
    public String flatNo;
    public String street;
    public String area;
    public String pincode;


    @Override
    public String toString() {
        return "Address{" +
                "flatNo='" + flatNo + '\'' +
                ", street='" + street + '\'' +
                ", area='" + area + '\'' +
                ", pincode='" + pincode + '\'' +
                '}';
    }
}
