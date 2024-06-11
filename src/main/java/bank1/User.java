package bank1;

public class User {
    public String fristName;
    public String lastName;
    public String dateOfBrith;
    public String moblieNumber;
    public String adhar;
    public Address address;

    @Override
    public String toString() {
        return "User{" +
                "fristName='" + fristName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBrith='" + dateOfBrith + '\'' +
                ", moblieNumber='" + moblieNumber + '\'' +
                ", adhar='" + adhar + '\'' +
                ", address=" + address +
                '}';
    }
}
