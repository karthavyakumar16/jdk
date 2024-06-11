package swiggyfinal;

import java.util.ArrayList;
import java.util.List;

public class Swiggy {
    public List<Restaurant> restaurants;

    public Swiggy() {
        this.restaurants = new ArrayList<>();
    }

    public List<Restaurant> getRestaurants() {
        return restaurants;
    }


    public void addRestaurant(Restaurant restaurant){
        restaurants.add(restaurant);
    }
}
