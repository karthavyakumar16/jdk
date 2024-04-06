package siwggydemo;

import java.util.List;

public class Resturant {

        public String name;

        public double rating;
        public Address address;

        public List<Dishes> dishesList;

        @Override
        public String toString() {
            return "\n Resturant{" +
                    "name='" + name + '\'' +
                    ", rating=" + rating +
                    ", address=" + address +
                    ", dishesList=" + dishesList +
                    '}';
        }
    }

