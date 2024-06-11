package swiggy1;

public class Address {
    public String hNo;
    public String streetNo;
    public String area;
    public String pinCode;

    @Override
    public String toString() {
        return "Address{" +
                "hNo='" + hNo + '\'' +
                ", streetNo='" + streetNo + '\'' +
                ", area='" + area + '\'' +
                ", pinCode='" + pinCode + '\'' +
                '}';
    }
}
