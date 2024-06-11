package loan;

public class User {

        public String firstName;
        public String lastName;
        public String mobileNum;
        public String adharNum;
        public String age;
        public Address address;

        @Override
        public String toString() {
                return "User{" +
                        "firstName='" + firstName + '\'' +
                        ", lastName='" + lastName + '\'' +
                        ", mobileNum='" + mobileNum + '\'' +
                        ", adharNum='" + adharNum + '\'' +
                        ", age='" + age + '\'' +
                        ", address=" + address +
                        '}';
        }
}

