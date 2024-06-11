package foodorder;

public class Address {
    public String houseNo;
    public String area;
    public String street;
    public String pinCode;
    public String flatNo;


    @Override
    public String toString() {
        return "Address{" +
                "houseNo='" + houseNo + '\'' +
                ", area='" + area + '\'' +
                ", street='" + street + '\'' +
                ", pinCode='" + pinCode + '\'' +
                ", flatNo='" + flatNo + '\'' +
                '}';
    }
}
