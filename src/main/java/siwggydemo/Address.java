package siwggydemo;

public class Address {
    public String flatNo;
    public String area;
    public String street;
    public String pinCode;

    @Override
    public String toString() {
        return "Address{" +
                "flatNo='" + flatNo + '\'' +
                ", area='" + area + '\'' +
                ", street='" + street + '\'' +
                ", pinCode='" + pinCode + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;


        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        Address address = (Address) obj;
        return this.flatNo.equals(address.flatNo)
        &&this.street.equals(address.street)
        &&this.area.equals(address.area)
       && this.pinCode.equals(address.pinCode);


    }
}