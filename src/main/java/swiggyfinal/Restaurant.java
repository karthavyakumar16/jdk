package swiggyfinal;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    public String name;
    public String rating;
    public List<Dish> dishList=new ArrayList<>();
public Address address;

    public Restaurant(String name,Address address) {
        this.name=name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", rating='" + rating + '\'' +
                ", dishList=" + dishList +
                ", address=" + address +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getRating() {
        return rating;
    }

    public List<Dish> getDishList() {
        return dishList;
    }

    public Address getAddress() {
        return address;
    }
}
