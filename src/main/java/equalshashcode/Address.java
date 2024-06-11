package equalshashcode;

import java.util.Objects;

public class Address {
    public String area;
    public String street;
    public String flatNo;
    public String pincode;

    @Override
    public boolean equals(Object obj) {
        if(this==obj){
            return true;


        }
        if(this.getClass()!=obj.getClass()){
            return false;
        }

        Address otheraddress = (Address) obj;
        return this.area.equals( otheraddress.area)
                && this.street.equals( otheraddress.street)
                && this.flatNo.equals( otheraddress.flatNo)
                && this.pincode.equals( otheraddress.pincode);
    }
    @Override
    public int hashCode(){
        return Objects.hash(area,street,flatNo,pincode);
    }

    @Override
    public String toString() {
        return "Address{" +
                "area='" + area + '\'' +
                ", street='" + street + '\'' +
                ", flatNo='" + flatNo + '\'' +
                ", pincode='" + pincode + '\'' +
                '}';
    }
}
