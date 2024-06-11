package siwggydemo;

import java.util.List;
import java.util.Objects;

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

    @Override
    public boolean equals(Object obj) {
            if(this==obj){
                return true;


            }
            if(this.getClass()!=obj.getClass()){
                return false;
            }
            Resturant resturant=(Resturant) obj;
            return this.name.equals(resturant.name);
    }


}

