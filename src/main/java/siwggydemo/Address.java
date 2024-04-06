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
    }

