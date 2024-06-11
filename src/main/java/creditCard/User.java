package creditCard;

public class User {
    public String name;
    public String dob;
    public String moblieNumber;
    public String adhar;
    public String pan;
    public Address address;


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", moblieNumber='" + moblieNumber + '\'' +
                ", adhar='" + adhar + '\'' +
                ", pan='" + pan + '\'' +
                ", address=" + address +
                '}';
    }
}
