package foodorder;

public class User {
    public  String email;
    public String moblieNumber;
   public Address address;


    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", moblieNumber='" + moblieNumber + '\'' +
                ", address=" + address +
                '}';
    }
}
