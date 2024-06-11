package swiggyfinal;

public class Address {
    public String flatNo;
    public String street;
    public String area;
    public String pincode;


    public Address(String flatNo, String street, String area, String pincode) {
        this.flatNo = flatNo;
        this.street = street;
        this.area = area;
        this.pincode = pincode;
    }

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
